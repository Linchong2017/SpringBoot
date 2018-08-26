package com.example.demo.service.impl;

import com.example.demo.damain.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Linchong on 2018/8/21.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Long addUser(User user) {
        userMapper.insert(user);
        Long id = user.getId();
        return id;
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(Long userId) {
        userMapper.delete(userId);
    }
}
