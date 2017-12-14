package com.w.shop3.orders.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.w.shop3.cart.service.CartServiceImpl;
import com.w.shop3.entiy.CartItem;
import com.w.shop3.entiy.OrderDetails;
import com.w.shop3.entiy.User;
import com.w.shop3.orders.service.OrdersServiceImpl;
import com.w.shop3.user.service.UserServiceImpl;

@Controller
@RequestMapping("orders")
public class OrdersControllerImpl {

	@Resource
	private OrdersServiceImpl osi;
	@Resource
	private UserServiceImpl usi;
	@Resource
	private CartServiceImpl csi;
	
	/**
	 * 调用加入订单详情方法并在订单页面显示所有购买的商品
	 * @param response
	 * @param session
	 * @throws IOException
	 */
	@RequestMapping("/buyAll")
	public void buyAll(HttpServletResponse response,HttpServletRequest request,HttpSession session) throws IOException {
		String userName = (String) session.getAttribute("userName");
		User u = this.usi.findUserByName(userName);
		session.setAttribute("userAddress", u.getAddress());
		List<CartItem> ciList = this.csi.getItemByCartId(u);
		List<OrderDetails> odList = this.osi.buyAll(ciList);
		session.setAttribute("odList", odList);
		double finalprice = this.osi.getFinalprice(odList);
		session.setAttribute("finalprice", finalprice);
		response.sendRedirect(request.getContextPath() + "/front/checkout.jsp");
	}
	
	/**
	 * 生成订单，删除购物车中相应数据并提示下单成功
	 * @param response
	 * @param session
	 * @throws IOException
	 */
	@RequestMapping("/payForOrders")
	public void payForOrders(HttpServletResponse response,HttpServletRequest request,HttpSession session) throws IOException {
		String userName = (String) session.getAttribute("userName");
		double finalPrice = (double) session.getAttribute("finalprice");
		String userAddress = (String) session.getAttribute("userAddress");
		User u = this.usi.findUserByName(userName);
		List<OrderDetails> odList = (List<OrderDetails>) session.getAttribute("odList");
		this.osi.createOrder(odList, u, finalPrice,userAddress);
		this.csi.cleanUserCart(u);
		response.sendRedirect(request.getContextPath() + "/front/payover.jsp");
	}
    
}
