package com.wwz.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwz.eshop.pojo.Product;
import com.wwz.eshop.pojo.User;
import com.wwz.eshop.service.ProductService;
import com.wwz.eshop.util.Page;

/**
 * @Description: 商品控制器
 * @author: wwz
 * @date: 2019年2月19日 上午10:07:19
 */
@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	/**
	 * @Description:从主页跳转到商品列表页
	 * @param category_id 二级分类ID
	 * @param modelMap 将数据传到jsp页面
	 * @return
	 */
	@RequestMapping("/selectProductByCategoryId")
	public String selectProductByCategoryId(int category_id,ModelMap modelMap)
	{
		List<Product> products=productService.selectProductByCategoryId(category_id);
		modelMap.addAttribute("products", products);
		modelMap.addAttribute("category", products.get(0).getCategory());
		modelMap.addAttribute("firstCategory", products.get(0).getCategory().getFirstCategory());
		return "fore/productList";
	}
	
	/**
	 * 后台控制器
	 */
	
	//跳转到商品列表界面
	@RequestMapping("/back/productList")
	public String productList(ModelMap modelMap,Page page)
	{
		//如果开始位置start小于0，则置0
		if(page.getStart()<0) {
			page.setStart(0);
		}
		
		//如果开始位置start大于总数，则置为最后一页开始位置
		if(page.getStart()>=page.getTotal()) {
			page.setStart(page.getLast());
		}
		
		//在查询所有数据之前调用pagehelper,参数为开始位置和每页个数
		PageHelper.offsetPage(page.getStart(),page.getCount());
		
		//查询
		List<Product> products=productService.selectAllProduct();
		
		//通过总数计算最后一页开始位置
		page.setTotal((int) new PageInfo<Product>(products).getTotal());
		page.caculateLast(page.getTotal());
				
		//设置页码
		page.setUpIndex(page.getStart(), page.getCount());
		
		modelMap.addAttribute("products", products);
		
		return "back/productList";
	}
	
}
