package com.xizhicheng.mybatis.service.impl;

import com.xizhicheng.mybatis.dto.request.BatchInsertStudentReq;
import com.xizhicheng.mybatis.dto.request.BatchInsertStudentRequset;
import com.xizhicheng.mybatis.dto.request.BatchInsertUserReq;
import com.xizhicheng.mybatis.dto.request.StudentCreatReq;
import com.xizhicheng.mybatis.entity.Student;
import com.xizhicheng.mybatis.mapper.StudentMapper;
import com.xizhicheng.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public Student getStudentInfo(Integer sid) {
        Student student = studentMapper.findByStSid(sid);
        return student;
    }

    @Override
    public void addStudentInfo(StudentCreatReq req) {

        for (int i = 1; i < 1000; i++) {
            Student student = new Student();
            student.setSid(i);
            student.setAge(req.getAge() + i);
            student.setName(req.getName() + i);
            student.setBirthday(new Date());
            studentMapper.addStudent(student);
        }

    }

    @Override
    public void deleteStudentInfo(Integer sid) {
        studentMapper.deleteStudent(sid);
    }

    @Override
    public void updateStudentInfo(StudentCreatReq req) {
        Student student = new Student();
        student.setSid(req.getSid());
        student.setName(req.getName());
        student.setBirthday(new Date());
        student.setAge(req.getAge());
        studentMapper.updateStudent(student);
    }

    @Override
    public int batchInsertStudentInfo(BatchInsertStudentReq req) {
        List<BatchInsertStudentRequset> batchInsertStudentRequsetList = req.getBatchInsertStudentRequsetList();
        int countStudentSize = studentMapper.batchInsertStudent(batchInsertStudentRequsetList);
        return countStudentSize;
    }

}
