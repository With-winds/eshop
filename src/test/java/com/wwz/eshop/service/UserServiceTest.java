package com.wwz.eshop.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.User;

/**
 * @Description: 用户测试类
 * @author: wwz
 * @date: 2019年2月19日 下午1:53:54
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceTest {
	
	@Resource
	UserService userService;
	
	
	//测试添加用户
	@Test
	public void testAddUser() throws CustomException
	{
		for (int i = 1; i <= 50; i++) {
			User user=new User();
			user.setUsername("e00000"+i);
			user.setPassword("p00000"+i);
			user.setRealName("用户"+i);
			if (i%2==0) {
				user.setSex("男");
			}
			if (i%2==1) {
				user.setSex("女");
			}
			user.setEmail("1516438"+i+"@qq.com");
			user.setPhone("1861526589"+(i%10));
			user.setAddress("广东省广州市体育中心"+i+"号");
			userService.addUser(user);
		}
	}

}
