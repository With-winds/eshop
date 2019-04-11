package com.wwz.eshop.service;

import java.util.List;

import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.FirstCategory;

/**
 * @Description: 业务层，对一级分类进行操作
 * @author: wwz
 * @date: 2019年2月17日 下午1:19:55
 */
public interface FirstCategoryService {
	
	//添加一级分类
	public void addFirstCategory(FirstCategory firstCategory) throws CustomException;
	
	//通过ID删除一级分类
	public void deleteFirstCategory(int id) throws CustomException;
	
	//修改一级分类
	public void updateFirstCategory(FirstCategory firstCategory) throws CustomException;
	
	//查询所有一级分类
	public List<FirstCategory> selectAllFirstCategory();
	
	//查询一级分类和二级分类的集合
	public List<FirstCategory> selectFirstCategoryMap();
}
