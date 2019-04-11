package com.wwz.eshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wwz.eshop.pojo.ProductDetail;

/**
 * @Description: 数据持久层，对商品详情表--product_detail进行操作
 * mybatis增删改的sql执行之后都会有一个int类型的返回值，表示的意思是这个操作影响的行数
 * @author: wwz
 * @date: 2019年2月19日 下午9:29:22
 */
@Mapper
public interface ProductDetailMapper {
	
	//添加商品详情
	public int addProductDetail(ProductDetail productDetail);
	
	//通过ID删除商品详情
	public int deleteProductDetail(int id);
	
	//修改商品详情
	public int updateProductDetail(ProductDetail productDetail);
	
	//查询所有商品详情
	public List<ProductDetail> selectAllProductDetail();

	//通过ID查询商品详情信息
	public ProductDetail getProductDetail(int id);
	
}
