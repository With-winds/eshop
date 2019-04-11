package com.wwz.eshop.pojo;

/**
 * @Description: 管理员实体类，对应数据库表--admin
 * @author: wwz
 * @date: 2019年3月30日 下午3:00:25
 */
public class Admin {
	private int id;				//主键
	private String username;	//账号
	private String password;	//密码
	private String realName;	//姓名
	private String regDate;		//注册时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", password=" + password + ", realName=" + realName
				+ ", regDate=" + regDate + "]";
	}
	
}
