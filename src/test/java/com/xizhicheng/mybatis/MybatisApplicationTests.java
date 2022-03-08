package com.xizhicheng.mybatis;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.xizhicheng.mybatis.entity.Student;
import com.xizhicheng.mybatis.entity.User;
import com.xizhicheng.mybatis.mapper.StudentMapper;
import com.xizhicheng.mybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;
//    @Autowired
//    private StudentMapper studentMapper;

    @Test
    public void test() throws Exception {
//        userMapper.insert("BBB", 22);
        User u = userMapper.findByName("AAA");
//        Assert.assertEquals(22, u.getAge().intValue());
    }


//    @Test
//    public void test1() throws Exception {
////        userMapper.insert("BBB", 22);
//        Student student = studentMapper.findByStSid(1);
////        Assert.assertEquals(22, u.getAge().intValue());
//    }

}
