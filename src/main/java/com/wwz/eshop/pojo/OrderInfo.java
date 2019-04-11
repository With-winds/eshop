package com.wwz.eshop.pojo;

/**
 * @Description: 订单实体类，对应数据库表--order_info
 * @author: wwz
 * @date: 2019年3月16日 下午9:40:48
 */
public class OrderInfo {
	private int id;              //主键
	private int user_id;		 //用户ID
	private String status;       //订单状态
	private String orderTime;	 //订单时间
	private int totalNum; 		 //总数量
	private double totalPrice;	 //总金额
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public int getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", user_id=" + user_id + ", status=" + status + ", orderTime=" + orderTime
				+ ", totalNum=" + totalNum + ", totalPrice=" + totalPrice + "]";
	}
	public OrderInfo() {
		super();
	}
	public OrderInfo(int user_id, String status, String orderTime, int totalNum, double totalPrice) {
		super();
		this.user_id = user_id;
		this.status = status;
		this.orderTime = orderTime;
		this.totalNum = totalNum;
		this.totalPrice = totalPrice;
	}
	
}
