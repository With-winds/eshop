package com.wwz.eshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwz.eshop.dao.ProductMapper;
import com.wwz.eshop.pojo.Product;
import com.wwz.eshop.service.ProductService;

/**
 * @Description: 业务层实现类，对商品进行操作
 * @author: wwz
 * @date: 2019年2月19日 上午10:03:23
 */
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductMapper productMapper;

	//通过category_id(二级分类ID)查询商品列表
	@Override
	public List<Product> selectProductByCategoryId(int category_id) {
		return productMapper.selectProductByCategoryId(category_id);
	}

	//通过商品ID查询商品
	@Override
	public Product getProductById(int id) {
		return productMapper.getProduct(id);
	}

	//查询商品列表
	@Override
	public List<Product> selectAllProduct() {
		return productMapper.selectAllProduct();
	}
	
	

}
