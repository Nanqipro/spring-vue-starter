package com.goodlab.service;

import com.goodlab.pojo.User;

public interface UserService {

    // 根据用户名查询用户信息
    User findByUserName(String username);
    // 注册用户
    void register(String username, String password);
    // 更新用户数据
    void update(User user);
    // 更新用户头像
    void updateAvatar(String avatarUrl);
    // 修改密码
    void updatePwd(String newPwd);
}
