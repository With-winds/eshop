package com.wwz.eshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwz.eshop.dao.FirstCategoryMapper;
import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.FirstCategory;
import com.wwz.eshop.service.FirstCategoryService;

/**
 * @Description: 业务层实现类，对一级分类进行操作
 * @author: wwz
 * @date: 2019年2月17日 下午1:24:29
 */
@Service
public class FirstCategoryServiceImpl implements FirstCategoryService {
	
	@Autowired
	FirstCategoryMapper firstCategoryMapper;

	//添加一级分类
	@Override
	public void addFirstCategory(FirstCategory firstCategory) throws CustomException {
		int result=firstCategoryMapper.addFirstCategory(firstCategory);
		if (result==0) {
			throw new CustomException("添加一级分类失败");
		}

	}

	//通过ID删除一级分类
	@Override
	public void deleteFirstCategory(int id) throws CustomException {
		int result=firstCategoryMapper.deleteFirstCategory(id);
		if (result==0) {
			throw new CustomException("删除一级分类失败");
		}

	}

	//修改一级分类
	@Override
	public void updateFirstCategory(FirstCategory firstCategory) throws CustomException {
		int result=firstCategoryMapper.updateFirstCategory(firstCategory);
		if (result==0) {
			throw new CustomException("修改一级分类失败");
		}

	}

	//查询所有一级分类
	@Override
	public List<FirstCategory> selectAllFirstCategory() {
		
		return firstCategoryMapper.selectAllFirstCategory();
	}

	//查询一级分类和二级分类的集合
	@Override
	public List<FirstCategory> selectFirstCategoryMap() {
		return firstCategoryMapper.selectFirstCategoryMap();
	}

}
