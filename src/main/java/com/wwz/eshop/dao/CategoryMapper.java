package com.wwz.eshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wwz.eshop.pojo.Category;

/**
 * @Description: 数据持久层，对二级分类表--category进行操作
 * mybatis增删改的sql执行之后都会有一个int类型的返回值，表示的意思是这个操作影响的行数
 * @author: wwz
 * @date: 2019年2月13日 下午11:45:53
 */
@Mapper
public interface CategoryMapper {
	
	//添加二级分类
	public int addCategory(Category category);
	
	//通过ID删除二级分类
	public int deleteCategory(int id);
	
	//修改二级分类
	public int updateCategory(Category category);
	
	//查询所有二级分类
	public List<Category> selectAllCategory();
	
	//通过ID查询二级分类
	public Category getCategory(int id);
}
