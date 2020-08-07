package com.tbh.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 执行命令：mvn spring-javaformat:apply 解决格式化的问题。
 *
 * 执行命令：mvn idea:idea 创建idea项目
 */
@SpringBootApplication
public class MySpringBootDemo {
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootDemo.class);
	}
}
