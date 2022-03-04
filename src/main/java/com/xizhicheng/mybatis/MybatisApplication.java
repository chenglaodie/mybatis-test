package com.xizhicheng.mybatis;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.xizhicheng.mybatis.mapper")
@SpringBootApplication
public class MybatisApplication {

	public static void main(String[] args) {

		SpringApplication.run(MybatisApplication.class, args);
	}

}
