package com.wwz.eshop.pojo;

/**
 * @Description: 商品评论实体类，对应数据库表--comment  
 * @author: wwz
 * @date: 2019年3月19日 下午7:24:56
 */
public class Comment {
	private int id;				//主键
	private String content;		//评论内容
	private int user_id;		//用户ID
	private int product_id;		//商品ID
	private String commentDate;	//评论时间
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", user_id=" + user_id + ", product_id=" + product_id
				+ ", commentDate=" + commentDate + ", user=" + user + "]";
	}
	
}
