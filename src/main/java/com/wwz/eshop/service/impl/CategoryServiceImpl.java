package com.wwz.eshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwz.eshop.dao.CategoryMapper;
import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.Category;
import com.wwz.eshop.service.CategoryService;

/**
 * @Description: 业务层实现类，对二级分类进行操作
 * @author: wwz
 * @date: 2019年2月17日 下午1:24:29
 */
@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryMapper categoryMapper;

	//添加二级分类
	@Override
	public void addCategory(Category category) throws CustomException {
		int result=categoryMapper.addCategory(category);
		if (result==0) {
			throw new CustomException("添加一级分类失败");
		}
	}

	//通过ID删除二级分类
	@Override
	public void deleteCategory(int id) throws CustomException {
		int result=categoryMapper.deleteCategory(id);
		if (result==0) {
			throw new CustomException("添加一级分类失败");
		}
	}

	//修改二级分类
	@Override
	public void updateCategory(Category category) throws CustomException {
		int result=categoryMapper.updateCategory(category);
		if (result==0) {
			throw new CustomException("添加一级分类失败");
		}
	}

	//查询所有二级分类
	@Override
	public List<Category> selectAllCategory() {
		
		return categoryMapper.selectAllCategory();
	}

}
