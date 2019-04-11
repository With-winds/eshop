<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>eshop主页</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<script src="static/js/jquery-3.3.1.min.js"></script>
<script src="static/js/style.js"></script>
<script src="static/js/bootstrap.min.js"></script>
</head>
<body>
  <!-- 导航条和头部 -->
  <jsp:include   page="navbar.jsp" flush="true"/>
  <div class="container-fluid">


   <div class="row">

	<div class="div1">
	
	  <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
		  <!-- Indicators -->
		  <ol class="carousel-indicators">
		    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
		    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
		    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
		  </ol>
		
		  <!-- Wrapper for slides -->
		  <div class="carousel-inner" role="listbox">
		  
		    <div class="item active">
		      <img src="https://res.vmallres.com/pimages//sale/2019-02/zXymKQgH7JcY7lxoALv1.jpg" style="height: 500px;">
		    </div>
		    
		    <div class="item">
		      <img src="https://res.vmallres.com/pimages//sale/2019-02/h6F0vuCGtFKEoAyiM2gX.jpg" style="height: 500px;">
		    </div>
		    
		    <div class="item">
		      <img src="https://res.vmallres.com/pimages//sale/2019-02/Px1UVzq1OPAfIVNwBHX2.jpg" style="height: 500px;">
		    </div>
		    
		  </div>
		
		  <!-- Controls -->
		  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
		    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
		    <span class="sr-only">Previous</span>
		  </a>
		  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
		    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
		    <span class="sr-only">Next</span>
		  </a>
	  </div>
	</div> 
		
	  <div class="div2">
		<div class="containor">
		
		  <!-- 分类导航栏左边 -->
		  <div class="nav_left">
		    <ul>
		      <c:forEach items="${firstCategories}" var="f" varStatus="st">
		        <li data-id="${ st.index+1 }"> <span>${ f.name }</span></li>
		      </c:forEach>
		    </ul>
		  </div>
		  
		  <!-- 分类导航栏右边 -->
		  <div class="nav_right">
		   <c:forEach items="${firstCategories}" var="f" varStatus="st">
			<div class="sub hide" data-id="${ st.index+1 }">
			  <dl>
			   <dd>
			   <c:forEach items="${f.categories}" var="c">
			    <a href="selectProductByCategoryId?category_id=${ c.id }">
			      <img src="${ c.icon }" class="icon ">${ c.name }
			    </a>
			   </c:forEach>
			   </dd>
			  </dl>
			</div>
		   </c:forEach>
		  </div>
		  
		</div>	<!-- .containor -->
	  </div>
	
	


  </div><!-- .row -->
   

  </div>	<!-- container-fluid -->
</body>
<style>


	.div1{
		position:absolute;
		z-index:-1
	}
	.div2{
		width: 1000px;
		position: absolute;
		z-index:1;
		left:200px;
	}
</style>
</html>