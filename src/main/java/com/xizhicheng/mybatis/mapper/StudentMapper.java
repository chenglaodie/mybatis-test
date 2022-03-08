package com.xizhicheng.mybatis.mapper;

import com.xizhicheng.mybatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Mapper
@Repository
public interface  StudentMapper {

    Student findByStSid(Integer id);
}
