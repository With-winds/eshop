<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<script src="static/js/jquery-3.3.1.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>
<script src="static/js/bootstrapValidator.min.js"></script>
</head>
<body>
  <div class="container">
    <div class="row">
      <div class="col-md-offset-3 col-md-5 myForm">
         <form class="form-horizontal" action="register" method="post" id="registerForm">
           <span class="heading">用户注册</span>
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
		   <!-- 确认密码 -->
           <div class="form-group help">
               <input type="password" class="form-control" name="rePassword" id="rePassword" placeholder="请确认密码">
               <i class="glyphicon glyphicon-lock"></i>
           </div>
		   <!-- 姓名 -->
           <div class="form-group">
               <input type="text" class="form-control" id="realName" name="realName" placeholder="请输入姓名">
               <i class="glyphicon glyphicon-user"></i>
           </div>
		    <!-- 性别 -->
           <div class="form-group">
           	   <div class="col-md-4">
			       <label class="radio-inline">
			        <input type="radio" name="sex" id="sex" value="男" >男
			       </label>
			       <label class="radio-inline">
			        <input type="radio" name="sex" id="sex" value="女" >女
			       </label>
	      	  </div>
           </div>
		   <!-- 邮箱 -->
           <div class="form-group">
               <input type="email" class="form-control" id="email" name="email" placeholder="请输入邮箱">
               <i class="glyphicon glyphicon-envelope"></i>
           </div>
		   <!-- 电话 -->
           <div class="form-group">
               <input type="text" class="form-control" id="phone" name="phone" placeholder="请输入电话">
               <i class="glyphicon glyphicon-phone"></i>
           </div>
		   <!-- 地址 -->
           <div class="form-group">
               <input type="text" class="form-control" id="address" name="address" placeholder="请输入地址">
               <i class="glyphicon glyphicon-home"></i>
           </div>
           <div class="form-group">
               
               <button type="submit" class="btn btn-default">注册</button>
           </div>
           <div class="form-group" style="margin-bottom: 0">
           		<a class="pull-right" href="toLogin">已有账号？去登录</a>
           </div>
         </form>
      </div>
    </div>
  </div>
</body>

<script type="text/javascript">
$(document).ready(function() {

//表单验证
$('#registerForm').bootstrapValidator({
	message: 'This value is not valid',
	feedbackIcons: {                        //输入框不同状态，显示图片的样式
		valid: 'glyphicon glyphicon-ok',
		invalid: 'glyphicon glyphicon-remove',
		validating: 'glyphicon glyphicon-refresh'
	},
	fields: {                               //验证域
		
		//校验用户账号
		username: {                         //键名username和input的name属性值对应
			message: 'The username is not valid',
			threshold :  6 , //有6字符以上才发送ajax请求，（input中输入一个字符，插件会向服务器发送一次，设置限制，6字符以上才开始）
			validators: {
				notEmpty: {                 //非空提示
					message: '账号不能为空'
				},
				stringLength: {            //长度提示
					min: 6,
					max: 20,
					message: '用户账号长度必须在6到20之间'
				},                         
				regexp: {                  //正则表达式匹配
					regexp: /^[0-9a-zA-Z_]+$/,
					message: '账号由数字或者字母、下划线组成'
				},
				
				//ajax验证。服务器返回{"valid",true}证明该账号可用，反之不可用并出现提示信息。
				remote: {
					url: 'checkUserNotExist.ajax',          //验证地址
					message: '用户已存在',      //提示消息
					delay :  2000,  //每输入一个字符，就发ajax请求，服务器压力还是太大，设置2秒发送一次ajax（默认输入一个字符，提交一次，服务器压力太大）
					type: 'GET'           //请求方式
					
				}
			}
		},
		
		//校验用户密码
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
				regexp: {                  //正则表达式匹配
					regexp: /^[a-zA-Z0-9_\.]+$/,
					message: '密码只能由字母、数字、点和下划线组成'
				},
				different: {                //不能和用户名相同
					field: 'username',     //需要进行比较的input name值
					message: '不能和用户名相同'
				}
			}
		},
		
		//校验确认密码
		rePassword: {
			message: '密码无效',
			validators: {
				notEmpty: {
					message: '密码不能为空'
				},
				stringLength: {
					min: 6,
					max: 20,
					message: '密码长度必须在6到20之间'
				},
				identical: {              //密码和确认密码要相同
					field: 'password',     //需要进行比较的input name值
					message: '两次密码不一致'
				}
			}
		},
		
		//校验用户的名字
		realName: {
			message: 'The name is not valid',
			validators: {
				notEmpty: {                 //非空提示
					message: '姓名不能为空'
				},
				stringLength: {            //长度提示
					min: 2,
					max: 30,
					message: '姓名长度必须在2到30之间'
				}
			}
		},
		
		//校验用户的性别
		sex: {
			message: 'The name is not valid',
			validators: {
				notEmpty: {                 //非空提示
					message: '性别不能为空'
				}
			}
		},
		
		//校验邮箱
		email: {
			validators: {
				notEmpty: {
					message: '邮箱不能为空'
				},
				emailAddress: {
					message: '请输入正确的邮件地址如：123@qq.com'
				}
			}
		},
		
		//校验手机号码
		phone: {
			message: 'The phone is not valid',
			validators: {
				notEmpty: {
					message: '手机号码不能为空'
				},
				stringLength: {
					min: 11,
					max: 11,
					message: '请输入11位手机号码'
				},
				regexp: {
					regexp: /^1[3|5|8]{1}[0-9]{9}$/,
					message: '请输入正确的手机号码'
				}
			}
		},
		
		//校验用户的地址
		address: {
			message: 'The name is not valid',
			validators: {
				notEmpty: {                 //非空提示
					message: '地址不能为空'
				},
				stringLength: {            //长度提示
					min: 5,
					max: 50,
					message: '地址长度必须在5到50之间'
				}
			}
		},
		
	}
});
});
</script>

<style>

body{
	background-color: #D2D6DE;
}

.myForm{
	margin-top: 100px;
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
    font-size: 30px;
	color: #DBDBE4;    
    padding: 20px 0;
    border-bottom: 1px solid #f0f0f0;
    margin-bottom: 20px;
}
.form-horizontal .form-group{
    padding: 0 40px;
    margin: 0 0 15px 0;
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