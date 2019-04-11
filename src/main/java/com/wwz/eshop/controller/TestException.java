package com.wwz.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.FirstCategory;
import com.wwz.eshop.service.FirstCategoryService;

/**
 * @Description: 测试全局异常处理
 * @author: wwz
 * @date: 2019年2月17日 下午2:04:30
 */
@Controller
public class TestException {
	
	@Autowired
	FirstCategoryService firstCategoryService;

	@RequestMapping("/test")
	public String test() throws CustomException
	{
		FirstCategory firstCategory=new FirstCategory();
		firstCategory.setName("dddddddddddddddddddddddsssssssssssssssssssssssssssssssffffffffffffffffffffffffffffffffffffffg");
		firstCategoryService.addFirstCategory(firstCategory);
		return "";
	}
	
}
