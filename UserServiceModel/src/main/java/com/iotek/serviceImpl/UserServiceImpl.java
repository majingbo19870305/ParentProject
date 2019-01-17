package com.iotek.serviceImpl;

import com.iotek.mapper.UserMapper;
import com.iotek.pojo.User;
import com.iotek.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int register(User user) {
        return userMapper.register(user);
    }
}
