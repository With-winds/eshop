<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
       <a>${productDetail.title}</a>
    </p>
  
    <hr>
    <div class="row">
	  <div class="col-md-4">
	    <img src="${ productDetail.image }" class="img-responsive" alt="${ productDetail.title }">
	  </div>
	  <div class="col-md-8">
	  
	    <h3>${ productDetail.title }</h3>
	    <h5><i>${ productDetail.subTitle }</i></h5>
	    
	   <div class="product-info">
	   
	    <!-- 价格 -->
	    <div class="row">
	      <div class="col-md-2"><p>价格</p></div>
	      <div class="col-md-10"><p>¥${ productDetail.price }</p></div>
	    </div>
	    
	    <!-- 优惠券 -->
	    <c:if test="${productDetail.coupon!=null}">
	    <div class="row">
	      <div class="col-md-2"><p>优惠券</p></div>
	      <div class="col-md-10"><p>${ productDetail.coupon }</p></div>
	    </div>
	    </c:if>
	    
	    <!-- 促销 -->
	    <c:if test="${(fn:length(productDetail.promotions))!=0}">
	    <div class="row">
	      <div class="col-md-2"><p>促销</p></div>
	      <div class="col-md-10">
	        <p>
	        	<c:forEach items="${productDetail.promotions}" var="p">
	    			<span>${ p.promotion }</span><br>
	    		</c:forEach>
	    	</p>
	      </div>
	    </div>
	    </c:if>
	    
	   </div>
	   
	    <!-- 服务说明 -->
	    <div class="row">
	      <div class="col-md-2"><p>服务说明</p></div>
	      <div class="col-md-10"><p>${ productDetail.serviceDesc }</p></div>
	    </div>
	    
	    <!-- 商品编码 -->
	    <div class="row">
	      <div class="col-md-2"><p>商品编码</p></div>
	      <div class="col-md-10"><p>${ productDetail.code }</p></div>
	    </div>
	    
	    <hr><!-- 分割线 -->
	    
	    <form action="addToShopcart">
	    
	    <!-- 商品ID -->
	    <input type="hidden" name="id" value="${ productDetail.id }">
	    
	    <!-- 选择颜色 -->
	    <c:if test="${(fn:length(productDetail.colors))!=0}">
	    <div class="row">
	      <div class="col-md-2"><p class="choice-line">选择颜色</p></div>
	      <div class="col-md-10">
	        <p class="choice-line">
	      	  <c:forEach items="${productDetail.colors}" var="c" varStatus="st">
	      	  
	      	   <c:choose>
	      	    
	      	    <c:when test="${ st.index == 0}">
	      	     <label class="choice selected" for="color${ st.index+1 }">
	    		  <input style="display:none;" id="color${ st.index+1 }" type="radio" name="color" value="${ c.color }" checked>
	    		   <img class="icon" src="${ c.image }"><span>${ c.color }</span>
	    		  </input>
	    	     </label>
	      	    </c:when>
	      	    
	      	    <c:otherwise>
	      	     <label class="choice" for="color${ st.index+1 }">
	    		  <input style="display:none;" id="color${ st.index+1 }" type="radio" name="color" value="${ c.color }">
	    		   <img class="icon" src="${ c.image }"><span>${ c.color }</span>
	    		  </input>
	    	     </label>
	      	    </c:otherwise>
	      	   </c:choose>
	      	   
	    	  </c:forEach>
	        </p>
	      </div>
	    </div>
	    </c:if>
	    
	    <!-- 选择版本 -->
	    <c:if test="${(fn:length(productDetail.versions))!=0}">
	    <div class="row">
	      <div class="col-md-2"><p class="choice-line">选择版本</p></div>
	      <div class="col-md-10">
	        <p class="choice-line">
	      	  <c:forEach items="${productDetail.versions}" var="v" varStatus="st">
	      	  
	      	   <c:choose>
	      	    
	      	    <c:when test="${ st.index == 0}">
	      	     <label class="choice selected" for="version${ st.index+1 }">
	    		  <input style="display:none;" id="version${ st.index+1 }" type="radio" name="version" value="${ v.version }" checked>
	    		   <span>${ v.version }</span>
	    		  </input>
	    	     </label>
	      	    </c:when>
	      	    
	      	    <c:otherwise>
	      	     <label class="choice" for="version${ st.index+1 }">
	    		  <input style="display:none;" id="version${ st.index+1 }" type="radio" name="version" value="${ v.version }">
	    		   <span>${ v.version }</span>
	    		  </input>
	    	     </label>
	      	    </c:otherwise>
	      	   </c:choose>
	      	   
	    	  </c:forEach>
	        </p>
	      </div>
	    </div>
	    </c:if>
	    
	    <!-- 选择套餐 -->
	    <c:if test="${(fn:length(productDetail.meals))!=0}">
	    <div class="row">
	      <div class="col-md-2"><p class="choice-line">选择套餐</p></div>
	      <div class="col-md-10">
	        <p class="choice-line">
	      	  <c:forEach items="${productDetail.meals}" var="m" varStatus="st">
	      	   <c:choose>
	      	    
	      	    <c:when test="${ st.index == 0}">
	      	     <label class="choice selected" for="meal${ st.index+1 }">
	    		  <input style="display:none;" id="meal${ st.index+1 }" type="radio" name="meal" value="${ m.meal }" checked>
	    		   <span>${ m.meal }</span>
	    		  </input>
	    	     </label>
	      	    </c:when>
	      	    
	      	    <c:otherwise>
	      	     <label class="choice" for="version${ st.index+1 }">
	    		  <input style="display:none;" id="meal${ st.index+1 }" type="radio" name="meal" value="${ m.meal }">
	    		   <span>${ m.meal }</span>
	    		  </input>
	    	     </label>
	      	    </c:otherwise>
	      	   </c:choose>
	    	  </c:forEach>
	        </p>
	      </div>
	    </div>
	    </c:if>
	    
	    <!-- 选择的商品 -->
	    <p></p>
	    
	    <div class="row">
	     <div class="col-md-2">
	       <div class="product-stock">
	        <input id="quantity" name="quantity" type="text" class="product-stock-text" placeholder="1" value="1">
	        <p class="product-stock-btn">
	          <a id="plus" style="border-bottom: 1px solid #e2e2e2;">+</a>
	          <a id="minus">−</a>
	        </p>
	       </div>
	     </div>
	     <div class="col-md-10">
	       <button type="submit" class="product-input">加入购物车</button>
	     </div>
	    </div>
	    
	    </form>
	    
	  </div>			 <!-- .container/.row/.col-md-8  end -->
	</div>			   <!-- .container/.row  end -->
	
	<hr>
	
	<!-- 用户评论 -->
	<div class="row">
	  <h3>用户评论</h3>
	  
	  <hr>
	  
	  <c:forEach items="${comments}" var="c" varStatus="st">
	    <div class="row">
	  	  <div class="col-md-1"><span>${ c.user.realName }</span></div>
	  	  <div class="col-md-10"><span>${ c.content }</span></div>
	  	  <div class="col-md-1"></div>
	  	</div>
	  	<br>
	  	<div class="row">
	  	  <div class="col-md-1"></div>
	  	  <div class="col-md-10"><span class="comment-time">${ c.commentDate }</span></div>
	  	  <div class="col-md-1"></div>
	  	</div>
	  	<br>
	  </c:forEach>
	  
	</div>
	
  </div>       <!-- .container end -->

</body>

<script>

//选中商品的颜色、版本、套餐
$('label').on('click', function() {
	//点击当前label元素后是用removeClass()删除所有兄弟元素（使用siblings()获取）的class样式，
	//然后使用addClass()为当前的 li 添加class，从而达到了切换class的位置。
	$(this).addClass('selected');
    $(this).siblings().removeClass('selected');
});	

//点击添加商品数量时
$('#plus').on('click', function() {
	var quantity=$('#quantity').val();
	quantity=parseInt(quantity);
	$('#quantity').val(quantity+1);
});

//点击减少商品数量时
$('#minus').on('click', function() {
	var quantity=$('#quantity').val();
	quantity=parseInt(quantity);
	if (quantity>1) {		
		$('#quantity').val(quantity-1);
	}
});

</script>

<style>

	body{
		font: 16px Microsoft YaHei, arial, sans-serif;
	}
	
	.product-info{
		background-color: #F5F5F5;
		margin: 30px 0;
	}
	
	.choice-line {
		line-height : 35px;
	}
	
	.icon {
		width: 30px;
	    height: 30px;
	    float: left;
	    margin-top: 2px;
	}
	
	.choice {
		display:inline-block;
	    border: 1px solid #a4a4a4;
	    text-align: center;
	    height: 35px;
	    border-radius: 2px;
	    position: relative;
	    padding: 0 8px;
	    font-family:"微软雅黑"	;
	    font-weight: normal;
	}
	
	.selected {
		display:inline-block;
	    text-align: center;
	    height: 35px;
	    border-radius: 2px;
	    position: relative;
	    padding: 0 8px;
	    font-family:"微软雅黑"	;
	    font-weight: normal;
		border: 1px solid #ca141d;
	}
	
	.product-stock {
	    float: left;
	    border: 1px solid #d6d6d6;
	    margin-left: 10px;
	    margin-right: 10px;
	    border-radius: 2px;
	}
	
	.product-stock-text {
		float: left;
	    width: 41px;
	    height: 44px;
	    line-height: 44px;
	    border: 0;
	    font-size: 18px;
	    text-align: center;
	    border-right: 1px solid #e2e2e2;
	}
	
	.product-stock-btn {
	    width: 21px;
	    float: left;
	}
	
	.product-stock .product-stock-btn a {
	    display: block;
	    font-size: 16px;
	    width: 21px;
	    height: 21px;
	    line-height: 22px;
	    text-align: center;
	    color: #777;
	    font-weight: bold;
	}
	
	.product-input {
		display: block;
	    background: #fc600c;
	    width: 172px;
	    height: 46px;
	    font-size: 18px;
	    line-height: 46px;
	    text-align: center;
	    color: #fff;
	    border-radius: 2px;
	    border: 0;
	    cursor: pointer;
	}
	
	a:hover {
		text-decoration:none;
	}
	
	
	.comment-time {
	    font-size: 14px;
	    color: #a4a4a4;
	    margin-top: 21px;
	}
	
</style>

</html>