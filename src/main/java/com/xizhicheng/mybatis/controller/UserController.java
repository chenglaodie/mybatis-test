package com.xizhicheng.mybatis.controller;

import com.xizhicheng.mybatis.dto.request.*;
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

    /**
     * 获取批量用户信息
     * @param req
     * @return
     */
    @RequestMapping(value = "/getUserInfoList", method = RequestMethod.POST)
    public List<User> getUserInfoList(@RequestBody UserQueryReq req) {
        List<User> userList = userService.getUserInfoList(req);
        return userList;
    }

    /**
     * 批量插入用户信息
     * @param req
     * @return
     */
    @RequestMapping(value = "/batchInsert", method = RequestMethod.POST)
    public Integer batchInsert(@RequestBody BatchInsertUserReq req) {
        Integer userCount = userService.batchInsert(req);
        return userCount;
    }

    /**
     * 插入用户信息
     * @param req
     */
    @RequestMapping(value = "/insertUserInfo", method = RequestMethod.POST)
    public void insertUserInfo(@RequestBody UserCreatReq req) {
        userService.insertUserInfo(req);
    }

    /**
     *删除一条用户信息
     * @param id
     */
    @RequestMapping(value = "/deleteUserInfo/{id}", method = RequestMethod.DELETE)
    public void deleteUserInfo(@PathVariable Integer id) {
        userService.deleteUserInfo(id);
    }

    /**
     * 修改一条用户信息
     * @param req
     */
    @RequestMapping(value = "/putUserInfo", method = RequestMethod.PUT)
    public void updateUserInfo(@RequestBody UserUpdateReq req) {
        userService.updateUserInfo(req);
    }

    /**
     *修改多条用户信息
     * @param req
     * @return
     */
    @RequestMapping(value = "/batchUpdate", method = RequestMethod.PUT)
    public void batchUpdate(@RequestBody BatchUpdateReq req) {
            userService.batchUpdate(req);
    }

}
