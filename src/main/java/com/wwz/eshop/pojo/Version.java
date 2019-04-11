package com.wwz.eshop.pojo;

/**
 * @Description: 商品版本实体类，对应数据库表--version
 * @author: wwz
 * @date: 2019年2月11日 下午11:15:06
 */
public class Version {
	private String code;      //编码
	private String version;   //版本
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Version() {
		super();
	}
	public Version(String code, String version) {
		super();
		this.code = code;
		this.version = version;
	}
	@Override
	public String toString() {
		return "Version [code=" + code + ", version=" + version + "]";
	}
}
