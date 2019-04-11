package com.wwz.eshop.pojo;


/**
 * @Description: 商品实体类，对应数据库表--product  
 * @author: wwz
 * @date: 2019年2月11日 下午10:52:20
 */
public class Product {
	private int id;          //递增主键
	private String name;     //商品名称
	private double price;    //价格
	private String image;    //图片
	private int commentNum;  //评论人数
	private int category_id; //分类ID
	private Category category;  //二级分类
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getCommentNum() {
		return commentNum;
	}
	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + ", commentNum="
				+ commentNum + ", category_id=" + category_id + "]";
	}
	
}
