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
<title>eshop后台主页</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<%= basePath %>static/css/bootstrap.min.css" rel="stylesheet">
<script src="<%= basePath %>static/js/jquery-3.3.1.min.js"></script>
<script src="<%= basePath %>static/js/bootstrap.min.js"></script>
</head>
<body>

	<!--顶部导航栏部分-->
	<nav class="navbar navbar2">
	    <div class="container-fluid">
			<!-- logo设置 -->
			<div class="navbar-header">
				<a class="logo" title="logoTitle" href="home">eshop</a>
		   </div>
		   
		   <div class="collapse navbar-collapse">
			   <ul class="nav navbar-nav navbar-right">
				   <li role="presentation">
					   <a href="<%= basePath %>back/personalCenter" target="mainFrame">
					   	当前用户：<span class="badge">${ sessionScope.admin.realName }</span>
					   </a>
				   </li>
				   <li>
					   <a href="<%= basePath %>back/logout"><span class="glyphicon glyphicon-lock"></span>退出登录</a>
					</li>
				</ul>
		   </div>
		   
		</div>   <!-- .container-fluid -->   
	</nav>

	<!-- 中间主体内容部分 -->
	<div class="pageContainer">
		 <!-- 左侧导航栏 -->
		<div class="pageSidebar">
			<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
		
				<!-- 个人中心 -->
				<div class="panel2">
		
					<div class="panel-heading" role="tab">
					  <h4 class="panel-title">
						<a href="<%= basePath %>back/personalCenter" target="mainFrame">
						 <span class="glyphicon glyphicon-fire"></span>
						  个人中心
						</a>
					  </h4>
					</div>
		
				</div>
		
				<!-- 用户管理 -->
				<div class="panel2">
		
					<div class="panel-heading" role="tab" id="headingOne">
						<h4 class="panel-title">
							<a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
							 	<span class="glyphicon glyphicon-user"></span>
							 	 用户管理
							 	 <span class="glyphicon glyphicon-menu-left pull-right"></span>
							</a>
						</h4>
					</div>
		
					<div id="collapseOne" class="collapse panel3" role="tabpanel" aria-labelledby="headingOne">
						<div class="panel-body">	
							<p>
								<span class="glyphicon glyphicon-record"></span>
								<a href="<%= basePath %>back/userList" target="mainFrame">用户列表</a>
							</p>
							<p>
								<span class="glyphicon glyphicon-record"></span>
								<a href="<%= basePath %>back/adminList" target="mainFrame">管理员列表</a>
							</p>
						</div>
					</div>
				</div>
		
				<!-- 商品管理 -->
				<div class="panel2">
		
					<div class="panel-heading" role="tab" id="headingTwo">
					    <h4 class="panel-title">
							<a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
							 	<span class="glyphicon glyphicon-gift"></span>
							 	 商品管理
							  	<span class="glyphicon glyphicon-menu-left pull-right"></span>
							</a>
					    </h4>
					</div>
		
					<div id="collapseTwo" class="collapse panel3" role="tabpanel" aria-labelledby="headingTwo">
					    <div class="panel-body">	
							<p>
								<span class="glyphicon glyphicon-record"></span>
								<a href="<%= basePath %>back/productList" target="mainFrame">商品列表</a>
							</p>
							<p>
								<span class="glyphicon glyphicon-record"></span>
								<a href="nav2.html" target="mainFrame">添加商品</a>
							</p>
					    </div>
					</div>
				</div>
		
				<!-- 分类管理 -->
				<div class="panel2">
		
					<div class="panel-heading" role="tab" id="headingThree">
					    <h4 class="panel-title">
							<a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="true" aria-controls="collapseThree">
								<span class="glyphicon glyphicon-screenshot"></span>
								分类管理
								<span class="glyphicon glyphicon-menu-left pull-right"></span>
							</a>
					    </h4>
					</div>
		
					<div id="collapseThree" class="collapse panel3" role="tabpanel" aria-labelledby="headingThree">
					    <div class="panel-body">	
							<p>
								<span class="glyphicon glyphicon-record"></span>
								<a href="nav1.html" target="mainFrame">分类列表</a>
							</p>
							<p>
								<span class="glyphicon glyphicon-record"></span>
								<a href="nav2.html" target="mainFrame">添加分类</a>
							</p>
					    </div>
					</div>
				</div>
				
				<!-- 订单管理 -->
				<div class="panel2">
		
					<div class="panel-heading" role="tab">
					  <h4 class="panel-title">
						<a role="button" href="nav2.html" target="mainFrame">
							<span class="glyphicon glyphicon-duplicate"></span>
						  	订单管理
						</a>
					  </h4>
					</div>
		
				</div>
				
				<!-- 评论管理 -->
				<div class="panel2">
		
					<div class="panel-heading" role="tab">
					  <h4 class="panel-title">
						<a role="button" href="nav2.html" target="mainFrame">
							<span class="glyphicon glyphicon-erase"></span>
						  	评论管理
						</a>
					  </h4>
					</div>
		
				</div>
				
			</div>
		
		
		</div>

		<!-- 左侧导航和正文内容的分隔线 -->
		<div class="splitter"></div>
		
		<!-- 正文内容部分 -->
		<div class="pageContent">
		   <iframe src="<%= basePath %>back/welcome" id="mainFrame" name="mainFrame" 
				frameborder="0" width="100%"  height="100%" frameBorder="0">
		   </iframe> 
		</div>

	</div>		<!-- 主体部分结束 -->
	
	<!-- 底部页脚部分 -->
	<div class="footer">
		<p class="text-center">
			2019 © eshop电子商城.
		</p>
	</div>


</body>
<script type="text/javascript">

</script>
<style>

.navbar2{
	background-color: #3c8dbc;
	border: none;
    border-radius: 0;
    margin-bottom: 0;
}

.logo {
    height: 50px;
    font-size: 29px;
    line-height: 50px;
    text-align: center;
    font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
    font-weight: 300;
    overflow: hidden;
}

.navbar2 a{
	color: #FFF;
}

.nav>li{
    text-align: center;
}
.nav>li>a{
    color:#444;
    margin: 0 5px;
}
.nav>li>a:hover,.nav>li>a:focus,.nav>li>a:active{
    background-color: #367FA9;
}

body {
   width: 100%;
   height: 100%;
   margin: 0;
   overflow: hidden;
   background-color: #FFFFFF;
   font-family: "Microsoft YaHei", sans-serif;
}



.pageContainer{
    bottom: 0;
    left:0;
    right: 0;
    top: 50px;
    overflow: auto;
    position: absolute;
    width: 100%;
}
.pageSidebar{
   width: 240px;
   height:100%;
   padding-bottom: 30px;
   padding-top: 40px;
   margin-top:0;
   overflow: auto;
   background-color: #222D34;
}
.panel2{
	background-color: #222D32;
	color: #b8c7ce;
	border: none;
    border-radius: 0;
}
.panel2:hover{
	background-color: #1E282C;
	color: #FFF;
}
a:hover,a:active,a:focus{
	text-decoration: none;
}
.panel3{
	background-color: #2C3B41;
	color: #b8c7ce;
}
.panel3 a{
	color: #b8c7ce;
}
.panel3 a:hover{
	color: #b8c7ce;
	color: #FFF;
}
.splitter {
    width: 5px;
    height: 100%;
    bottom: 0;
    left: 240px;
    position: absolute; 
    overflow: hidden;
    background-color: #fff;
}
.pageContent{
    height: 100%;
    min-width: 768px;
    left: 246px;
    top: 0;
    right: 0;
    z-index: 3;
    padding-bottom: 30px;
    position: absolute;
}
.footer {
    width: 100%;
    height: 30px;
    line-height: 30px;
    margin-top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    position: absolute; 
    z-index: 10;
    background-color:#DFDFDF;
}



</style>
</html>