<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>导航条</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<script src="static/js/jquery-3.3.1.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>
</head>
<body>
  <!-- 导航条 -->
  <nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      	<!-- 导航条左边 -->
        <ul class="nav navbar-nav">
          <li><a href="index">首页</a></li>
          <c:if test="${sessionScope.user==null}">
   		    <li><a href="toLogin">请登录</a></li>
            <li><a href="toRegister">免费注册</a></li>
		  </c:if>
          <c:if test="${sessionScope.user!=null}">
   		    <li><a href="personalCenter">欢迎你,  ${ sessionScope.user.realName }</a></li>
            <li><a href="logout">退出</a></li>
		  </c:if>
        </ul>
        <!-- 导航条右边 -->
        <ul class="nav navbar-nav navbar-right">
          <li>
            <a href="toShopcart"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>  购物车</a>
          </li>
          <li><a href="toMyOrder">我的订单</a></li>
        </ul>
      </div>
    </div>
  </nav>
  
  	<div class="header">
      <div class="row">
       
        <div class="col-md-4">
	      <img src="static/image/logo.png" alt="logo">
	    </div>
	    <div class="col-md-3"></div>
	    <div class="col-md-5">
	      <form class="form-inline">
            <div class="form-group">
              <input type="text" class="form-control" placeholder="Search">
            </div>
            <button type="submit" class="btn btn-default">搜索</button>
          </form>
        </div>
	  </div>
	</div>
</body>
<style>
	html{
		padding-top: 50px;
		background: #FFFFFF;
	}
	
	.header{
		margin-top: 30px;
		margin-bottom: 30px;
		margin-left: 200px;
	}
	
	.header img{
		height: 30px;
		width: 200px;
	}


	.navbar {
		min-height:34px;
		background-color: #F2F2F2;
	}
	.navbar-nav > li > a{
	    padding: 8px 15px;
	    color: #a4a4a4;
	    font-size:14px;
	    font-family: "Helvetica Neue",Helvetica,Arial,"Microsoft Yahei","Hiragino Sans GB","Heiti SC","WenQuanYi Micro Hei",sans-serif;
	}
</style>
</html>