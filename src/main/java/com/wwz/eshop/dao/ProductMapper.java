package com.wwz.eshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wwz.eshop.pojo.Product;

/**
 * @Description: 数据持久层，对商品表--product进行操作
 * mybatis增删改的sql执行之后都会有一个int类型的返回值，表示的意思是这个操作影响的行数
 * @author: wwz
 * @date: 2019年2月19日 上午9:46:53
 */
@Mapper
public interface ProductMapper {
	
	//添加商品
	public int addProduct(Product product);
	
	//通过ID删除商品
	public int deleteProduct(int id);
	
	//修改商品
	public int updateProduct(Product product);
	
	//查询所有商品
	public List<Product> selectAllProduct();
	
	//通过ID查询商品
	public Product getProduct(int id);
	
	//通过category_id(二级分类ID)查询商品列表
	public List<Product> selectProductByCategoryId(int category_id);
}
