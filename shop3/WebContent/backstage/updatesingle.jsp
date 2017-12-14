<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>修改单个商品</title>
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
  <style>
  	h3.cate{
  		font-family:'宋体';
  	}
  	.subitem1 >a{
		font-size:0.9em;
		color:#B2B2B2; 	
  	}
  	.subitem1 >a:hover{
  		color:#000;
  		text-decoration:none;
  	}
  	.add_table{
  	    width:440px;
  	    margin:0 auto;
  	}
  </style>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="col-sm-4 logo animated wow fadeInLeft" data-wow-delay=".5s">
				<h1><a href="index.html">Youth <span>Manager</span></a></h1>	
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<div class="container">
		<div class="head-top">
		<div class="n-avigation">
			
		<nav class="navbar nav_bottom" role="navigation">
				
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header nav_2">
				<button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
				    <span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			    <a class="navbar-brand" href="#"></a>
			</div> 
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
				<ul class="nav navbar-nav nav_1">
					<li><a href="managehome.jsp">后台主页</a></li>
					<li>
						<a href="#">商品管理</a>				   				
					</li>
					<li><a href="managerlogin.jsp">退出登录</a></li>
			    </ul>
			</div>
			<!-- /.navbar-collapse -->
		    </nav>
	    </div>
	
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
	<!---->		
	</div>
	</div>
</div>
<div class="breadcrumbs"></div>
<!--content-->
<div class="products">
<div class="addform_left"></div>
<div class="add_table">
<form action="${ctx }/products/updateSingle">
<table>
	<tr>
	    <td width="100px">商品名称：<input type="hidden" name="pName" value="${p.productName }"></td>
	    <td width="150px">${p.productName }</td>
	</tr>
	<tr>
	    <td width="100px">商品单价：</td>
	    <td width="150px"><input type="text" name="singleprice" value="${p.singlePrice }"></td>
	</tr>
	<tr>
	    <td width="100px">折扣：</td>
	    <td width="150px"><input type="text" name="cut" value="${p.cut }"></td>
	</tr>
	<tr><td align="center" colspan="2"><input type="submit" value="保存"></td><input type="hidden" name="pageNo" value="1"></tr>
</table>
</form>
</div>
</div>
</body>
</html>