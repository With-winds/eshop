package com.wwz.eshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wwz.eshop.pojo.OrderDetail;

/**
 * @Description: 数据持久层，对订单详情表--order_detail进行操作
 * mybatis增删改的sql执行之后都会有一个int类型的返回值，表示的意思是这个操作影响的行数
 * @author: wwz
 * @date: 2019年3月16日 下午9:48:06
 */
@Mapper
public interface OrderDetailMapper {
	//添加订单详情
	public int addOrderDetail(OrderDetail orderDetail);
	
	//通过订单ID删除订单详情
	public int deleteOrderDetail(int order_id);
	
	//通过订单ID查询订单详情列表
	public List<OrderDetail> selectAllOrderDetailById(int order_id);
}
