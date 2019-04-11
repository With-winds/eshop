package com.wwz.eshop.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wwz.eshop.pojo.Shopcart;
import com.wwz.eshop.service.ProductService;

/**
 * @Description: 购物车控制器
 * @author: wwz
 * @date: 2019年2月24日 上午10:28:23
 */
@Controller
public class ShopcartController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/toShopcart")
	public String toShopcart()
	{
		return "fore/shopcart";
	}

	@RequestMapping("/addToShopcart")
	public String addToShopcart(Shopcart shopcart,HttpSession session)
	{
		//从session中取出购物车，放入Map对象的cart中
		Map<Integer, Shopcart> cart=(Map)session.getAttribute("cart");
		//如果购物车不存在，则创建购物车，并存入session中
		if (cart==null) {
			cart=new HashMap<>();
			session.setAttribute("cart", cart);
		}
		//根据key(商品ID)获取购物车的商品
		Shopcart cartItem=cart.get(shopcart.getId());
		//如果该商品在购物车中，则更新数量
		if (cartItem!=null) {
			cartItem.setQuantity(cartItem.getQuantity()+1);
		}
		//如果不存在，则创建一个条目
		else {
			shopcart.setProduct(productService.getProductById(shopcart.getId()));
			cart.put(shopcart.getId(), shopcart);
		}
		return "redirect:/toShopcart";
		
	}
	
	//修改商品数量
	@RequestMapping("/updateQuantity")
	public String updateQuantity(int id,int quantity,HttpSession session) 
	{
		Map<Integer, Shopcart> cart=(Map)session.getAttribute("cart");
		Shopcart shopcart=(Shopcart)cart.get(id);
		shopcart.setQuantity(quantity);
		return "redirect:/toShopcart";
	}
	
	//删除购物车的商品
	@RequestMapping("/deleteCartItem")
	public String deleteCartItem(int id,HttpSession session)
	{
		Map<Integer, Shopcart> cart=(Map)session.getAttribute("cart");
		cart.remove(id);
		return "redirect:/toShopcart";
	}
	
	//清空购物车
	@RequestMapping("/clearCart")
	public String clearCart(HttpSession session)
	{
		Map<Integer, Shopcart> cart=(Map)session.getAttribute("cart");
		cart.clear();
		return "redirect:/toShopcart";
	}
	
}
