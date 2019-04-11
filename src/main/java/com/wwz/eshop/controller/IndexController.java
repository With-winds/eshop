package com.wwz.eshop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wwz.eshop.pojo.FirstCategory;
import com.wwz.eshop.service.FirstCategoryService;

/**
 * @Description: 主页控制器
 * @author: wwz
 * @date: 2019年2月17日 下午4:28:11
 */
@Controller
public class IndexController {
	
	@Autowired
	FirstCategoryService firstCategoryService;
	
	//跳转到eshop主页
	@RequestMapping("/index")
	public String index(ModelMap modelMap)
	{
		//查询所有的一级分类
		List<FirstCategory> firstCategories=firstCategoryService.selectFirstCategoryMap();
		//将一级分类列表存入request
		modelMap.addAttribute("firstCategories", firstCategories);
		return "fore/index";
	}
	
	//退出登录
	@RequestMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "redirect:/index";
	}
	
}
