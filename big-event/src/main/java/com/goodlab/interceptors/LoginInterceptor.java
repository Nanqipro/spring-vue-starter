package com.goodlab.interceptors;


import com.goodlab.pojo.Result;
import com.goodlab.utils.JwtUtil;
import com.goodlab.utils.ThreadLocalUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Map;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private StringRedisTemplate StringRedisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{

        // 令牌验证
        String token = request.getHeader("Authorization");
        // 验证token
        try {
            //从redis 中获取相同的令牌token
            ValueOperations<String, String> ops = StringRedisTemplate.opsForValue();
            String redisToken = ops.get(token);
            if (redisToken== null) {
                // 令牌无效
                throw new RuntimeException("令牌无效");
            }



            Map<String, Object> claims = JwtUtil.parseToken(token);

            // 把业务数据存储到ThreadLocal中
            ThreadLocalUtil.set(claims);

            return true ;
        } catch (Exception e) {
            // http 401
            response.setStatus(401);
            return false;
        }

    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        ThreadLocalUtil.remove();
    }
}
