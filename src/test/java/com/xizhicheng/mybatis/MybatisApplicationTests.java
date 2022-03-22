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

import java.util.ArrayList;
import java.util.Scanner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void test2() throws Exception {
//        userMapper.insert("BBB", 22);
        User u = userMapper.findByName("AAA");
//        Assert.assertEquals(22, u.getAge().intValue());
    }


    @Test
    public void test1() throws Exception {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();

        lo:
        while (true){
            System.out.println("............欢迎来到小治学生管理系统............");
            System.out.println("1 添加学生信息");
            System.out.println("2 删除学生信息");
            System.out.println("3 修改学生信息");
            System.out.println("4 查看学生信息");
            System.out.println("5 退出系统");
            System.out.println("请输入您的选择");

            String choice = sc.next();

            switch (choice) {
                case "1":
//                    System.out.println("11111");
                    //addStudnt(list);
                    break;
                case "2":
                    System.out.println("22222");
                    break;
                case "3":
                    System.out.println("33333");
                    break;
                case "4":
                    System.out.println("44444");
                    break;
                case "5":
                    System.out.println("5555");
                    break lo;
                default:
                    System.out.println("6666");
                    break;
            }
        }


    }


}
