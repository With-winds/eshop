package com.wwz.eshop.service;

import java.util.List;

import com.wwz.eshop.pojo.Product;

/**
 * @Description: 业务层，对商品进行操作
 * @author: wwz
 * @date: 2019年2月19日 上午10:01:33
 */
public interface ProductService {
	
	//通过category_id(二级分类ID)查询商品列表（多表操作）
	public List<Product> selectProductByCategoryId(int category_id);
	
	//通过商品ID查询商品
	public Product getProductById(int id);
	
	//查询商品列表
	public List<Product> selectAllProduct();
}
