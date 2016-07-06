package cn.springmvc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.User;
import cn.springmvc.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/")
public class UserController {
	@Resource
	private  UserServiceImpl userServiceImpl;
	@RequestMapping("index")
	public String index(){
		User user=userServiceImpl.selectUser(1);
		System.out.println(user);
		user=userServiceImpl.getById(2);
		System.out.println(user);
		return "index";
	}
	@RequestMapping("adduser")
	public String adduser(){
		User user=new User();
		user.setNickname("liuwish");
		user.setState(3);
		userServiceImpl.insertUser(user);
		return "index";
	}
	
}