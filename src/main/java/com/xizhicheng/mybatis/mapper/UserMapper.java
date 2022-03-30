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

    User findByName(String name);
    User findById(Integer id);
    int insert(String name, Integer age);

    List<User> getUserInfoByName(String name);

    void insertUser(User user);

    void deleteUserById(Integer id);

    void updateUserById(User user);

    List<User> getUserInfoList(UserQueryReq req);

    Integer batchInsert(List<BatchInsertUserRequest> list);

    void batchUpdate(List<BatchUpdateRequset> list);
}
