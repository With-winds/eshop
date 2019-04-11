package com.wwz.eshop.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wwz.eshop.pojo.Comment;

/**
 * @Description: 评论测试类
 * @author: wwz
 * @date: 2019年2月19日 下午1:53:54
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CommentServiceTest {

	@Resource
	CommentService commentService;
	
	@Test
	public void testCommentMap()
	{
		List<Comment> comments=commentService.selectCommentById(2);
		for (Comment comment : comments) {
			System.out.println(comment);
			System.out.println(comment.getUser());
		}
	}
	
	
}
