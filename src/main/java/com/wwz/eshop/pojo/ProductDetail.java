package com.wwz.eshop.pojo;

import java.util.List;

/**
 * @Description: 商品详情实体类，对应数据库表--product_detail
 * @author: wwz
 * @date: 2019年2月11日 下午10:59:13
 */
public class ProductDetail {
	private int id;                //递增主键，与product表主键一一对应
	private String title;          //标题
	private String subTitle;       //副标题
	private double price;          //价格
	private String coupon;         //优惠券
	private String serviceDesc;    //服务说明
	private String code;           //编码
	private String image;          //图片
	private List<Promotion> promotions;  //促销
	private List<Color> colors;			 //颜色
	private List<Version> versions;		 //版本
	private List<Meal> meals;			 //套餐
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	public String getServiceDesc() {
		return serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}
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
	public List<Promotion> getPromotions() {
		return promotions;
	}
	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}
	public List<Color> getColors() {
		return colors;
	}
	public void setColors(List<Color> colors) {
		this.colors = colors;
	}
	public List<Version> getVersions() {
		return versions;
	}
	public void setVersions(List<Version> versions) {
		this.versions = versions;
	}
	public List<Meal> getMeals() {
		return meals;
	}
	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}
	@Override
	public String toString() {
		return "ProductDetail [id=" + id + ", title=" + title + ", subTitle=" + subTitle + ", price=" + price
				+ ", coupon=" + coupon + ", serviceDesc=" + serviceDesc + ", code=" + code + ", image=" + image + "]";
	}
}
