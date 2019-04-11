package com.wwz.eshop.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.Admin;
import com.wwz.eshop.pojo.User;
import com.wwz.eshop.service.AdminService;
import com.wwz.eshop.service.UserService;

/**
 * @Description: 注册控制器
 * @author: wwz
 * @date: 2019年3月3日 下午9:39:19
 */
@Controller
public class RegisterController {
	@Autowired
	UserService userService;
	
	@Autowired
	AdminService adminService;
	
	//跳转到注册界面
	@RequestMapping(value="/toRegister")
	public String toRegister()
	{
		return "fore/register";
	}
	
	//添加用户--注册
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(User user) throws CustomException
	{
		userService.addUser(user);
		return "redirect:/toLogin";
	}
	
	//检查用户名是否可用，返回true,证明用户不存在，可用；反之不可用（注册验证）
	@ResponseBody
	@RequestMapping(value="/checkUserNotExist",method=RequestMethod.GET)
	public String checkUserNotExist(String username)
	{
		boolean flag=true;
		String stringJson=null;
		User user=userService.selectByUsername(username);
		if (user!=null) {      //如果用户存在，则设flag为true
			flag=false;
		}
		Map<String, Boolean> map=new HashMap<String,Boolean>();
		map.put("valid", flag);
		try {
			stringJson=new ObjectMapper().writeValueAsString(map);
		} 
		catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return stringJson;
	}
	
	
	/**
	 * 下面是后台控制器
	 */
	
	//跳转到后台注册界面
	@RequestMapping(value="/back/toRegister")
	public String toRegisterBack()
	{
		return "back/register";
	}
	
	//添加管理员--注册
	@RequestMapping(value="/back/register",method=RequestMethod.POST)
	public String registerBack(Admin admin) throws CustomException
	{
		adminService.addAdmin(admin);
		return "redirect:/back/toLogin";
	}
	
	//检查管理员用户名是否可用，返回true,证明用户不存在，可用；反之不可用（注册验证）
	@ResponseBody
	@RequestMapping(value="/back/checkUserNotExist",method=RequestMethod.GET)
	public String checkUserNotExistBack(String username)
	{
		boolean flag=true;
		String stringJson=null;
		Admin admin=adminService.selectByUsername(username);
		if (admin!=null) {      //如果用户存在，则设flag为true
			flag=false;
		}
		Map<String, Boolean> map=new HashMap<String,Boolean>();
		map.put("valid", flag);
		try {
			stringJson=new ObjectMapper().writeValueAsString(map);
		} 
		catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return stringJson;
	}
}
