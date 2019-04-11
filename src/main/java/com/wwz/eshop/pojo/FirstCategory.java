package com.wwz.eshop.pojo;

import java.util.List;

/**
 * @Description:一级分类实体类，对应数据库表--first_category 
 * @author: wwz
 * @date: 2019年2月11日 下午10:38:39
 */
public class FirstCategory {
	private int id;         //递增主键
	private String name;    //一级分类名称
	private List<Category> categories;	//二级分类列表
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
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	@Override
	public String toString() {
		return "FirstCategory [id=" + id + ", name=" + name + "]";
	}
	
}
