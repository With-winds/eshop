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
<title>管理员登录</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<%= basePath %>static/css/bootstrap.min.css" rel="stylesheet">
<script src="<%= basePath %>static/js/jquery-3.3.1.min.js"></script>
<script src="<%= basePath %>static/js/bootstrap.min.js"></script>
<script src="<%= basePath %>static/js/bootstrapValidator.min.js"></script>
</head>
<body>

  <div class="container">
    <div class="row">
      <div class="col-md-offset-3 col-md-5 myForm">
         <form class="form-horizontal" action="<%= basePath %>back/login" method="post" id="loginForm">
           <span class="heading">管理员登录</span>
           <!-- 账号 -->
           <div class="form-group">
               <input type="text" class="form-control" id="username" name="username" placeholder="请输入账号">
               <i class="glyphicon glyphicon-user"></i>
           </div>
           <!-- 密码 -->
           <div class="form-group help">
               <input type="password" class="form-control" name="password" id="password" placeholder="请输入密码">
               <i class="glyphicon glyphicon-lock"></i>
           </div>
           <div class="form-group">
               <div class="main-checkbox">
                   <input type="checkbox" value="None" id="checkbox1" name="check"/>
                   <label for="checkbox1"></label>
               </div>
               <span class="text">Remember me</span>
               <button type="submit" class="btn btn-default">登录</button>
           </div>
           <div class="form-group" style="margin-bottom: 0">
           		<a class="pull-right" href="<%= basePath %>back/toRegister">没有账号？去注册</a>
           </div>
         </form>
      </div>
    </div>
  </div>

</body>

<script type="text/javascript">
$(document).ready(function() {
/**
 * 下面是进行插件初始化
 * 你只需传入相应的键值对
 * */
$('#loginForm').bootstrapValidator({
		message: 'This value is not valid',
		feedbackIcons: {                        /*输入框不同状态，显示图片的样式*/
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		fields: {                               /*验证*/
			username: {                         /*键名username和input name值对应*/
				message: 'The username is not valid',
				validators: {
					notEmpty: {                 /*非空提示*/
						message: '账号不能为空'
					},
					stringLength: {            /*长度提示*/
						min: 6,
						max: 20,
						message: '账号长度必须在6到20之间'
					},
				}
			},
			password: {
				message:'密码无效',
				validators: {
					notEmpty: {
						message: '密码不能为空'
					},
					stringLength: {
						min: 6,
						max: 20,
						message: '密码长度必须在6到20之间'
					},
					
				}
			}
		}
	});
});


</script>

<style>

body{
	background-color: #D2D6DE;
}

.myForm{
	margin-top: 150px;
}

.form-bg{
    background: #00b4ef;
}
.form-horizontal{
    background: #fff;
    padding-bottom: 40px;
    border-radius: 15px;
    text-align: center;
}
.form-horizontal .heading{
    display: block;
    font-size: 35px;
	color: #DBDBE4;    
    padding: 35px 0;
    border-bottom: 1px solid #f0f0f0;
    margin-bottom: 30px;
}
.form-horizontal .form-group{
    padding: 0 40px;
    margin: 0 0 25px 0;
    position: relative;
}
.form-horizontal .form-control{
    background: #f0f0f0;
    border: none;
    border-radius: 20px;
    box-shadow: none;
    padding: 0 20px 0 45px;
    height: 40px;
    transition: all 0.3s ease 0s;
}
.form-horizontal .form-control:focus{
    background: #e0e0e0;
    box-shadow: none;
    outline: 0 none;
}
.form-horizontal .form-group i{
    position: absolute;
    top: 12px;
    left: 60px;
    font-size: 17px;
    color: #c8c8c8;
    transition : all 0.5s ease 0s;
}
.form-horizontal .form-control:focus + i{
    color: #00b4ef;
}
.form-horizontal .fa-question-circle{
    display: inline-block;
    position: absolute;
    top: 12px;
    right: 60px;
    font-size: 20px;
    color: #808080;
    transition: all 0.5s ease 0s;
}
.form-horizontal .fa-question-circle:hover{
    color: #000;
}
.form-horizontal .main-checkbox{
    float: left;
    width: 20px;
    height: 20px;
    background: #11a3fc;
    border-radius: 50%;
    position: relative;
    margin: 5px 0 0 5px;
    border: 1px solid #11a3fc;
}
.form-horizontal .main-checkbox label{
    width: 20px;
    height: 20px;
    position: absolute;
    top: 0;
    left: 0;
    cursor: pointer;
}
.form-horizontal .main-checkbox label:after{
    content: "";
    width: 10px;
    height: 5px;
    position: absolute;
    top: 5px;
    left: 4px;
    border: 3px solid #fff;
    border-top: none;
    border-right: none;
    background: transparent;
    opacity: 0;
    -webkit-transform: rotate(-45deg);
    transform: rotate(-45deg);
}
.form-horizontal .main-checkbox input[type=checkbox]{
    visibility: hidden;
}
.form-horizontal .main-checkbox input[type=checkbox]:checked + label:after{
    opacity: 1;
}
.form-horizontal .text{
    float: left;
    margin-left: 7px;
    line-height: 20px;
    padding-top: 5px;
    text-transform: capitalize;
}
.form-horizontal .btn{
    float: right;
    font-size: 14px;
    color: #fff;
    background: #00b4ef;
    border-radius: 30px;
    padding: 10px 25px;
    border: none;
    text-transform: capitalize;
    transition: all 0.5s ease 0s;
}
@media only screen and (max-width: 479px){
    .form-horizontal .form-group{
        padding: 0 25px;
    }
    .form-horizontal .form-group i{
        left: 45px;
    }
    .form-horizontal .btn{
        padding: 10px 20px;
    }
}
</style>
</html>