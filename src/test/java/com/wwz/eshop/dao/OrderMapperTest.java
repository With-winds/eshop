package com.wwz.eshop.dao;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wwz.eshop.pojo.OrderInfo;

/**
 * @Description: 订单测试类
 * @author: wwz
 * @date: 2019年2月19日 下午1:53:54
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class OrderMapperTest {
	@Resource
	OrderInfoMapper orderMapper;
	
	@Test
	public void testInsertOrder()
	{
		OrderInfo order=new OrderInfo();
		order.setOrderTime("2019-9-19");
		order.setStatus("已付款");
		order.setTotalNum(8);
		order.setTotalPrice(8533);
		order.setUser_id(3);
		int id=orderMapper.addOrderInfo(order);
		System.out.println("订单ID："+order.getId());
	}
}
