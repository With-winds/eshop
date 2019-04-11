package com.wwz.eshop.pojo;

/**
 * @Description: 商品促销实体类，对应数据库表--promotion
 * @author: wwz
 * @date: 2019年2月11日 下午11:06:45
 */
public class Promotion {
	private String code;       //商品编码
	private String promotion;  //促销活动
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPromotion() {
		return promotion;
	}
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}
	@Override
	public String toString() {
		return "Promotion [code=" + code + ", promotion=" + promotion + "]";
	}
	
}
