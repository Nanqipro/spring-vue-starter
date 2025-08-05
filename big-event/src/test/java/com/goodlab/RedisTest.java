package com.goodlab;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.concurrent.TimeUnit;

@SpringBootTest   // 如果在测试类上添加了这个注解，那么将来在单元测试方法执行之前会先初始化Spring容器，并创建所有组件对象
public class RedisTest {
    @Autowired
    private StringRedisTemplate StringRedisTemplate ;
    @Test
    public void testSet() {
        // 往redis 中存储一个键值对  StringRedisTemplate
        ValueOperations<String, String> valueOperations = StringRedisTemplate.opsForValue();

        valueOperations.set("username", "goodlab");
        valueOperations.set("id", "1", 15, TimeUnit.SECONDS);

    }

    @Test
    public void testGet() {
        // 从redis 中获取一个键值对
        ValueOperations<String, String> valueOperations = StringRedisTemplate.opsForValue();
        String username = valueOperations.get("username");
        System.out.println(username);
    }
}
