package com.wwz.eshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wwz.eshop.pojo.Admin;

/**
 * @Description: 数据持久层，对管理员表--admin进行操作
 * mybatis增删改的sql执行之后都会有一个int类型的返回值，表示的意思是这个操作影响的行数
 * @author: wwz
 * @date: 2019年3月30日 下午3:05:20
 */
@Mapper
public interface AdminMapper {
	//添加管理员
	public int addAdmin(Admin admin);
	
	//通过ID删除管理员
	public int deleteAdmin(int id);
	
	//修改管理员
	public int updateAdmin(Admin admin);
	
	//通过ID查询管理员
	public Admin getAdminById(int id);
	
	//查询所有管理员
	public List<Admin> selectAllAdmin();
	
	//通过username和password查询管理员（登录）
	public Admin getAdmin(Admin admin);
	
	//通过管理员账号(username)查看这个账号是否存在(ajax验证账号是否存在)
	public Admin selectByUsername(String username);
}
