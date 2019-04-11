package com.wwz.eshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wwz.eshop.pojo.Comment;

/**
 * @Description: 数据持久层，对商品评论表--comment进行操作
 * mybatis增删改的sql执行之后都会有一个int类型的返回值，表示的意思是这个操作影响的行数
 * @author: wwz
 * @date: 2019年3月19日 下午7:29:47
 */
@Mapper
public interface CommentMapper {
	//添加评论
	public int addComment(Comment comment);
	
	//通过商品ID查询商品评论
	public List<Comment> selectCommentById(int product_id);
	
}
