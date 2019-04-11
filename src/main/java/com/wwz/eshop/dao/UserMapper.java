package com.wwz.eshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wwz.eshop.pojo.User;

/**
 * @Description: 数据持久层，对用户表--user进行操作
 * mybatis增删改的sql执行之后都会有一个int类型的返回值，表示的意思是这个操作影响的行数
 * @author: wwz
 * @date: 2019年2月27日 下午9:49:52
 */
@Mapper
public interface UserMapper {

	//添加用户
	public int addUser(User user);
	
	//通过ID删除用户
	public int deleteUser(int id);
	
	//修改用户
	public int updateUser(User user);
	
	//通过ID查询用户
	public User getUserById(int id);
	
	//查询所有用户
	public List<User> selectAllUser();
	
	//通过username和password查询用户（登录）
	public User getUser(User user);
	
	//通过用户账号(username)查看这个账号是否存在
	public User selectByUsername(String username);
}
