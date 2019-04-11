package com.wwz.eshop.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description: 后台登录拦截器，必须登录才能进入后台管理
 * 如果已经登录，则继续操作
 * 如果没有登录，则跳转到登录界面
 * @author: wwz
 * @date: 2019年3月31日 下午6:25:07
 */
public class BackLoginInterceptor implements HandlerInterceptor {

	// 在拦截点执行前拦截，如果返回true则不执行拦截点后的操作（拦截成功）
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		//如果已经登录，不拦截
		if (session.getAttribute("admin")!=null) {
			return true;
		}
		//如果没有登录，则跳转到后台登录界面
		else {
			response.sendRedirect(request.getContextPath()+"/back/toLogin");
			return false;
		}
	}

	// 在处理过程中，执行拦截
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	// 执行完毕，返回前拦截
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
