package com.example.demo.service;

import com.example.demo.damain.User;

import java.util.List;

/**
 * Created by Linchong on 2018/8/21.
 */
public interface UserService {
    public Long addUser(User user);
    public List<User> getAll();
    User findById(Long id);
    void update(User user);
    void delete(Long userId);
}
