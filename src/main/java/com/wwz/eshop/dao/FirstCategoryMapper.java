package com.wwz.eshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wwz.eshop.pojo.FirstCategory;

/**
 * @Description: 数据持久层，对一级分类表--first_category进行操作
 * mybatis增删改的sql执行之后都会有一个int类型的返回值，表示的意思是这个操作影响的行数
 * @author: wwz
 * @date: 2019年2月13日 下午11:45:53
 */
@Mapper
public interface FirstCategoryMapper {
	
	//添加一级分类
	public int addFirstCategory(FirstCategory firstCategory);
	
	//通过ID删除一级分类
	public int deleteFirstCategory(int id);
	
	//修改一级分类
	public int updateFirstCategory(FirstCategory firstCategory);
	
	//查询所有一级分类
	public List<FirstCategory> selectAllFirstCategory();
	
	//通过ID查询一级分类
	public FirstCategory getFirstCategory(int id);
	
	//查询一级分类和二级分类的集合
	public List<FirstCategory> selectFirstCategoryMap();
	

}
