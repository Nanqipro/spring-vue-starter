package com.itheima.ai.controller;

import com.itheima.ai.repository.ChatHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

import static org.springframework.ai.chat.client.advisor.AbstractChatMemoryAdvisor.CHAT_MEMORY_CONVERSATION_ID_KEY;

@RequiredArgsConstructor
@RestController
@RequestMapping("/ai")
public class CustomerServiceController {

    private final ChatClient serviceChatClient;

    private final ChatHistoryRepository chatHistoryRepository;

    @RequestMapping(value = "/service", produces = "text/html;charset=utf-8")
    public Flux<String> service(String prompt, String chatId) {
        // 1.保存会话id
        chatHistoryRepository.save("service", chatId);
        // 2.请求模型
        if (!StringUtils.hasText(prompt)) {
            return Flux.just("请描述要咨询的问题。");
        }
        String toolChoice = shouldForceTool(prompt) ? "required" : "auto";
        return serviceChatClient.prompt()
                .user(prompt)
                .options(OpenAiChatOptions.builder().internalToolExecutionEnabled(true).toolChoice(toolChoice).build())
                .advisors(a -> a.param(CHAT_MEMORY_CONVERSATION_ID_KEY, chatId))
                .stream()
                .content()
                .filter(StringUtils::hasText)
                .switchIfEmpty(Flux.just("系统未能生成回复，请稍后重试。"));
    }

    private boolean shouldForceTool(String prompt) {
        if (!StringUtils.hasText(prompt)) {
            return false;
        }
        List<String> keywords = List.of("课程", "校区", "预约", "试听", "报名", "学费", "价格", "费用", "上课", "老师");
        return keywords.stream().anyMatch(prompt::contains);
    }
}
