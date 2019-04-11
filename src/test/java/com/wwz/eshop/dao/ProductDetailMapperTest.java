package com.wwz.eshop.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wwz.eshop.pojo.Color;
import com.wwz.eshop.pojo.Product;
import com.wwz.eshop.pojo.ProductDetail;
import com.wwz.eshop.pojo.Promotion;

/**
 * @Description: 商品详情测试类
 * @author: wwz
 * @date: 2019年2月19日 下午1:53:54
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ProductDetailMapperTest {

	@Resource
	ProductDetailMapper productDetailMapper;
	
	@Test
	public void testProductDetail()
	{
		System.out.println("开始测试");
		ProductDetail productDetail=productDetailMapper.getProductDetail(1);
		System.out.println(productDetail);
		for (Promotion promotion : productDetail.getPromotions()) {
			System.out.println(promotion);
		}
		for (Color color : productDetail.getColors()) {
			System.out.println(color);
		}
	}
	

	
}
