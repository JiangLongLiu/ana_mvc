package com.liujl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/test")
public class TestController {
	@RequestMapping(value="/tostart",method=RequestMethod.GET)
	public String toStart(){
		System.out.println("tostart page");
		return "tostart";
	}
	
	@RequestMapping(value="/start",method=RequestMethod.POST)
	public String start(@RequestParam String userName,@RequestParam String passWord,Model model){
		System.out.println("start page");
		model.addAttribute("userName", userName);
		model.addAttribute("passWord",passWord);
		return "start";
	}
}
