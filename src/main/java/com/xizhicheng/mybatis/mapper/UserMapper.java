package com.xizhicheng.mybatis.mapper;

import com.xizhicheng.mybatis.entity.User;


/**
 * Created by 程序猿DD/翟永超 on 2020/2/28.
 * <p>
 * Blog: http://blog.didispace.com/
 * Github: https://github.com/dyc87112/
 */
public interface UserMapper {

    User findByName(String name);
    User findById(Integer id);
    int insert(String name, Integer age);

}
