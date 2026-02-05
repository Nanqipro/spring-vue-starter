package com.itheima;

import dev.langchain4j.model.openai.OpenAiChatModel;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //2.构建OpenAiChatModel对象
        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("https://api.siliconflow.cn/v1")
                .apiKey("sk-kgklueezfnyupqvnuclkjnzwqhjmetxcbxwzcgdhulpbezue")
                .modelName("moonshotai/Kimi-K2-Thinking")
                .logRequests(true)
                .logResponses(true)
                .build();

        //3.调用chat方法,交互
        String result = model.chat("东哥帅不帅?");
        System.out.println(result);
    }
}
