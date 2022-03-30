package com.xizhicheng.mybatis.mapper;

import com.xizhicheng.mybatis.dto.request.BatchInsertStudentRequset;
import com.xizhicheng.mybatis.dto.request.BatchInsertUserReq;
import com.xizhicheng.mybatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {

    Student findByStSid(Integer id);

    void addStudent(Student student);

    void deleteStudent(Integer sid);

    void updateStudent(Student student);

    int batchInsertStudent(List<BatchInsertStudentRequset> list);
}
