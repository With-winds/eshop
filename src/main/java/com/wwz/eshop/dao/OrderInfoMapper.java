package com.wwz.eshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wwz.eshop.pojo.OrderInfo;

/**
 * @Description: 数据持久层，对订单表--order进行操作
 * mybatis增删改的sql执行之后都会有一个int类型的返回值，表示的意思是这个操作影响的行数
 * @author: wwz
 * @date: 2019年3月16日 下午9:48:06
 */
@Mapper
public interface OrderInfoMapper {
	//添加订单
	public int addOrderInfo(OrderInfo orderInfo);
	
	//删除订单
	public int deleteOrderInfo(int id);
	
	//通过用户ID查询我的订单
	public List<OrderInfo> selectOrderById(int user_id);
	
	//查询所有订单
	public List<OrderInfo> selectAllOrderInfo();
}
