package com.atguigu.compact.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.atguigu")
@MapperScan("com.atguigu.**.mapper")
@EnableTransactionManagement
public class CompactServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompactServiceApplication.class, args);
	}
}
