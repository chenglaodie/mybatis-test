package com.xizhicheng.mybatis.mapper;

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
}
