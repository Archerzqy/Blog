package com.blog.mapper;

import com.blog.po.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void addUser(User user);

    User selectByName(String username);

    User selectById(Integer userId);

    void save(User user);
}
