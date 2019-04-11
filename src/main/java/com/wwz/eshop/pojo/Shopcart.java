package com.wwz.eshop.pojo;

/**
 * @Description: 商品购物车，保存在session中，没有对应
 * @author: wwz
 * @date: 2019年2月27日 下午10:55:21
 */
public class Shopcart {
	private int id;
	private Product product;
	private int quantity;
	private String color;
	private String version;
	private String meal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	@Override
	public String toString() {
		return "Shopcart [id=" + id + ", product=" + product + ", quantity=" + quantity + ", color=" + color
				+ ", version=" + version + ", meal=" + meal + "]";
	}
	
}
