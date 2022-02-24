package com.xizhicheng.mybatis.controller;

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


    @RequestMapping(value = "/getUserInfo/{id}", method = RequestMethod.GET)

    public User getUserInfo(@PathVariable Integer id) {
        User user = userService.getUserInfo(id);
        return user;
    }
}
