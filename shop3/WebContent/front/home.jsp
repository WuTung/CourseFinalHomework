<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>商城主页</title>
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
      	auto: false,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
  </script>
  <!-- animation-effect -->
<link href="../static/css/animate.min.css" rel="stylesheet"> 
<script src="../static/js/wow.min.js"></script>
<script>
 new WOW().init();
</script>
<!-- //animation-effect -->
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="col-sm-4 logo animated wow fadeInLeft" data-wow-delay=".5s">
				<h1><a href="home.jsp">Youth <span>Fashion</span></a></h1>	
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
					<li><a href="home.jsp">商城主页</a></li>
					<li class="dropdown mega-dropdown active">
					    <a href="${ctx }/products/getSomeProducts?typeId=1" class="dropdown-toggle" data-toggle="dropdown">女装<span class="caret"></span></a>				
				        <div class="dropdown-menu mega-dropdown-menu">
					        <div class="container-fluid">
							<!-- Tab panes -->
								<div class="tab-content">
									<div class="tab-pane active" id="men">
										<ul class="nav-list list-inline">
											<li><a href="${ctx }/products/getSingleDetails?productId=0"><img src="${ctx }/static/images/t7.jpg" class="img-responsive" alt=""/></a></li>
											<li><a href="${ctx }/products/getSingleDetails?productId=1"><img src="${ctx }/static/images/t8.jpg" class="img-responsive" alt=""/></a></li>
											<li><a href="${ctx }/products/getSingleDetails?productId=2"><img src="${ctx }/static/images/t9.jpg" class="img-responsive" alt=""/></a></li>
											<li><a href="${ctx }/products/getSingleDetails?productId=3"><img src="${ctx }/static/images/t11.jpg" class="img-responsive" alt=""/></a></li>
											<li><a href="${ctx }/products/getSingleDetails?productId=4"><img src="${ctx }/static/images/t1.jpg" class="img-responsive" alt=""/></a></li>
											<li><a href="${ctx }/products/getSingleDetails?productId=5"><img src="${ctx }/static/images/t12.jpg" class="img-responsive" alt=""/></a></li>
										</ul>
									</div>
								</div>
							</div>
				    		<!-- Nav tabs -->		                
						</div>				
					</li>
					<li class="dropdown mega-dropdown active">
						<a href="${ctx }/products/getSomeProducts?typeId=2" class="dropdown-toggle" data-toggle="dropdown">男装<span class="caret"></span></a>				
							<div class="dropdown-menu mega-dropdown-menu">
								<div class="container-fluid">
								    <!-- Tab panes -->
									<div class="tab-content">
										<div class="tab-pane active" id="men">
											<ul class="nav-list list-inline">
												<li><a href="${ctx }/products/getSingleDetails?productId=17"><img src="${ctx }/static/images/t10.jpg" class="img-responsive" alt=""/></a></li>
												<li><a href="${ctx }/products/getSingleDetails?productId=18"><img src="${ctx }/static/images/t2.jpg" class="img-responsive" alt=""/></a></li>
												<li><a href="${ctx }/products/getSingleDetails?productId=19"><img src="${ctx }/static/images/t3.jpg" class="img-responsive" alt=""/></a></li>
												<li><a href="${ctx }/products/getSingleDetails?productId=20"><img src="${ctx }/static/images/t4.jpg" class="img-responsive" alt=""/></a></li>
												<li><a href="${ctx }/products/getSingleDetails?productId=21"><img src="${ctx }/static/images/t5.jpg" class="img-responsive" alt=""/></a></li>
												<li><a href="${ctx }/products/getSingleDetails?productId=22"><img src="${ctx }/static/images/t6.jpg" class="img-responsive" alt=""/></a></li>
											</ul>
										</div> 
									</div>
							    </div>
							    <!-- Nav tabs -->       
						    </div>				
					</li>
					<li class="dropdown mega-dropdown active">
						<a href="${ctx }/products/getSomeProducts?typeId=3" class="dropdown-toggle" data-toggle="dropdown">配饰<span class="caret"></span></a>				
							<div class="dropdown-menu mega-dropdown-menu">
								<div class="container-fluid">
								    <!-- Tab panes -->
									<div class="tab-content">
										<div class="tab-pane active" id="men">
											<ul class="nav-list list-inline">
												<li><a href="${ctx }/products/getSingleDetails?productId=34"><img src="${ctx }/static/images/t13.jpg" class="img-responsive" alt=""/></a></li>
												<li><a href="${ctx }/products/getSingleDetails?productId=29"><img src="${ctx }/static/images/t14.jpg" class="img-responsive" alt=""/></a></li>
												<li><a href="${ctx }/products/getSingleDetails?productId=30"><img src="${ctx }/static/images/t15.jpg" class="img-responsive" alt=""/></a></li>
												<li><a href="${ctx }/products/getSingleDetails?productId=31"><img src="${ctx }/static/images/t16.jpg" class="img-responsive" alt=""/></a></li>
												<li><a href="${ctx }/products/getSingleDetails?productId=32"><img src="${ctx }/static/images/t17.jpg" class="img-responsive" alt=""/></a></li>
												<li><a href="${ctx }/products/getSingleDetails?productId=33"><img src="${ctx }/static/images/t18.jpg" class="img-responsive" alt=""/></a></li>
											</ul>
										</div> 
									</div>
							    </div>
							    <!-- Nav tabs -->                   
						    </div>				
					</li>
					<li><a href="${ctx }/products/pageList?pageNo=1">全部商品</a></li>
					<li><a href="${ctx }/cart/showInCart?userName=${userName }">购物车</a></li>
					<li><a href="products.html">个人中心</a></li>
			    </ul>
				</div><!-- /.navbar-collapse -->
				  
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
<!--banner-->
<div class="banner">
	<div class="matter-banner">
	 	<div class="slider">
	    	<div class="callbacks_container">
	      		<ul class="rslides" id="slider">
	        		<li>
	          			<img src="../static/images/1.jpg" alt="">
						<div class="tes animated wow fadeInUp animated" data-wow-delay=".5s" style="visibility: visible; animation-delay: 0.5s; animation-name: fadeInUp;">
							<h2>MEN & WOMEN</h2>
							<h3>Youth</h3>
							<h4>Fation</h4>
						</div>
	       			 </li>
			 		 <li>
	          			<img src="../static/images/3.jpg" alt=""> 
						<div class="tes animated wow fadeInUp animated" data-wow-delay=".5s" style="visibility: visible; animation-delay: 0.5s; animation-name: fadeInUp;">
							<h2>MEN & WOMEN</h2>
							<h3>Youth</h3>
							<h4>Fation</h4>
						</div>					
	       			 </li>
					 <li>
	          			<img src="../static/images/2.jpg" alt="">
						<div class="tes animated wow fadeInUp animated" data-wow-delay=".5s" style="visibility: visible; animation-delay: 0.5s; animation-name: fadeInUp;">
							<h2>MEN & WOMEN</h2>
							<h3>Youth</h3>
							<h4>Fation</h4>
						</div>
	        		</li>	
	      		</ul>
	 	 	</div>
		</div>
	</div>
	<div class="clearfix"> </div>
</div>
<!--//banner-->
<!--content-->
<div class="content">
	<div class="container">
		<div class="content-top">
			<div class="content-top1">
				<div class="col-md-3 col-md2 animated wow fadeInLeft" data-wow-delay=".5s">
					<div class="col-md1 simpleCart_shelfItem">
						<a href="single.html">
							<img class="img-responsive" src="../static/images/pi3.png" alt="" />
						</a>
						<h3><a href="single.html">Palazoo</a></h3>
						<div class="price">
								<h5 class="item_price">$300</h5>
								<div class="clearfix"> </div>
						</div>
					</div>
				</div>	
			<div class="col-md-3 col-md2 animated wow fadeInLeft" data-wow-delay=".5s">
					<div class="col-md1 simpleCart_shelfItem">
						<a href="single.html">
							<img class="img-responsive" src="../static/images/pi2.png" alt="" />
						</a>
						<h3><a href="single.html">Trouser</a></h3>
						<div class="price">
								<h5 class="item_price">$300</h5>
								<div class="clearfix"> </div>
						</div>
					</div>
				</div>	
			<div class="col-md-3 col-md2 animated wow fadeInRight" data-wow-delay=".5s">
					<div class="col-md1 simpleCart_shelfItem">
						<a href="single.html">
							<img class="img-responsive" src="../static/images/pi6.png" alt="" />
						</a>
						<h3><a href="single.html">Trouser</a></h3>
						<div class="price">
								<h5 class="item_price">$300</h5>
								<div class="clearfix"> </div>
						</div>
					</div>
				</div>	
			<div class="col-md-3 col-md2 cmn animated wow fadeInRight" data-wow-delay=".5s">
					<div class="col-md1 simpleCart_shelfItem">
						<a href="single.html">
							<img class="img-responsive" src="../static/images/pi8.png" alt="" />
						</a>
						<h3><a href="single.html">Palazoo</a></h3>
						<div class="price">
								<h5 class="item_price">$300</h5>
								<div class="clearfix"> </div>
						</div>
					</div>
				</div>	
			<div class="clearfix"> </div>
			</div>			
		</div>
	</div>
</div>

<!--//content-->
	<div class="con-tp">
		<div class="container">
			<div class="col-md-4 con-tp-lft animated wow fadeInLeft" data-wow-delay=".5s">
				<a href="products.html">
					<div class="content-grid-effect slow-zoom vertical">
						<div class="img-box"><img src="../static/images/6.jpg" alt="image" class="img-responsive zoom-img"></div>
						<div class="info-box">
							<div class="info-content simpleCart_shelfItem">
										<h4>30%offer</h4>
							</div>
						</div>
					</div>
				</a>
			</div>
			<div class="col-md-4 con-tp-lft animated wow fadeInDown animated" data-wow-delay=".5s" style="visibility: visible; animation-delay: 0.5s; animation-name: fadeInDown;">
				<a href="products.html">			
					<div class="content-grid-effect slow-zoom vertical">
						<div class="img-box"><img src="../static/images/10.jpg" alt="image" class="img-responsive zoom-img"></div>
							<div class="info-box">
								<div class="info-content simpleCart_shelfItem">
										<h4>45%offer</h4>	
								</div>
							</div>
					</div>
				</a>
			</div>
			<div class="col-md-4 con-tp-lft animated wow fadeInRight" data-wow-delay=".5s">
				<a href="products.html">
					<div class="content-grid-effect slow-zoom vertical">
						<div class="img-box"><img src="../static/images/9.jpg" alt="image" class="img-responsive zoom-img"></div>
							<div class="info-box">
								<div class="info-content simpleCart_shelfItem">
										<h4>50%offer</h4>	
								</div>
							</div>
					</div>
				</a>
			</div>
			<div class="clearfix"></div>
		<div class="col-md-4 con-tp-lft animated wow fadeInLeft" data-wow-delay=".5s">
			<a href="products.html">
				<div class="content-grid-effect slow-zoom vertical">
					<div class="img-box"><img src="../static/images/12.jpg" alt="image" class="img-responsive zoom-img"></div>
						<div class="info-box">
							<div class="info-content simpleCart_shelfItem">
									<h4>60%offer</h4>	
							</div>
						</div>
				</div>
			</a>
		</div>
		<div class="col-md-4 con-tp-lft animated wow fadeInUp animated" data-wow-delay=".5s" style="visibility: visible; animation-delay: 0.5s; animation-name: fadeInUp;">
			<a href="products.html">
				<div class="content-grid-effect slow-zoom vertical">
					<div class="img-box"><img src="../static/images/13.jpg" alt="image" class="img-responsive zoom-img"></div>
						<div class="info-box">
							<div class="info-content simpleCart_shelfItem">
									<h4>70%offer</h4>	
							</div>
						</div>
				</div>
			</a>
		</div>
		<div class="col-md-4 con-tp-lft animated wow fadeInRight" data-wow-delay=".5s">
			<a href="products.html">
				<div class="content-grid-effect slow-zoom vertical">
					<div class="img-box"><img src="../static/images/14.jpg" alt="image" class="img-responsive zoom-img"></div>
						<div class="info-box">
							<div class="info-content simpleCart_shelfItem">
									<h4>80%offer</h4>	
							</div>
						</div>
				</div>
			</a>
		</div>
		<div class="clearfix"></div>
		</div>
	</div>
	<div class="c-btm">
		<div class="content-top1">
			<div class="container">
				<div class="col-md-3 col-md2 animated wow fadeInLeft" data-wow-delay=".5s">
					<div class="col-md1 simpleCart_shelfItem">
						<a href="single.html">
							<img class="img-responsive" src="../static/images/pi9.png" alt="" />
						</a>
						<h3><a href="single.html">Trousers</a></h3>
						<div class="price">
								<h5 class="item_price">$300</h5>
								<div class="clearfix"> </div>
						</div>
						
					</div>
				</div>	
			<div class="col-md-3 col-md2 animated wow fadeInLeft" data-wow-delay=".5s">
					<div class="col-md1 simpleCart_shelfItem">
						<a href="single.html">
							<img class="img-responsive" src="../static/images/pi10.png" alt="" />
						</a>
						<h3><a href="single.html">Formal</a></h3>
						<div class="price">
								<h5 class="item_price">$450</h5>
								<div class="clearfix"> </div>
						</div>
						
					</div>
				</div>	
			<div class="col-md-3 col-md2 animated wow fadeInRight" data-wow-delay=".5s">
					<div class="col-md1 simpleCart_shelfItem">
						<a href="single.html">
							<img class="img-responsive" src="../static/images/pi11.png" alt="" />
						</a>
						<h3><a href="single.html">Trousers</a></h3>
						<div class="price">
								<h5 class="item_price">$350</h5>
								<div class="clearfix"> </div>
						</div>
						
					</div>
				</div>	
			<div class="col-md-3 col-md2 animated wow fadeInRight" data-wow-delay=".5s">
					<div class="col-md1 simpleCart_shelfItem">
						<a href="single.html">
							<img class="img-responsive" src="../static/images/pi12.png" alt="" />
						</a>
						<h3><a href="single.html">Formal</a></h3>
						<div class="price">
								<h5 class="item_price">$400</h5>
								<div class="clearfix"> </div>
						</div>
						
					</div>
				</div>	
			<div class="clearfix"> </div>
			</div>	
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