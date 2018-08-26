package com.example.demo.mapper;

import com.example.demo.damain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Linchong on 2018/8/21.
 */

/**
 * #和$的区别
 * #{}在预编译的时候会用一个占位符?代替
 * ${}则只是简单的字符串替换，存在SQL注入的风险
 */

public interface UserMapper {
    @Insert("insert into t_user(nickname,age) values(#{nickname},#{age})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    int insert(User user);

    @Select("SELECT * FROM t_user")
    @Results({
            @Result(column = "create_time",property = "createTime")  //javaType = java.util.Date.class
    })
    List<User> getAll();

    @Select("SELECT * FROM t_user WHERE id = #{id}")
    @Results({
            @Result(column = "create_time",property = "createTime")
    })
    User findById(Long id);

    @Update("UPDATE t_user SET nickname=#{nickname} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM t_user WHERE id =#{userId}")
    void delete(Long userId);
}
