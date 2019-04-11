<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品列表</title>
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
    
    <table class="table table-hover">
	    <tr class="active">
	      <td>序号</td>
	      <td>订单时间</td>
	      <td>状态</td>
	      <td>总数量</td>
	      <td>总金额</td>
	      <td>明细</td>
	      <td>管理</td>
	    </tr>
	  <c:forEach items="${orderInfos}" var="o" varStatus="st">
	    <tr>
	      <td>${ st.index+1 }</td>
	      <td>${ o.orderTime }</td>
	      <td>${ o.status }</td>
	      <td>${ o.totalNum }</td>
	      <td>${ o.totalPrice }</td>
	      <td><a href="toOrderDetail?id=${ o.id }" class="btn btn-primary">查看</a></td>
	      <td><a href="deleteMyOrder?id=${ o.id }" class="btn btn-danger">删除</a></td>
	    </tr>
	  </c:forEach>
	</table>
  
  </div>	<!-- .container -->

</body>
</html>