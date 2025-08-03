package com.goodlab;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtTest {
    @Test
    public void testGen(){
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", "1");
        claims.put("username", "admin");

        // 生成 jwt 代码
        String token = JWT.create()
                .withClaim("user", claims) // 添加载荷
                .withExpiresAt(new Date(System.currentTimeMillis()+1000*60*60*12)) // 设置过期时间
                .sign(Algorithm.HMAC256("bigevent")); // 加密签名，指定算法，配置密钥

        System.out.println(token);

    }

    @Test
    public void testParse(){

        // 定义字符串模拟用户传递过来的token
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7ImlkIjoiMSIsInVzZXJuYW1lIjoiYWRtaW4ifSwiZXhwIjoxNzU0MjcwMzc3fQ.TqIjvEs7L5g8nlkRSUC-nY3fsdfZ9yB7op1Ho3ZCzCo";
        JWTVerifier jwtVerifier =  JWT.require(Algorithm.HMAC256("bigevent")).build();


        // 验证token
        DecodedJWT decodedJWT = jwtVerifier.verify(token);
        Map<String, Claim> claims = decodedJWT.getClaims();
        System.out.println(claims.get("user"));
    }






}
