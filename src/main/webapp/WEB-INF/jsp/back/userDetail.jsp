<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户详情</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<%= basePath %>static/css/bootstrap.min.css" rel="stylesheet">
<script src="<%= basePath %>static/js/jquery-3.3.1.min.js"></script>
<script src="<%= basePath %>static/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="container">
    <h3 align="center">用户详情</h3><br>
     <div class="col-md-4"></div>
     <div class="col-md-4">
    
      <div class="row">
        <div class="col-md-4">
        	<span>账号</span>
        </div>
        <div class="col-md-8">
        	<span>${ user.username }</span>
        </div>
      </div>
      <!-- 用户姓名 -->
      <div class="row">
        <div class="col-md-4">
        	<span>姓名</span>
        </div>
        <div class="col-md-8">
        	<span>${ user.realName }</span>
        </div>
      </div>
      <!-- 用户性别 -->
      <div class="row">
        <div class="col-md-4">
        	<span>性别</span>
        </div>
        <div class="col-md-8">
        	<span>${ user.sex }</span>
        </div>
      </div>
      <!-- 用户邮箱 -->
      <div class="row">
        <div class="col-md-4">
        	<span>邮箱</span>
        </div>
        <div class="col-md-8">
        	<span>${ user.email }</span>
        </div>
      </div>
      <!-- 用户电话 -->
      <div class="row">
        <div class="col-md-4">
        	<span>电话</span>
        </div>
        <div class="col-md-8">
        	<span>${ user.phone }</span>
        </div>
      </div>
      <!-- 用户地址-->
      <div class="row">
        <div class="col-md-4">
        	<span>地址</span>
        </div>
        <div class="col-md-8">
        	<span>${ user.address }</span>
        </div>
      </div>
	  <!-- 注册时间-->
      <div class="row">
        <div class="col-md-4">
        	<span>注册时间</span>
        </div>
        <div class="col-md-8">
        	<span>${ user.regDate }</span>
        </div>
      </div>
   </div>
  </div>

</body>
</html>