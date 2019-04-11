package com.wwz.eshop.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wwz.eshop.pojo.Category;
import com.wwz.eshop.pojo.FirstCategory;

/**
 * @Description: 一级分类测试类
 * @author: wwz
 * @date: 2019年2月17日 下午10:26:23
 */

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class FirstCategoryServiceTest {

	@Resource
	FirstCategoryService firstCategoryService;
	
	//测试查询一级分类和二级分类的集合
	@Test
	public void testSelectFirstCategoryMap()
	{
		List<FirstCategory> firstCategories=firstCategoryService.selectFirstCategoryMap();
		for (FirstCategory firstCategory : firstCategories) {
			System.out.print(firstCategory.getName()+" : ");
			for(Category category : firstCategory.getCategories()) {
				System.out.println(category.getName()+" "+category.getIcon());
			}
			System.out.println();
		}
	}
	
}
