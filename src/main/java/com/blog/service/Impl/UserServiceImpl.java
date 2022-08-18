package com.blog.service.Impl;

import com.blog.mapper.UserMapper;
import com.blog.po.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    //登录操作
    public String login(User user){
        try{
            User usn = userMapper.selectByName(user.getUsername());
            User psw=userMapper.selectByName(user.getUsername());
            if (usn==null){
                return "用户名不能为空";}
            else
            if (psw.getUsername().equals(user.getPassword())){
                return "登录成功";
            }else return "密码错误，请重新输入";
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }

    //注册
    public String register(User user){
        try {
            User usnn = userMapper.selectByName(user.getUsername());
            if (user.getUsername()==null){
                return "用户名不能为空";
            }else if (user.getPassword()==null){
                return "密码不能为空";
            }else if (usnn.getUsername().equals(user.getUsername())) {
                return "账号已存在";
            }else {
                userMapper.save(user);
                return "注册成功";
            }
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }










    @Override
    public void addUser(User user) {

    }

    @Override
    public User selectByName(String username) {
        return null;
    }

    @Override
    public User selectByid(Integer userid) {
        return null;
    }
}
