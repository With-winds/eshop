package com.wwz.eshop.pojo;

/**
 * @Description: 订单详情实体类，对应数据库表--order_detail
 * @author: wwz
 * @date: 2019年3月16日 下午9:43:27
 */
public class OrderDetail {
	private int id;				//主键
	private int order_id;		//订单ID
	private int product_id;		//商品ID
	private String color;		//选择的颜色
	private String version;		//选择的版本
	private String meal;		//选择的套餐
	private int num;			//数量
	private Product product;	//商品
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", order_id=" + order_id + ", product_id=" + product_id + ", color=" + color
				+ ", version=" + version + ", meal=" + meal + ", num=" + num + "]";
	}
	public OrderDetail() {
		super();
	}
	public OrderDetail(int order_id, int product_id, String color, String version, String meal, int num) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
		this.color = color;
		this.version = version;
		this.meal = meal;
		this.num = num;
	}
	
}
