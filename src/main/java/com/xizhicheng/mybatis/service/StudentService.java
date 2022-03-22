package com.xizhicheng.mybatis.service;

import com.xizhicheng.mybatis.dto.request.StudentCreatReq;
import com.xizhicheng.mybatis.entity.Student;

public interface StudentService {

    Student getStudentInfo(Integer sid);

    void addStudentInfo(StudentCreatReq req);

    void deleteStudentInfo(Integer sid);

    void updateStudentInfo(StudentCreatReq req);
}
