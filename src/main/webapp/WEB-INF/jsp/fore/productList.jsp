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
    
    <p><a href="index">首页</a> &nbsp;&gt;&nbsp; 
       <a>${firstCategory.name}</a>&nbsp;&gt;&nbsp; 
       <a href="selectProductByCategoryId?category_id=${ category.id }">${category.name}</a>
    </p>
	<hr>
	<div class="row">
	 <c:forEach items="${products}" var="p" varStatus="st">
	  <div class="col-sm-6 col-md-3">
	   
	    <div class="p-panels">
	      
	      <!-- 商品图片 -->
	      <p class="p-img">
	        <a href="showProductDetail?id=${ p.id }">
	          <img src="${ p.image }" alt="${ p.name }" class="image">
	        </a>
	      </p>
	      
	      <!-- 商品名称 -->
	      <p class="p-name">
	        <a href="showProductDetail?id=${ p.id }">${ p.name }</a>
	      </p>
	      
	      <!-- 商品价格 -->
	      <p class="p-price"><b>¥${ p.price }</b></p>
	      <div class="p-button">
	        <table>
	         <tbody>
	          <tr>
	            <td id="buy"><a class="p-button-an">选购</a></td>
	            <td><label>${ p.commentNum }人评价</label></td>
	          </tr>
	         </tbody>
	        </table>
	      </div>
	    </div>
	   
	  </div>
	 </c:forEach>
	</div>
	
  </div>  <!-- /.container -->
</body>
<style>

	.p-panels {
	    margin: 0 20px 20px 0;
	    border: 1px solid #dedede;
	    height: 362px;
	    position: relative;
	    text-align: center;
	    font-family: 'Tahoma',"Microsoft Yahei";
	    overflow: hidden;
	}
	
	.p-panels:hover{
		border-color: #FF0036;
	}
	
	.p-img {
	    padding: 38px 0 24px;
	    text-align: center;
	}
	
	.image{
		height: 180px;
		width: 180px;
		vertical-align: top;
	}
	
	.p-name {
	    line-height: 16px;
	    padding: 0 20px;
	    min-height: 25px;
	    overflow: hidden;
	}
	
	.p-price {
	    color: #e01d20;
	    line-height: 30px;
	}
	
	.p-price b {
	    font-size: 18px;
	    font-weight: 400;
	    font-family: Arial,Helvetica,sans-serif;
	}
	
	.p-button {
	    position: absolute;
	    left: -1px;
	    width: 100%;
	    bottom: -1px;
	}
	
	.p-button table {
	    width: 100%;
	    table-layout: fixed;
	    border-collapse: collapse;
	}
	
	tbody {
	    display: table-row-group;
	    vertical-align: middle;
	    border-color: inherit;
	}
	
	tr {
	    display: table-row;
	    vertical-align: inherit;
	    border-color: inherit;
	}
	
	.p-button td {
	    border-top: 1px solid #dedede;
	    border-left: 1px solid #dedede;
	}
	
	.p-button-an {
	    color: #e01d20;
	}
	
	
	#buy:hover {
		background-color: #FF0036;
	}
	
	#buy:hover .p-button-an{
		text-decoration:none;
		color: #FFF;
	}
	
	.p-button label {
	    display: block;
	    height: 30px;
	    line-height: 30px;
	    color: #666;
	    overflow: hidden;
	    white-space: nowrap;
	}
	
	a:hover {
		text-decoration:none;
	}
	

</style>
</html>
