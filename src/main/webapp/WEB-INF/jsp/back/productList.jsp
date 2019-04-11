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
<title>商品列表</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<%= basePath %>static/css/bootstrap.min.css" rel="stylesheet">
<script src="<%= basePath %>static/js/jquery-3.3.1.min.js"></script>
<script src="<%= basePath %>static/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="container">
	<h3 align="center">商品列表</h3><br>
	
	<div class="row">
  	  <div class="col-md-1"></div>
  	  <div class="col-md-10">
  	  	<!-- 展示商品列表 -->
	    <table class="table table-striped table-hover">
		  <tr>
			<th>序号</th>
			<th>名称</th>
			<th>价格</th>
			<th>查看</th>
			<th>删除</th>
		  </tr>
		  <c:forEach items="${products}" var="p" varStatus="st">
			<tr>
				<td>${ (page.index-1)*page.count+st.index+1}</td>
				<td>${ p.name }</td>
				<td>${ p.price }</td>
				<td>
				  <a href="<%= basePath %>back/userDetail?id=${ p.id }" class="btn btn-info">
				    <span class="glyphicon glyphicon-eye-open"></span>
				  </a>
				</td>
				<td>
				  <a href="<%= basePath %>back/deleteUser?id=${ p.id }" class="btn btn-danger">
				    <span class="glyphicon glyphicon-trash"></span>
				  </a>
				</td>
			</tr>
		  </c:forEach>
		  <tr>
		    <td colspan="5">
			  
			</td>
		  </tr>
	    </table>
	    <!-- 表格底部 -->
	    <div class="row">
		     
	      <!-- 分页 -->
	      <ul class="pagination no-margin pull-right">
 				<li><a href="?start=0">首  页</a></li>
		    <li>
		      <a href="?start=${page.start-page.count}&last=${page.last}&total=${page.total}">
		        &laquo;
		      </a>
		    </li>
		    <li class="active">
			  <span>${page.index} <span class="sr-only">(current)</span></span>
			 </li>
		     <li>
		        <a href="?start=${page.start+page.count}&last=${page.last}&total=${page.total}">
		          &raquo;
		        </a>
		     </li>
		     <li>
		       <a href="?start=${page.last}&last=${page.last}&total=${page.total}">末  页</a>
		     </li>
		  </ul>
	    </div>

  	  </div>
  	  <div class="col-md-1"></div>
	</div>	<!-- .row -->
  </div>	<!-- .container end -->
</body>
<style>
.table {
	font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
	font-size: 16px;
}
.table tbody tr td{
    vertical-align: middle;
}
</style>
</html>