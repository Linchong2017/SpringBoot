package com.example.demo.controller;

import com.example.demo.damain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Linchong on 2018/8/21.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/regist")
    public String regist() {
        return "index";
    }

    @RequestMapping(value="/add",method = RequestMethod.POST)
    @ResponseBody
    public User add(String nickname,int age) {
        User user  = new User(nickname,age);
        userService.addUser(user);
        return user;
    }

    @GetMapping("find_all")
    @ResponseBody
    public List<User> findAll(){
        return userService.getAll();
    }

    @GetMapping("find_by_Id")
    @ResponseBody
    public User findById(long id){
        return userService.findById(id);
    }

    @GetMapping("del_by_id")
    @ResponseBody
    public Object delById(long id){
        userService.delete(id);
        return "success";
    }

    @GetMapping("update")
    @ResponseBody
    public Object update(String name,long id){
        System.out.println("aaa");
        User user = new User();
        user.setNickname(name);
        user.setId(id);
        userService.update(user);
        return user;
    }
}
