package com.wwz.eshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwz.eshop.dao.ProductDetailMapper;
import com.wwz.eshop.pojo.ProductDetail;

/**
 * @Description: 业务层实现类，对商品详情进行操作
 * @author: wwz
 * @date: 2019年2月19日 下午9:48:34
 */
@Service
public class ProductDetailServiceImpl implements com.wwz.eshop.service.ProductDetailService {

	@Autowired
	ProductDetailMapper productDetailMapper;
	
	//通过ID查询商品详情信息
	@Override
	public ProductDetail getProductDetail(int id) {
		return productDetailMapper.getProductDetail(id);
	}

}
