package com.xizhicheng.mybatis.controller;

import com.xizhicheng.mybatis.entity.Student;
import com.xizhicheng.mybatis.entity.User;
import com.xizhicheng.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/getStudentInfo/{sid}", method = RequestMethod.GET)
    public Student getStudentInfo(@PathVariable Integer sid) {
        Student student = studentService.getStudentInfo(sid);
        return student;
    }
}
