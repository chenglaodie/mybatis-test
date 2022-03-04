package com.xizhicheng.mybatis.service;

import com.xizhicheng.mybatis.entity.User;

import java.util.List;

public interface UserService {

    User getUserInfo(Integer id);

    List<User> getUserInfoByName(String name);
}
