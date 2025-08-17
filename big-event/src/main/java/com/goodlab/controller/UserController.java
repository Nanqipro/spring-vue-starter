package com.goodlab.controller;

import com.goodlab.pojo.Result;
import com.goodlab.pojo.User;
import com.goodlab.service.UserService;
import com.goodlab.utils.JwtUtil;
import com.goodlab.utils.Md5Util;
import com.goodlab.utils.ThreadLocalUtil;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private StringRedisTemplate StringRedisTemplate;
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

    // 登录方法
    @PostMapping("/login")
    public Result<String> login(@Pattern(regexp = "^[a-zA-Z0-9_-]{5,16}$", message = "用户名格式错误") String username, @Pattern(regexp = "^[a-zA-Z0-9_-]{5,16}$", message = "密码格式错误") String password) {
        // 根据用户名查询用户
        User loginUser = userService.findByUserName(username);
        // 判断用户名是否存在
        if(loginUser == null){
            return Result.error("用户名不存在");
        }


        // 判断密码是否正确  loginUser 中的密码是密文
        if(Md5Util.getMD5String(password).equals(loginUser.getPassword())){

            Map<String, Object> claims = new HashMap<>();
            claims.put("id", loginUser.getId());
            claims.put("username", loginUser.getUsername());
            String token = JwtUtil.genToken(claims);
            // 把token存储到redis中
            ValueOperations<String, String> valueOperations = StringRedisTemplate.opsForValue();
            valueOperations.set(token ,token, 1000 * 60 * 60 * 12);

            return Result.success(token);
        }else{
            return Result.error("密码错误");
        }
    }

    @GetMapping("/userInfo")
    public Result<User> userInfo(/*@RequestHeader(name = "Authorization") String token*/) {
        // 根据用户名查询用户

//        Map<String, Object> map = JwtUtil.parseToken(token);
//        String username = (String) map.get("username");
        Map<String, Object> map =  ThreadLocalUtil.get();
        String username = (String) map.get("username");
        User user = userService.findByUserName(username);
        return Result.success(user);
    }

    // 更新用户信息
    @PutMapping("/update")
    public Result update(@RequestBody @Validated User user){
        userService.update(user);
        return Result.success();
    }
    // 更新用户头像
    @PatchMapping("/updateAvatar")
    public Result updateAvatar(@RequestParam @URL String avatarUrl){
        // 获取用户id
        userService.updateAvatar(avatarUrl);
        return Result.success();
    }

    // 更新密码
    @PatchMapping("/updatePwd")
    public Result updatePwd(@RequestBody  Map<String, String> params, @RequestHeader("Authorization") String  token){
        // 校验参数
        String oldPwd = params.get("old_pwd");
        String newPwd = params.get("new_pwd");
        String rePwd = params.get("re_pwd");
        if(!StringUtils.hasLength(oldPwd) || !StringUtils.hasLength(newPwd) || !StringUtils.hasLength(rePwd)){
            return Result.error("参数缺失！");
        }
        // 验证密码是否正确
        // 调用 userService 根据用户名拿到原密码 再和old_pwd进行比较

        Map<String, Object> map =  ThreadLocalUtil.get();
        String username = (String) map.get("username");

        User loginUser = userService.findByUserName(username);
        if(!Md5Util.getMD5String(oldPwd).equals(loginUser.getPassword())){
            return Result.error("原密码错误");
        }
        // 校验 new_pwd 和 re_pwd 是否一致
        if(!newPwd.equals(rePwd)){
            return Result.error("新密码不一致");
        }


        // 调用userService完成密码更新
        userService.updatePwd(newPwd);
        // 删除redis中的token
        ValueOperations<String, String> valueOperations = StringRedisTemplate.opsForValue();
        valueOperations.getOperations().delete(token);

        return Result.success();
    }

}
