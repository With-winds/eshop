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
<title>welcome</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<%= basePath %>static/css/bootstrap.min.css" rel="stylesheet">
<script src="<%= basePath %>static/js/jquery-3.3.1.min.js"></script>
<script src="<%= basePath %>static/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="container">
 	<h2 align="center">欢迎来到eshop电子商城后台管理</h2>
  </div>
</body>
</html>