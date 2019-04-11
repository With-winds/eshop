package com.wwz.eshop.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wwz.eshop.pojo.Category;

/**
 * @Description: 商品分类测试类
 * @author: wwz
 * @date: 2019年2月19日 下午1:53:54
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CategoryMapperTest {
	
	@Resource
	CategoryMapper categoryMapper;
	
	//测试多对一关系查询（first_category和category）
	@Test
	public void testCategoryMap()
	{
		Category category=categoryMapper.getCategory(1);
		System.out.println(category);
		System.out.println(category.getFirstCategory());
	}

}
