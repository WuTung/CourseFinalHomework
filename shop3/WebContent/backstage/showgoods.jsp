<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>商品列表</title>
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
  	.productImg{
  	    width:110px;
  	    height:125px;
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
						<a href="${ctx }/products/getAll?pageNo=1">商品管理</a>				   				
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
<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft animated" data-wow-delay=".5s" style="visibility: visible; animation-delay: 0.5s; animation-name: slideInLeft;">
				<li><a href="${ctx }/backstage/managehome.jsp">后台主页</a></li>
				<li class="active">商品列表</li>
			</ol>
		</div>
	</div>
<!--content-->
<div class="products">
	<div class="container">
		<a href="${ctx }/backstage/addsingle.jsp">添加商品</a>
    	<table border="1px black solid">
		  <tr>
			<th>商品id</th>	
			<th>商品名称</th>
			<th>类型</th>
			<th>单价</th>
			<th>折扣</th>
			<th>图片1</th>
			<th>图片2</th>
			<th>图片3</th>
			<th>是否修改</th>
			<th>是否删除</th>
		  </tr>
		  
	    <c:forEach items="${pList }" var="p" >
		  <tr>
			<td align="center">${p.productId }</td>
			<td align="center">${p.productName }</td>
			<td align="center">${p.getProductType().getTypeName() }</td>
			<td align="center">${p.singlePrice }</td>
			<td align="center">${p.cut }</td>
			<td align="center"><img class="productImg" src="../${p.img1 }" alt=""/></td>
			<td align="center"><img class="productImg" src="../${p.img2 }" alt=""/></td>
			<td align="center"><img class="productImg" src="../${p.img3 }" alt=""/></td>
			<td align="center"><a href="${ctx }/products/getSingle?productId=${p.productId }">修改</a></td>
			<td align="center"><a href="${ctx }/products/deleteProduct?productId=${p.productId }&pageNo=1">删除</a></td>
		  </tr>
	    </c:forEach>
		  
	</table>
			
			<div class="clearfix"> </div>
			
			<div margin="5">
			<center>
			    <a href="${ctx }/products/getAll?pageNo=1">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
			    <a href="${ctx }/products/getAll?pageNo=${pageNo-1 }">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
			    <c:forEach begin="1" end="${pageCount }" step="1" var="i">
			        <a href="${ctx }/products/getAll?pageNo=${i }">${i }</a>&nbsp;&nbsp;&nbsp;&nbsp;
			    </c:forEach>
			    <a href="${ctx }/products/getAll?pageNo=${pageNo+1 }">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
			    <a href="${ctx }/products/getAll?pageNo=${pageCount }">尾页</a>
			</center>
			</div>
			</div>	
	</div>
</body>
</html>