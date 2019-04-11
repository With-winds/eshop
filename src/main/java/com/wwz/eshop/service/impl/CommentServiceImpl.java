package com.wwz.eshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwz.eshop.dao.CommentMapper;
import com.wwz.eshop.exception.CustomException;
import com.wwz.eshop.pojo.Comment;

/**
 * @Description: 业务层实现类，对商品评论进行操作
 * @author: wwz
 * @date: 2019年3月19日 下午7:57:20
 */
@Service
public class CommentServiceImpl implements com.wwz.eshop.service.CommentService {
	
	@Autowired
	CommentMapper commentMapper;

	//添加评论
	@Override
	public void addComment(Comment comment) throws CustomException {
		int result=commentMapper.addComment(comment);
		if (result==0) {
			throw new CustomException("添加评论失败");
		}
	}

	//通过商品ID查询商品评论
	@Override
	public List<Comment> selectCommentById(int product_id) {
		return commentMapper.selectCommentById(product_id);
	}

}
