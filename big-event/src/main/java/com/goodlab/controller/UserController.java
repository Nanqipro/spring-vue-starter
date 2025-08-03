package com.goodlab.controller;

import com.goodlab.pojo.Result;
import com.goodlab.pojo.User;
import com.goodlab.service.UserService;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public Result register(@Pattern(regexp = "^[a-zA-Z0-9_-]{5,16}$", message = "用户名格式错误") String username, @Pattern(regexp = "^[a-zA-Z0-9_-]{5,16}$", message = "密码格式错误") String password) {

//        // 校验用户名是否符合要求  5~16位非空字符
//        if (username != null && username.length() >= 5 && username.length() <= 16 && password != null &&
//                password.length()>=5 && password.length() <= 16){
//            //查询用户
//            User u = userService.findByUserName(username);
//            if (u == null) {
//                // 没被占用
//                // 注册
//                userService.register(username, password);
//                return Result.success();
//            }else{
//                // 被占用
//                return Result.error("用户名被占用");
//            }
//
//        }else{
//            return Result.error("参数不合法！");
//        }

        //查询用户
        User u = userService.findByUserName(username);
        if (u == null) {
            // 没被占用
            // 注册
            userService.register(username, password);
            return Result.success();
        }else{
            // 被占用
            return Result.error("用户名被占用");
        }

    }
}
