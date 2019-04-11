package com.wwz.eshop.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwz.eshop.dao.UserMapper;
import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.User;
import com.wwz.eshop.service.UserService;

/**
 * @Description: 业务层实现类，对用户进行操作
 * @author: wwz
 * @date: 2019年2月27日 下午10:08:54
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	//添加用户
	@Override
	public void addUser(User user) throws CustomException {
		//对日期进行格式化
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		user.setRegDate(dateFormat.format(new Date()));
		
		//利用md5对密码进行加密
		String solt="eshop";	//加密的盐
		String password=DigestUtils.md5Hex(user.getPassword());
		password=DigestUtils.md5Hex(password+solt);
		
		user.setPassword(password);
		
		int result=userMapper.addUser(user);
		if (result==0) {
			throw new CustomException("添加用户失败");
		}
	}

	//通过username和password查询用户（登录）
	@Override
	public User getUser(User user) {
		
		//利用md5对密码进行加密,用加密后的密码进行查询对比
		String solt="eshop";	//加密的盐
		String password=DigestUtils.md5Hex(user.getPassword());
		//用盐加密
		password=DigestUtils.md5Hex(password+solt);
		
		user.setPassword(password);
		
		return userMapper.getUser(user);
	}

	//通过用户账号查看这个账号是否存在(用于ajax验证)
	@Override
	public User selectByUsername(String username) {
		return userMapper.selectByUsername(username);
	}

	//查询所有用户
	@Override
	public List<User> selectAllUser() {
		return userMapper.selectAllUser();
	}

	//通过ID查询用户
	@Override
	public User getUserById(int id) {
		return userMapper.getUserById(id);
	}

	@Override
	public void deleteUser(int id) throws CustomException {
		int result=userMapper.deleteUser(id);
		if (result==0) {
			throw new CustomException("添加用户失败");
		}
	}

}
