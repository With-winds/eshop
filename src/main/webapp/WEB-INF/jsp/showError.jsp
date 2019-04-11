<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>出错了</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<script src="static/js/jquery-3.3.1.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>

</head>
<body>
  
  <!-- 导航条和头部 -->
  <jsp:include   page="fore/navbar.jsp" flush="true"/>

  <div class="container">
    <hr>
  
	<h2>出错了</h2>
	<hr>
	<p>${ message }</p>
  </div>
</body>
</html>