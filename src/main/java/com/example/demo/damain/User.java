package com.example.demo.damain;

import java.util.Date;

/**
 * Created by Linchong on 2018/8/21.
 */
public class User {
    private Long id;
    private String nickname;
    private Integer age;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User() {
    }

    public User(String nickname, Integer age) {
        this.nickname = nickname;
        this.age = age;
    }
}
