package com.wwz.eshop.pojo;

/**
 * @Description: 商品颜色实体类，对应数据库表--color
 * @author: wwz
 * @date: 2019年2月11日 下午11:12:52
 */
public class Color {
	private String code;     //商品编码
	private String image;    //颜色图标
	private String color;    //颜色
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Color [code=" + code + ", image=" + image + ", color=" + color + "]";
	}
}
