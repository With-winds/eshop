package com.wwz.eshop.pojo;

/**
 * @Description: 商品套餐实体类，对应数据库表--meal
 * @author: wwz
 * @date: 2019年2月12日 上午1:05:44
 */
public class Meal {
	private String code;         //商品编码
	private String meal;         //商品套餐
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	@Override
	public String toString() {
		return "Meal [code=" + code + ", meal=" + meal + "]";
	}
}
