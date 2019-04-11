package com.wwz.eshop.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwz.eshop.dao.OrderDetailMapper;
import com.wwz.eshop.dao.OrderInfoMapper;
import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.OrderDetail;
import com.wwz.eshop.pojo.OrderInfo;
import com.wwz.eshop.pojo.Shopcart;
import com.wwz.eshop.pojo.User;
import com.wwz.eshop.service.OrderService;

/**
 * @Description: 业务层实现类，对订单进行操作
 * @author: wwz
 * @date: 2019年3月16日 下午11:58:51
 */
@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderInfoMapper orderInfoMapper;
	
	@Autowired
	OrderDetailMapper orderDetailMapper;

	//生成订单
	@Override
	public void generateOrder(Map<Integer, Shopcart> map,User user) {
		int totalNum=0;
		double totalPrice=0;
		//遍历集合统计商品总数量和总价格
		for (Map.Entry<Integer, Shopcart> entry : map.entrySet()) {
			Shopcart shopcart=entry.getValue();
			totalNum+=shopcart.getQuantity();
			totalPrice+=shopcart.getProduct().getPrice()*shopcart.getQuantity();
		}
		//对日期进行格式化
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String orderTime=dateFormat.format(new Date());
		//获取用户ID
		int user_id=user.getId();
		String status="已付款";
		//生成订单表
		OrderInfo orderInfo=new OrderInfo(user_id, status, orderTime, totalNum, totalPrice);
		orderInfoMapper.addOrderInfo(orderInfo);
		//生成订单详情表
		for (Map.Entry<Integer, Shopcart> entry : map.entrySet()) {
			Shopcart shopcart=entry.getValue();
			OrderDetail orderDetail=new OrderDetail(orderInfo.getId(), shopcart.getProduct().getId(),
					shopcart.getColor(), shopcart.getVersion(), shopcart.getMeal(), shopcart.getQuantity());
			orderDetailMapper.addOrderDetail(orderDetail);
		}
	}

	//查询我的订单
	@Override
	public List<OrderInfo> selectMyOrder(int user_id) {
		return orderInfoMapper.selectOrderById(user_id);
	}

	//通过订单ID删除我的订单
	@Override
	public void deleteOrderInfoById(int id) throws CustomException {
		int result=orderInfoMapper.deleteOrderInfo(id);
		int result2=orderDetailMapper.deleteOrderDetail(id);
		if (result==0||result2==0) {
			throw new CustomException("删除订单失败");
		}
	}

	//查看订单明细
	@Override
	public List<OrderDetail> selectOrderDetail(int order_id) {
		return orderDetailMapper.selectAllOrderDetailById(order_id);
	}

}
