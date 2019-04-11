package com.wwz.eshop.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwz.eshop.dao.AdminMapper;
import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.Admin;
import com.wwz.eshop.service.AdminService;

/**
 * @Description: 业务层实现类，对管理员进行操作
 * @author: wwz
 * @date: 2019年3月30日 下午3:20:35
 */
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminMapper adminMapper;
	
	//添加管理员（注册）
	@Override
	public void addAdmin(Admin admin) throws CustomException {
		//对日期进行格式化
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		admin.setRegDate(dateFormat.format(new Date()));
		
		//利用md5对密码进行加密
		String solt="eshop";	//加密的盐
		String password=DigestUtils.md5Hex(admin.getPassword());
		password=DigestUtils.md5Hex(password+solt);
		
		admin.setPassword(password);
		
		int result=adminMapper.addAdmin(admin);
		if (result==0) {
			throw new CustomException("添加用户失败");
		}
	}

	//通过username和password查询管理员（登录）
	@Override
	public Admin getAdmin(Admin admin) {
		//利用md5对密码进行加密,用加密后的密码进行查询对比
		String solt="eshop";	//加密的盐
		String password=DigestUtils.md5Hex(admin.getPassword());
		//用盐加密
		password=DigestUtils.md5Hex(password+solt);
		
		admin.setPassword(password);
		return adminMapper.getAdmin(admin);
	}

	//通过管理员账号查看这个账号是否存在(用于ajax验证)
	@Override
	public Admin selectByUsername(String username) {
		return adminMapper.selectByUsername(username);
	}

	//查询所有管理员
	@Override
	public List<Admin> selectAllAdmin() {
		return adminMapper.selectAllAdmin();
	}

	//通过ID查询管理员
	@Override
	public Admin getAdminById(int id) {
		return adminMapper.getAdminById(id);
	}

	//通过ID删除管理员
	@Override
	public void deleteAdmin(int id) throws CustomException {
		int result=adminMapper.deleteAdmin(id);
		if (result==0) {
			throw new CustomException("添加用户失败");
		}
	}

}
