package com.wwz.eshop.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description: 登录拦截器，对一些需要登录才能操作的功能进行拦截
 * 如果已经登录，则继续操作
 * 如果没有登录，则跳转到登录界面
 * @author: wwz
 * @date: 2019年3月4日 下午1:27:30
 */
public class LoginInterceptor implements HandlerInterceptor {

	// 在拦截点执行前拦截，如果返回true则不执行拦截点后的操作（拦截成功）
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		//如果已经登录，不拦截
		if (session.getAttribute("user")!=null) {
			return true;
		}
		//如果没有登录，则跳转到登录界面
		else {
			/**
			 * 以下是为了登录成功后返回到刚刚的操作，不跳到主界面
			 * 实现：通过将请求URL保存到session的beforePath中，然后在登录时判断beforePath是否为空
			 */
			String uri = request.getRequestURI();//拿到上一个页面地址
            String path = uri.substring(request.getContextPath().length());//去掉项目地址长度的字符（因为我的默认项目地址是给出的）
            String query = request.getQueryString();//得到参数
            if(query == null) {
                query="";
            }
            else {
                query="?"+query;
            }
            String beforePath = path+query;
            session.setAttribute("beforePath", beforePath);
            
			response.sendRedirect(request.getContextPath()+"/toLogin");
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
