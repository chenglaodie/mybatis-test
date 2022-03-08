package com.xizhicheng.mybatis.service.impl;

import com.xizhicheng.mybatis.dto.request.UserCreatReq;
import com.xizhicheng.mybatis.entity.User;
import com.xizhicheng.mybatis.mapper.UserMapper;
import com.xizhicheng.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserInfo(Integer id) {
        User user = userMapper.findById(id);
        return user;
    }

    @Override
    public List<User> getUserInfoByName(String name) {
        List<User> userList = userMapper.getUserInfoByName(name);
        return userList;
    }

    @Override
    public void insertUserInfo(UserCreatReq req) {
        User user = new User();
        user.setAge(req.getAge());
        user.setName(req.getName());
        user.setPwd(req.getPwd());
        userMapper.insertUser(user);
    }

}
