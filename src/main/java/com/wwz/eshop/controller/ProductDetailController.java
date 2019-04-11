package com.wwz.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wwz.eshop.pojo.Comment;
import com.wwz.eshop.pojo.ProductDetail;
import com.wwz.eshop.service.CommentService;
import com.wwz.eshop.service.ProductDetailService;

/**
 * @Description: 商品详情控制器
 * @author: wwz
 * @date: 2019年2月19日 下午9:51:55
 */
@Controller
public class ProductDetailController {
	
	@Autowired
	ProductDetailService productDetailService;
	
	@Autowired
	CommentService commentService;
	
	@RequestMapping("/showProductDetail")
	public String showProductDetail(int id,ModelMap modelMap)
	{
		ProductDetail productDetail=productDetailService.getProductDetail(id);
		modelMap.addAttribute("productDetail", productDetail);
		List<Comment> comments=commentService.selectCommentById(id);
		modelMap.addAttribute("comments", comments);
		return "fore/productDetail";
	}

}
