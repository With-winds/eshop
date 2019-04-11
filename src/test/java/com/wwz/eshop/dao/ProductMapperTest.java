package com.wwz.eshop.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wwz.eshop.pojo.Product;

/**
 * @Description: 商品测试类
 * @author: wwz
 * @date: 2019年2月19日 下午1:53:54
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ProductMapperTest {

	@Resource
	ProductMapper productMapper;
	
	@Test
	public void testProduct()
	{
		Product product=productMapper.getProduct(1);
		System.out.println(product);
		System.out.println(product.getCategory());
	}
	
	@Test
	public void testProductMap()
	{
		List<Product> products=productMapper.selectProductByCategoryId(1);
		for (Product product : products) {
			System.out.println(product);
			System.out.println(product.getCategory());
			System.out.println(product.getCategory().getFirstCategory());
			System.out.println();
		}
	}
	
}
