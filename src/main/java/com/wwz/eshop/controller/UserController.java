package com.wwz.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.User;
import com.wwz.eshop.service.UserService;
import com.wwz.eshop.util.Page;

/**
 * @Description: 用户控制器
 * @author: wwz
 * @date: 2019年3月3日 下午9:39:19
 */
@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	//跳到前台个人信息界面
	@RequestMapping("/personalCenter")
	public String personalCenter() 
	{
		
		return "fore/information";
	}
	
	
	/**
	 * 下面是后台管理系统的控制器
	 */
	
	//跳到后台用户列表界面
	@RequestMapping("/back/userList")
	public String  userList(ModelMap modelMap,Page page) 
	{
		//如果开始位置start小于0，则置0
		if(page.getStart()<0) {
			page.setStart(0);
		}
		
		//如果开始位置start大于总数，则置为最后一页开始位置
		if(page.getStart()>=page.getTotal()) {
			page.setStart(page.getLast());
		}
		
		//在查询所有数据之前调用pagehelper,参数为开始位置和每页个数
		PageHelper.offsetPage(page.getStart(),page.getCount());
		//查询
		List<User> users=userService.selectAllUser();
		//通过总数计算最后一页开始位置
		page.setTotal((int) new PageInfo<User>(users).getTotal());
		page.caculateLast(page.getTotal());
				
		//设置页码
		page.setUpIndex(page.getStart(), page.getCount());
		
		modelMap.addAttribute("users", users);
		return "back/userList";
	}
	
	//查看用户详情
	@RequestMapping("/back/userDetail")
	public String userDetail(int id,ModelMap modelMap)
	{
		User user=userService.getUserById(id);
		modelMap.addAttribute("user", user);
		return "back/userDetail";
	}
	
	//删除用户
	@RequestMapping("/back/deleteUser")
	public String deleteUser(int id) throws CustomException
	{
		userService.deleteUser(id);
		return "redirect:/back/userList";
	}
	
}
