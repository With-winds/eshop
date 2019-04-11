package com.wwz.eshop.service;

import java.util.List;

import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.User;

/**
 * @Description: 业务层，对用户进行操作
 * @author: wwz
 * @date: 2019年2月27日 下午10:07:49
 */
public interface UserService {

	//添加用户
	public void addUser(User user) throws CustomException;
	
	//通过username和password查询用户（登录）
	public User getUser(User user);

	//通过用户账号查看这个账号是否存在(用于ajax验证)
	public User selectByUsername(String username);
	
	//查询所有用户
	public List<User> selectAllUser();
	
	//通过ID查询用户
	public User getUserById(int id);
	
	//通过ID删除用户
	public void deleteUser(int id) throws CustomException;
	
}
