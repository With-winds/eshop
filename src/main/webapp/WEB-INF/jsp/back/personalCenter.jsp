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
<title>管理员个人中心</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<%= basePath %>static/css/bootstrap.min.css" rel="stylesheet">
<script src="<%= basePath %>static/js/jquery-3.3.1.min.js"></script>
<script src="<%= basePath %>static/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="container">
    <h3 align="center">个人信息</h3><br>
    
    <div class="panel panel-default">
  	  <div class="panel-heading">个人中心</div>
  	  <div class="panel-body">
  	    <!-- 管理员账号 -->
        <div class="row">
          <div class="col-md-2">
          	<span>账号</span>
          </div>
          <div class="col-md-6">
          	<span>${ sessionScope.admin.username }</span>
          </div>
        </div>
        <!-- 管理员姓名 -->
        <div class="row">
          <div class="col-md-2">
          	<span>姓名</span>
          </div>
          <div class="col-md-6">
          	<span>${ sessionScope.admin.realName }</span>
          </div>
        </div>

		<!-- 注册时间-->
        <div class="row">
          <div class="col-md-2">
          	<span>注册时间</span>
          </div>
          <div class="col-md-6">
          	<span>${ sessionScope.admin.regDate }</span>
          </div>
        </div>        
        
        
  	  </div>
  	  <div class="panel-footer">
  	  	<a class="btn btn-default" type="button">修改信息</a>
  	  </div>
  	</div>
    
  </div>
</body>
</html>