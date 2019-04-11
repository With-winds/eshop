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
      <tr>
        <td>编号</td>
        <td>商品名称</td>
        <td>单价</td>
        <td>数量</td>
        <td>金额</td>
        <td>删除</td>
      </tr>
      <c:set var="sumPrice" value="0"/>
      <c:forEach items="${cart}" var="c" varStatus="st">
       <tr>
        <td>${ st.index+1 }</td>
        <td>${ c.value.product.name }</td>
        <td>${ c.value.product.price }</td>
        <td><input type="text" value="${ c.value.quantity }" size="10" onchange="window.location='updateQuantity?id=${ c.value.id }&quantity='+this.value;"></td>
        <td>¥${ c.value.product.price*c.value.quantity }</td>
        <td><a href="deleteCartItem?id=${ c.value.id }">删除</a></td>
       </tr>
       <c:set var="sumPrice" value="${ sumPrice+c.value.product.price*c.value.quantity }"/>
      </c:forEach>
      <tr class="active">
       <td>合计</td>
       <td></td>
       <td></td>
       <td></td>
       <td>¥${ sumPrice }</td>
       <td></td>
      </tr>
    </table>
    
    <div class="row">
      <div class="col-md-4">
        <a href="clearCart" class="btn btn-primary">清空购物车</a>
      </div>
      <div class="col-md-4">
        <a href="index" class="btn btn-primary">继续购物</a>
      </div>
      <div class="col-md-4">
        <a href="payment" class="btn btn-primary">确认提交订单</a>
      </div>     
    </div>
  
  </div>

</body>
</html>