<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>个人信息</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<script src="static/js/jquery-3.3.1.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>

</head>
<body>
  
  <!-- 导航条和头部 -->
  <jsp:include   page="navbar.jsp" flush="true"/>
  
  <div class="container">
    <hr>
    
    <div class="panel panel-default">
  	  <div class="panel-heading">个人中心</div>
  	  <div class="panel-body">
  	    <!-- 用户账号 -->
        <div class="row">
          <div class="col-md-2">
          	<span>账号</span>
          </div>
          <div class="col-md-6">
          	<span>${ sessionScope.user.username }</span>
          </div>
        </div>
        <!-- 用户姓名 -->
        <div class="row">
          <div class="col-md-2">
          	<span>姓名</span>
          </div>
          <div class="col-md-6">
          	<span>${ sessionScope.user.realName }</span>
          </div>
        </div>
        <!-- 用户性别 -->
        <div class="row">
          <div class="col-md-2">
          	<span>性别</span>
          </div>
          <div class="col-md-6">
          	<span>${ sessionScope.user.sex }</span>
          </div>
        </div>
        <!-- 用户邮箱 -->
        <div class="row">
          <div class="col-md-2">
          	<span>邮箱</span>
          </div>
          <div class="col-md-6">
          	<span>${ sessionScope.user.email }</span>
          </div>
        </div>
        <!-- 用户电话 -->
        <div class="row">
          <div class="col-md-2">
          	<span>电话</span>
          </div>
          <div class="col-md-6">
          	<span>${ sessionScope.user.phone }</span>
          </div>
        </div>
        <!-- 用户地址-->
        <div class="row">
          <div class="col-md-2">
          	<span>地址</span>
          </div>
          <div class="col-md-6">
          	<span>${ sessionScope.user.address }</span>
          </div>
        </div>
		<!-- 注册时间-->
        <div class="row">
          <div class="col-md-2">
          	<span>注册时间</span>
          </div>
          <div class="col-md-6">
          	<span>${ sessionScope.user.regDate }</span>
          </div>
        </div>        
        
        
  	  </div>
  	  <div class="panel-footer">
  	  	<a class="btn btn-default" type="button">修改信息</a>
  	  </div>
  	</div>
    
  </div>

</body>
<style>

span{
	font-family:"Microsoft YaHei",微软雅黑,"MicrosoftJhengHei",华文细黑,STHeiti,MingLiu;
	font-size: 18px;
}

</style>
</html>