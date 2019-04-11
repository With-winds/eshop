package com.wwz.eshop.pojo;

/**
 * @Description:分类实体类，对应数据库表--category  
 * @author: wwz
 * @date: 2019年2月11日 下午10:46:38
 */
public class Category {
	private int id;                 //递增主键
	private String name;            //分类名称
	private String icon;            //分类图标
	private int first_category_id;  //一级分类ID
	private FirstCategory firstCategory;	//一级分类
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
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getFirst_category_id() {
		return first_category_id;
	}
	public void setFirst_category_id(int first_category_id) {
		this.first_category_id = first_category_id;
	}
	public FirstCategory getFirstCategory() {
		return firstCategory;
	}
	public void setFirstCategory(FirstCategory firstCategory) {
		this.firstCategory = firstCategory;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", icon=" + icon + ", first_category_id=" + first_category_id
				+ "]";
	}
	
}
