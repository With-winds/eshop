package com.wwz.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.Admin;
import com.wwz.eshop.service.AdminService;
import com.wwz.eshop.util.Page;

/**
 * @Description: 管理员控制器
 * @author: wwz
 * @date: 2019年3月31日 下午6:59:13
 */
@Controller
public class AdminController {

	@Autowired
	AdminService adminService;
	
	//跳到前台个人信息界面
	@RequestMapping("/back/personalCenter")
	public String personalCenter() 
	{
		
		return "back/personalCenter";
	}
	
	//跳到后台管理员列表界面
	@RequestMapping("/back/adminList")
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
		List<Admin> admins=adminService.selectAllAdmin();
		//通过总数计算最后一页开始位置
		page.setTotal((int) new PageInfo<Admin>(admins).getTotal());
		page.caculateLast(page.getTotal());
				
		//设置页码
		page.setUpIndex(page.getStart(), page.getCount());
		
		modelMap.addAttribute("admins", admins);
		return "back/adminList";
	}
	
	//查看管理员详情
	@RequestMapping("/back/adminDetail")
	public String adminDetail(int id,ModelMap modelMap)
	{
		Admin admin=adminService.getAdminById(id);
		modelMap.addAttribute("admin", admin);
		return "back/adminDetail";
	}
	
	//删除管理员
	@RequestMapping("/back/deleteAdmin")
	public String deleteAdmin(int id) throws CustomException
	{
		adminService.deleteAdmin(id);
		return "redirect:/back/adminList";
	}
	
	
}
