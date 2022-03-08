package com.xizhicheng.mybatis.controller;

import com.xizhicheng.mybatis.dto.request.UserCreatReq;
import com.xizhicheng.mybatis.entity.User;
import com.xizhicheng.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 根据ID查询用户信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/getUserInfo/{id}", method = RequestMethod.GET)
    public User getUserInfo(@PathVariable Integer id) {
        User user = userService.getUserInfo(id);
        return user;
    }

    /**
     * 根据用户名查询用户信息
     * @param name
     * @return
     */
    @RequestMapping(value = "/getUserInfoByName/{name}", method = RequestMethod.GET)
    public List<User> getUserInfoByName(@PathVariable String name) {
        List<User> userList = userService.getUserInfoByName(name);
        return userList;
    }

    @RequestMapping(value = "/insertUserInfo", method = RequestMethod.POST)
    public void insertUserInfo(@RequestBody UserCreatReq req) {
        userService.insertUserInfo(req);
    }


}
