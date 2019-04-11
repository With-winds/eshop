package com.wwz.eshop.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.OrderDetail;
import com.wwz.eshop.pojo.OrderInfo;
import com.wwz.eshop.pojo.Shopcart;
import com.wwz.eshop.pojo.User;
import com.wwz.eshop.service.OrderService;

/**
 * @Description: 订单控制器
 * @author: wwz
 * @date: 2019年3月16日 下午11:43:16
 */
@Controller
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping("/payment")
	public String payment(HttpSession session)
	{
		//从session中取出购物车，放入Map对象的cart中
		Map<Integer, Shopcart> cart=(Map)session.getAttribute("cart");
		User user=(User) session.getAttribute("user");
		orderService.generateOrder(cart,user);
		cart.clear();
		return "redirect:/toMyOrder";
		
	}
	
	@RequestMapping("/toMyOrder")
	public String toMyOrder(ModelMap modelMap,HttpSession session)
	{
		//从session中取出用户，获取用户ID
		User user=(User) session.getAttribute("user");
		int user_id=user.getId();
		List<OrderInfo> orderInfos=orderService.selectMyOrder(user_id);
		modelMap.put("orderInfos", orderInfos);
		return "fore/orderInfo";
	}
	
	@RequestMapping("/toOrderDetail")
	public String toOrderDetail(int id,ModelMap modelMap)
	{
		List<OrderDetail> orderDetails=orderService.selectOrderDetail(id);
		modelMap.put("orderDetails", orderDetails);
		return "fore/orderDetail";
	}
	
	@RequestMapping("/deleteMyOrder")
	public String deleteMyOrder(int id) throws CustomException
	{
		orderService.deleteOrderInfoById(id);
		return "redirect:/toMyOrder";
	}
	
}
