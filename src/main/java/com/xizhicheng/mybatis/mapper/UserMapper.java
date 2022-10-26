package com.xizhicheng.mybatis.mapper;

import com.xizhicheng.mybatis.dto.request.BatchInsertUserRequest;
import com.xizhicheng.mybatis.dto.request.BatchUpdateRequset;
import com.xizhicheng.mybatis.dto.request.UserQueryReq;
import com.xizhicheng.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    // 根据用户名查询用户信息
    User findByName(String name);
    // 插入一条用户信息
    void insertUser(User user);
    // 根据ID查询用户信息
    User findById(Integer id);
    // 根据用户名查询用户信息
    List<User> getUserInfoByName(String name);
    // 根据ID删除用户信息
    void deleteUserById(Integer id);
    // 根据ID更新用户信息
    void updateUserById(User user);
    // 批量查詢用户信息
    List<User> getUserInfoList(UserQueryReq req);
    // 批量插入用户信息
    Integer batchInsert(List<BatchInsertUserRequest> list);
    // 批量更新用户信息
    int batchUpdate(List<BatchUpdateRequset> list);

}
