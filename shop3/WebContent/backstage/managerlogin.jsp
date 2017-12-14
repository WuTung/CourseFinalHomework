<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>后台登录</title>
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
				<h1><a href="#">Youth Manager</a></h1>	
			</div>
		</div>
	</div>
		<div class="clearfix"> </div>
			<!---pop-up-box---->   
			<link href="../static/css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
			<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
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
<!--//header-->
<div class="account">
	<div class="container">
		<center><h3>ManagerLogin</h3></center><br>
		<div>
		  <center>
		    <div>
				<form action="${ctx }/manager/managerLogin" method="post">
					<span>用户名：</span>
					<input type="text" name="managerName" height="40px"> ${nameError }<br><br>
					<span>密&nbsp;&nbsp;&nbsp;码：</span>
					<input type="password" name="pwd"> ${pwdError}<br><br>
					<center>
					    <a href="../front/index.jsp">←用户登录</a>&nbsp;&nbsp;
				 		<input type="submit" value="登录">
				 	</center>
			    </form>
			</div>	
		  </center>
			<div class="clearfix"> </div>
		</div>
	</div>
</div>
</body>
</html>