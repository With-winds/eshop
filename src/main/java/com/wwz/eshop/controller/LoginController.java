package com.wwz.eshop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.Admin;
import com.wwz.eshop.pojo.User;
import com.wwz.eshop.service.AdminService;
import com.wwz.eshop.service.UserService;

/**
 * @Description: 登录控制器
 * @author: wwz
 * @date: 2019年3月3日 下午9:39:19
 */
@Controller
public class LoginController {
	@Autowired
	UserService userService;
	
	@Autowired
	AdminService adminService;
	
	//跳转到登录界面
	@RequestMapping(value="/toLogin",method=RequestMethod.GET)
	public String toLogin()
	{
		return "fore/login";
	}
	
	//登录成功跳转到主界面
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(User u,HttpSession session) throws CustomException
	{
		User user=userService.getUser(u);
		if (user==null) {
			return "fore/login";
		}
		session.setAttribute("user", user);
		//判断beforePath是否有请求的URL，有的话取出来跳转
		String beforePath=(String) session.getAttribute("beforePath");
		if(beforePath!=null) {
			
            return "redirect:"+beforePath;

        }
		return "redirect:/index";
	}
	
	
	/**
	 * @Description: 下面的是后台控制器
	 */
	
	//跳转到后台登录界面
	@RequestMapping(value="/back/toLogin",method=RequestMethod.GET)
	public String toLoginBack()
	{
		return "back/login";
	}
	
	//登录成功跳转到主界面
	@RequestMapping(value="/back/login",method=RequestMethod.POST)
	public String loginBack(Admin a,HttpSession session) throws CustomException
	{
		Admin admin=adminService.getAdmin(a);
		if (admin==null) {
			return "back/login";
		}
		session.setAttribute("admin", admin);
		
		return "redirect:/home";
	}
}
