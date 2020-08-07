package com.tbh.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Parameter;

@Controller
public class controller {
	@RequestMapping("/hello.do")
	@ResponseBody
	//springmvc  参数绑定  注解和非注解
	//非注解的时候判断是用的java8 Parameter 还是asm操作字节码实现
	public String hello(String name){
		return name+"test";
	}
}
