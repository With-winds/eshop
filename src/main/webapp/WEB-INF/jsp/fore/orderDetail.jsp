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
	      <td colspan="2" class="text-center">商品</td>
	      <td>单价</td>
	      <td>数量</td>
	      <td>交易操作</td>
	    </tr>
	  <c:forEach items="${orderDetails}" var="o" varStatus="st">
	    <tr>
	      <td><img src="${ o.product.image }" class="img-rounded pictrue"></td>
	      <td>
	      	<p class="product-name">${ o.product.name }</p>
	      	<c:if test="${o.color!=null}">
	      	  <p class="product-info">颜色:   ${ o.color }</p>
	      	</c:if>
	      	<c:if test="${o.version!=null}">
	      	  <p class="product-info">版本:   ${ o.version }</p>
	      	</c:if>
	      	<c:if test="${o.meal!=null}">
	      	  <p class="product-info">套餐:   ${ o.meal }</p>
	      	</c:if>
	      </td>
	      <td>${ o.product.price }</td>
	      <td>${ o.num }</td>
	      <td><a class="btn btn-default">评价</a></td>
	    </tr>
	  </c:forEach>
	</table>

  </div>	<!-- .container -->
</body>
<style>
	.pictrue{
		width: 80px;
		height: 80px;
	}
	.product-name{
		color: #3c3c3c;
		word-break: break-all;
		line-height: 16px;
	}
	.product-info{
		color: #9e9e9e;
		line-height: 16px;
	}
</style>
</html>