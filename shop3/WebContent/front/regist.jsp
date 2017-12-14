<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>注册</title>
    <link href="../static/css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="../static/js/jquery.min.js"></script>
    <!-- Custom Theme files -->
    <!--theme-style-->
    <link href="../static/css/style.css" rel="stylesheet" type="text/css" media="all" />	
    <!--//theme-style-->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="" />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<link href='http://fonts.useso.com/css?family=Raleway' rel='stylesheet' type='text/css'>
	<link href='http://fonts.useso.com/css?family=Poiret+One' rel='stylesheet' type='text/css'>
	<!-- start menu -->
	<script src="../static/js/bootstrap.min.js"></script>
	<script src="../static/js/simpleCart.min.js"> </script>
	<!-- slide -->
	<script src="../static/js/responsiveslides.min.js"></script>
    <script>
    	$(function () {
      		$("#slider").responsiveSlides({
      			auto: true,
      			speed: 500,
        		namespace: "callbacks",
        		pager: true,
      		});
    	});
    </script>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="col-sm-4 logo">
				<h1><a href="index.html">Youth </a></h1>	
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<div class="container">
		<div class="head-top">	
		    <div class="clearfix"> </div>
			<!---pop-up-box---->   
			<link href="../static/css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
			<script src="../static/js/jquery.magnific-popup.js" type="text/javascript"></script>
			<!---//pop-up-box---->
			<div id="small-dialog" class="mfp-hide">
				<div class="search-top">
					<div class="login">
						<form action="#" method="post">
							<input type="submit" value="">
							<input type="text" name="search" value="Type something..." onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = '';}">		
						</form>
					</div>
					<p>	Shopping</p>
				</div>				
			</div>
			<script>
				$(document).ready(function() {
				    $('.popup-with-zoom-anim').magnificPopup({
						type: 'inline',
						fixedContentPos: false,
						fixedBgPos: true,
						overflowY: 'auto',
						closeBtnInside: true,
						preloader: false,
						midClick: true,
						removalDelay: 300,
						mainClass: 'my-mfp-zoom-in'
					});																	
				});
			</script>				
		</div>
	</div>
</div>
<!--//header-->
<div class="breadcrumbs">
	<div class="container">
		<ol class="breadcrumb breadcrumb1 animated wow slideInLeft animated" data-wow-delay=".5s" style="visibility: visible; animation-delay: 0.5s; animation-name: slideInLeft;">
			<li><a href="index.html"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
			<li class="active">注册</li>
		</ol>
	</div>
</div>
<div class="container">
	<div class="register">
		<h2>注册</h2>
		  	<form action="${ctx }/user/addUser" method="post">
				<div class="col-md-6  register-top-grid">
					<div class="mation">
						<span>姓名</span>${userNameError }
						<input type="text" name="userName"> 
					 
						 <span>Email</span>
						 <input type="text" name="email"> 
						 
						 <span>地址</span>
						 <input type="text" name="address"> 
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class=" col-md-6 register-bottom-grid">
					<div class="mation">
						<span>密码</span>
						<input type="password" name="pwd">
						<span>确认密码</span>
						<input type="password" name="repwd">
						<span>上传头像</span>
						<input type="file" name="avatar">
					</div>
				</div>
			    <div class="clearfix"> </div>
			  <center>
				<div class="register-but">
					  <input type="submit" value="提交">
					  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					  <a href="index.jsp">返回登录页面</a>
					  <div class="clearfix"> </div>
				</div>
			  </center>
			</form>
    </div>
</div>
<!--footer-->
<div class="footer">
	<div class="container">
		<div class="footer-top">
			<div class="col-md-6 top-footer animated wow fadeInLeft" data-wow-delay=".5s">
				<h3>Follow Us On</h3>
				<div class="social-icons">
					<ul class="social">
						<li><a href="#"><i></i></a> </li>
						<li><a href="#"><i class="facebook"></i></a></li>	
						<li><a href="#"><i class="google"></i> </a></li>
						<li><a href="#"><i class="linked"></i> </a></li>						
					</ul>
						<div class="clearfix"></div>
				 </div>
			</div>
			<div class="col-md-6 top-footer1 animated wow fadeInRight" data-wow-delay=".5s">
				<h3>Newsletter</h3>
					<form action="#" method="post">
						<input type="text" name="email" value="" onFocus="this.value='';" onBlur="if (this.value == '') {this.value ='';}">
						<input type="submit" value="SUBSCRIBE">
					</form>
			</div>
			<div class="clearfix"> </div>	
		</div>	
	</div>
		<div class="footer-bottom">
		<div class="container">
				<div class="col-md-3 footer-bottom-cate animated wow fadeInLeft" data-wow-delay=".5s">
					<h6>Categories</h6>
					<ul>
						<li><a href="products.html">Curabitur sapien</a></li>
						<li><a href="single.html">Dignissim purus</a></li>
						<li><a href="men.html">Tempus pretium</a></li>
						<li><a href="products.html">Dignissim neque</a></li>
						<li><a href="single.html">Ornared id aliquet</a></li>
						
					</ul>
				</div>
				<div class="col-md-3 footer-bottom-cate animated wow fadeInLeft" data-wow-delay=".5s">
					<h6>Feature Projects</h6>
					<ul>
						<li><a href="products.html">Dignissim purus</a></li>
						<li><a href="men.html">Curabitur sapien</a></li>
						<li><a href="single.html">Tempus pretium</a></li>
						<li><a href="men.html">Dignissim neque</a></li>
						<li><a href="products.html">Ornared id aliquet</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-bottom-cate animated wow fadeInRight" data-wow-delay=".5s">
					<h6>Top Brands</h6>
					<ul>
						<li><a href="products.html">Tempus pretium</a></li>
						<li><a href="single.html">Curabitur sapien</a></li>
						<li><a href="men.html">Dignissim purus</a></li>
						<li><a href="single.html">Dignissim neque</a></li>
						<li><a href="men.html">Ornared id aliquet</a></li>
						
						
					</ul>
				</div>
				<div class="col-md-3 footer-bottom-cate cate-bottom animated wow fadeInRight" data-wow-delay=".5s">
					<h6>Our Address</h6>
					<ul>
						<li>Address : 12th Avenue, 5th block, <span>Sydney.</span></li>
						<li>Email : <a href="mailto:info@example.com">info@example.com</a></li>
						<li>Phone : +1234 567 567</li>
					</ul>
				</div>
				<div class="clearfix"> </div>
				<p class="footer-class animated wow fadeInUp animated" data-wow-delay=".5s" style="visibility: visible; animation-delay: 0.5s; animation-name: fadeInUp;">Copyright &copy; 2016.Company name All rights reserved.</p>
			</div>
	</div>
</div>
<!--footer-->
</body>
</html>