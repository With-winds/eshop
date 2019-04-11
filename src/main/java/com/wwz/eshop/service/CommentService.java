package com.wwz.eshop.service;

import java.util.List;

import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.Comment;

/**
 * @Description: 业务层，对商品评论进行操作
 * @author: wwz
 * @date: 2019年3月19日 下午7:55:53
 */
public interface CommentService {
	//添加评论
	public void addComment(Comment comment) throws CustomException;
	
	//通过商品ID查询商品评论
	public List<Comment> selectCommentById(int product_id);
	
}
