package com.wwz.eshop.service;

import java.util.List;

import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.Category;
import com.wwz.eshop.pojo.FirstCategory;

/**
 * @Description: 业务层，对二级分类进行操作
 * @author: wwz
 * @date: 2019年2月17日 下午1:19:55
 */
public interface CategoryService {
	
	//添加二级分类
	public void addCategory(Category category) throws CustomException;
	
	//通过ID删除二级分类
	public void deleteCategory(int id) throws CustomException;
	
	//修改二级分类
	public void updateCategory(Category category) throws CustomException;
	
	//查询所有二级分类
	public List<Category> selectAllCategory();
	
}
