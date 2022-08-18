package com.blog.service;

import com.blog.po.User;

public interface UserService {
    public void addUser(User user);

    public User selectByName(String username);

    public User selectByid(Integer userid);
}
