package com.liujl.controller;

import java.io.PrintWriter;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.liujl.entity.User;
@Controller
@RequestMapping(value="/user")
public class UserController {
	@RequestMapping(value="/to_saveUser",method=RequestMethod.GET)
	public String to_saveUser(){
		
		return "user/add_users";
	}
	
	@RequestMapping(value="/saveUser",method=RequestMethod.POST)
	@ResponseBody
	public String saveUser(@RequestBody User users){
//		for(User u:users){
//			System.out.println(u);
//		}
		Gson gson=new Gson();
		String jsonStr=gson.toJson(users);
		System.out.println(jsonStr);
		return jsonStr;
//		out.print(jsonStr);//返回值为void时，可以直接使用 PrintWriter out向外输出
//		out.flush();
	}
	
}


/**
 * SpringMVC @RequestBody接收Json对象字符串
 * http://www.cnblogs.com/quanyongan/archive/2013/04/16/3024741.html
 */
