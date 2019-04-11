package com.wwz.eshop.service;

import com.wwz.eshop.pojo.ProductDetail;

/**
 * @Description: 业务层，对商品详情进行操作
 * @author: wwz
 * @date: 2019年2月19日 下午9:46:11
 */
public interface ProductDetailService {
	
	//通过ID查询商品详情信息
	public ProductDetail getProductDetail(int id);
	
}
