<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>男装</title>
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
  </style>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="col-sm-4 logo animated wow fadeInLeft" data-wow-delay=".5s">
				<h1><a href="index.html">Youth <span>Fashion</span></a></h1>	
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
<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft animated" data-wow-delay=".5s" style="visibility: visible; animation-delay: 0.5s; animation-name: slideInLeft;">
				<li><a href="index.html"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>商城主页</a></li>
				<li class="active">男装</li>
			</ol>
		</div>
	</div>
<!--content-->
<div class="products">
	<div class="container">
		<h2>Man</h2>
		<div class="col-md-9">
			<div class="content-top1">

				<c:forEach items="${selectList }" var="p">
				<div class="col-md-4 col-md4">
					<div class="col-md1 simpleCart_shelfItem">
						<a href="${ctx }/products/getSingleDetails?productId=${p.productId }">
							<img class="img-responsive" src="../${p.img1 }" alt="" />
						</a>
						<h3><a href="${ctx }/products/getSingleDetails?productId=${p.productId }">${p.productName }</a></h3>
						<div class="price">
								<h5 class="item_price">${p.singlePrice }</h5>
								<div class="clearfix"> </div>
						</div>
					</div>
				</div>	
			</c:forEach>
			
			<div class="clearfix"> </div>
			
			<div margin="5">
			<center>
			    <a href="${ctx }/products/selectByCondition?pageNo=1&typeId=2&pageName=man">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
			    <a href="${ctx }/products/selectByCondition?pageNo=${pageNo-1 }&typeId=2&pageName=man">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
			    <c:forEach begin="1" end="${TypePageCount }" step="1" var="i">
			        <a href="${ctx }/products/selectByCondition?pageNo=${i }&typeId=2&pageName=man">${i }</a>&nbsp;&nbsp;&nbsp;&nbsp;
			    </c:forEach>
			    <a href="${ctx }/products/selectByCondition?pageNo=${pageNo+1 }&typeId=2&pageName=man">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
			    <a href="${ctx }/products/selectByCondition?pageNo=${TypePageCount }&typeId=2&pageName=man">尾页</a>
			</center>
			</div>
			</div>	
		</div>
		<div class="col-md-3 product-bottom">
			<!--categories-->
				<div class=" rsidebar span_1_of_left">
						<h3 class="cate">Categories</h3>
							 <ul class="cute">
							    <li class="subitem1">
									<a href="${ctx }/products/pageList?pageNo=1">全部 </a>
								</li>
							    <li class="subitem1">
									<a href="${ctx }/products/selectByCondition?typeId=2&pageName=man&pageNo=1">男装 </a>
								</li>
							    <li class="subitem1">
									<a href="${ctx }/products/selectByCondition?typeId=1&pageName=women&pageNo=1">女装 </a>
								</li>
							    <li class="subitem1">
									<a href="${ctx }/products/selectByCondition?typeId=3&pageName=accessories&pageNo=1">配饰 </a>
								</li>
						    </ul>
					</div>
				<!--initiate accordion-->
						<script type="text/javascript">
							$(function() {
							    var menu_ul = $('.menu-drop > li > ul'),
							           menu_a  = $('.menu-drop > li > a');
							    menu_ul.hide();
							    menu_a.click(function(e) {
							        e.preventDefault();
							        if(!$(this).hasClass('active')) {
							            menu_a.removeClass('active');
							            menu_ul.filter(':visible').slideUp('normal');
							            $(this).addClass('active').next().stop(true,true).slideDown('normal');
							        } else {
							            $(this).removeClass('active');
							            $(this).next().stop(true,true).slideUp('normal');
							        }
							    });
							
							});
						</script>
<!--//menu-->
<!--seller-->
				<div class="product-bottom">
						<h3 class="cate">Best Sellers</h3>
					<div class="product-go">
						<div class=" fashion-grid">
							<a href="single.html"><img class="img-responsive " src="../static/images/pr.jpg" alt=""></a>	
						</div>
						<div class=" fashion-grid1">
							<h6 class="best2"><a href="single.html" >Lorem ipsum dolor sitamet consectetuer  </a></h6>
							<span class=" price-in1"> $40.00</span>
						</div>	
						<div class="clearfix"> </div>
					</div>
					<div class="product-go">
						<div class=" fashion-grid">
							<a href="single.html"><img class="img-responsive " src="../static/images/pr1.jpg" alt=""></a>	
						</div>
						<div class=" fashion-grid1">
							<h6 class="best2"><a href="single.html" >Lorem ipsum dolor sitamet consectetuer  </a></h6>
							<span class=" price-in1"> $40.00</span>
						</div>	
						<div class="clearfix"> </div>
					</div>
					<div class="product-go">
						<div class=" fashion-grid">
							<a href="single.html"><img class="img-responsive " src="../static/images/pr2.jpg" alt=""></a>	
						</div>
						<div class=" fashion-grid1">
							<h6 class="best2"><a href="single.html" >Lorem ipsum dolor sitamet consectetuer  </a></h6>
							<span class=" price-in1"> $40.00</span>
						</div>	
						<div class="clearfix"> </div>
					</div>	
					<div class="product-go">
						<div class=" fashion-grid">
							<a href="single.html"><img class="img-responsive " src="../static/images/pr3.jpg" alt=""></a>	
						</div>
						<div class=" fashion-grid1">
							<h6 class="best2"><a href="single.html" >Lorem ipsum dolor sitamet consectetuer  </a></h6>
							<span class=" price-in1"> $40.00</span>
						</div>	
						<div class="clearfix"> </div>
					</div>		
				</div>

<!--//seller-->
<!--tag-->
		</div>
		<div class="clearfix"> </div>
	</div>
</div>
<!--//content-->
<!--footer-->
<div class="footer">
	<div class="container">
		<div class="footer-top">
			<div class="col-md-6 top-footer">
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
			<div class="col-md-6 top-footer1">
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
				<div class="col-md-3 footer-bottom-cate">
					<h6>Categories</h6>
					<ul>
						<li><a href="products.html">Curabitur sapien</a></li>
						<li><a href="single.html">Dignissim purus</a></li>
						<li><a href="men.html">Tempus pretium</a></li>
						<li><a href="products.html">Dignissim neque</a></li>
						<li><a href="single.html">Ornared id aliquet</a></li>
						
					</ul>
				</div>
				<div class="col-md-3 footer-bottom-cate">
					<h6>Feature Projects</h6>
					<ul>
						<li><a href="products.html">Dignissim purus</a></li>
						<li><a href="men.html">Curabitur sapien</a></li>
						<li><a href="single.html">Tempus pretium</a></li>
						<li><a href="men.html">Dignissim neque</a></li>
						<li><a href="products.html">Ornared id aliquet</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-bottom-cate">
					<h6>Top Brands</h6>
					<ul>
						<li><a href="products.html">Tempus pretium</a></li>
						<li><a href="single.html">Curabitur sapien</a></li>
						<li><a href="men.html">Dignissim purus</a></li>
						<li><a href="single.html">Dignissim neque</a></li>
						<li><a href="men.html">Ornared id aliquet</a></li>
						
						
					</ul>
				</div>
				<div class="col-md-3 footer-bottom-cate cate-bottom">
					<h6>Our Address</h6>
					<ul>
						<li>Address : 12th Avenue, 5th block, <span>Sydney.</span></li>
						<li>Email : <a href="mailto:info@example.com">info@example.com</a></li>
						<li>Phone : +1234 567 567</li>
					</ul>
				</div>
				<div class="clearfix"> </div>
				<p class="footer-class">Copyright &copy; 2016.Company name All rights reserved.</p>
			</div>
	</div>
</div>
<!--footer-->
</body>
</html>