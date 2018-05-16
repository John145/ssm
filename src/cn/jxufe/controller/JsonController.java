package cn.jxufe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jxufe.po.User;

@Controller
public class JsonController {
	@RequestMapping("/requestJson")
	public @ResponseBody User requestJson(@RequestBody User user) {
		System.out.println(user.toString());
		return user;
	}
	
	@RequestMapping("/responseJson")
	public @ResponseBody User responseJson(User user) {
		System.out.println(user.toString());
		return user;
	}
}
