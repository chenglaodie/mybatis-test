package com.xizhicheng.mybatis.service;

import com.xizhicheng.mybatis.dto.request.*;
import com.xizhicheng.mybatis.entity.User;

import java.util.List;

public interface UserService {

    User getUserInfo(Integer id);

    List<User> getUserInfoByName(String name);

    void insertUserInfo(UserCreatReq req);

    void deleteUserInfo(Integer id);

    void updateUserInfo(UserUpdateReq req);

    List<User> getUserInfoList(UserQueryReq req);

    Integer batchInsert(BatchInsertUserReq req);

    void batchUpdate(BatchUpdateReq req);
}
