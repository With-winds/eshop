package com.wwz.eshop.pojo;
/**
 * @Description: 用户实体类，对应数据库表--user  
 * @author: wwz
 * @date: 2019年2月26日 下午10:37:05
 */
public class User {
	private int id;				//主键
	private String username;	//账号
	private String password;	//密码
	private String realName;	//姓名
	private String sex;			//性别
	private String email;		//邮箱
	private String phone;		//手机号码
	private String address;		//地址
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", realName=" + realName
				+ ", sex=" + sex + ", email=" + email + ", phone=" + phone + ", address=" + address + ", regDate="
				+ regDate + "]";
	}
	
}
