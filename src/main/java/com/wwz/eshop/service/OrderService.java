package com.wwz.eshop.service;

import java.util.List;
import java.util.Map;

import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.OrderDetail;
import com.wwz.eshop.pojo.OrderInfo;
import com.wwz.eshop.pojo.Shopcart;
import com.wwz.eshop.pojo.User;

/**
 * @Description: 业务层，对订单进行操作
 * @author: wwz
 * @date: 2019年3月16日 下午11:31:20
 */
public interface OrderService {
	//订单生成
	public void generateOrder(Map<Integer, Shopcart> map,User user);
	
	//查询我的订单
	public List<OrderInfo> selectMyOrder(int user_id);
	
	//通过订单ID删除我的订单
	public void deleteOrderInfoById(int id) throws CustomException;
	
	//查看订单明细
	public List<OrderDetail> selectOrderDetail(int order_id);
}
