package com.wwz.eshop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 后台主页控制器
 * @author: wwz
 * @date: 2019年3月21日 下午10:14:55
 */
@Controller
public class HomeController {
	
	//跳转到首页
	@RequestMapping("/home")
	public String home()
	{
		return "back/home";
	}
	
	//加载欢迎界面
	@RequestMapping("/back/welcome")
	public String welcome()
	{
		return "back/welcome";
	}
	
	//后台退出登录
	@RequestMapping("/back/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "redirect:/home";
	}
}
