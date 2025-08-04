package com.goodlab.service.impl;

import com.goodlab.mapper.UserMapper;
import com.goodlab.pojo.User;
import com.goodlab.service.UserService;
import com.goodlab.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUserName(String username) {
        User u = userMapper.findByUserName(username);
        return u;
    }

    @Override
    public void register(String username, String password) {
        // 加密， 将明文改成密文
        String md5String = Md5Util.getMD5String(password);

        // 添加
        userMapper.add(username, md5String);
    }

    @Override
    public void update(User user) {
        user.setUpdateTime(LocalDateTime.now());
        userMapper.update(user);

    }
}
