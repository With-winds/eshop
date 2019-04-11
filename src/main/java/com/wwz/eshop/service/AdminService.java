package com.wwz.eshop.service;

import java.util.List;

import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.Admin;

/**
 * @Description: 业务层，对管理员进行操作
 * @author: wwz
 * @date: 2019年3月30日 下午3:17:41
 */
public interface AdminService {
	//添加管理员
	public void addAdmin(Admin admin) throws CustomException;
	
	//通过Adminname和password查询管理员（登录）
	public Admin getAdmin(Admin admin);

	//通过管理员账号查看这个账号是否存在(用于ajax验证)
	public Admin selectByUsername(String username);
	
	//查询所有管理员
	public List<Admin> selectAllAdmin();
	
	//通过ID查询管理员
	public Admin getAdminById(int id);
	
	//通过ID删除管理员
	public void deleteAdmin(int id) throws CustomException;
}
