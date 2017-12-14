package com.w.shop3.cart.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.w.shop3.cart.service.CartServiceImpl;
import com.w.shop3.entiy.CartItem;
import com.w.shop3.entiy.Product;
import com.w.shop3.entiy.User;
import com.w.shop3.product.service.ProductServiceImpl;
import com.w.shop3.user.service.UserServiceImpl;

@Controller
@RequestMapping("cart")
public class CartControllerImpl {

	@Resource
	private CartServiceImpl csi;
	@Resource
	private UserServiceImpl usi;
	@Resource
	private ProductServiceImpl psi;
	
	/**
	 * ��ȡҳ�����ݼ��빺�ﳵ�����
	 * @param productName
	 * @param userName
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/addCart")
	public void insertCartItem(@RequestParam("productName")String productName,@RequestParam("userName")String userName,
			HttpServletResponse response,HttpServletRequest request) throws IOException {
		User u = this.usi.findUserByName(userName);
		Product p = this.psi.getProductByName(productName);
		CartItem ci = this.csi.getPersonalCartItemByName(p, u);
		if(ci == null) {
			this.csi.insertCartItem(p, u);
		}else {
			this.csi.addOne(ci);
		}
		response.sendRedirect(request.getContextPath() + "/front/productdetails.jsp");
	}
	
	/**
	 * ���ӹ�����Ʒ��ʾ�ڹ��ﳵҳ��
	 * @param userName
	 * @param response
	 * @param session
	 * @throws IOException
	 */
	@RequestMapping("/showInCart")
	public void showInCart(@RequestParam("userName")String userName,HttpServletResponse response,
			HttpServletRequest request,HttpSession session) throws IOException {
		User u = this.usi.findUserByName(userName);
		List<CartItem> ciList = this.csi.getItemByCartId(u);
		session.setAttribute("ciList", ciList);
		double sumprice = this.csi.showSumPrice(u);
		session.setAttribute("sumprice", sumprice);
		response.sendRedirect(request.getContextPath() + "/front/cart.jsp");
	}
	
	/**
	 * �����ݿ���ɾ��ĳ�����ﳵ����������µ������б���ܼ�
	 * @param userName
	 * @param productName
	 * @param response
	 * @param session
	 * @throws IOException
	 */
	@RequestMapping("/deleteSomeOne")
	public void deleteSomeOne(@RequestParam("userName")String userName,
			@RequestParam("productName")String productName,HttpServletRequest request,
			HttpServletResponse response,HttpSession session) throws IOException {
		User u = this.usi.findUserByName(userName);
		List<CartItem> ciList = this.csi.deleteSomeOne(u,productName);
		session.setAttribute("ciList", ciList);
		double sumprice = this.csi.showSumPrice(u);
		session.setAttribute("sumprice", sumprice);
		response.sendRedirect(request.getContextPath() + "/front/cart.jsp");
	}

	/**
	 * �����ݿ���������й��ﳵ���������ҳ������
	 * @param userName
	 * @param response
	 * @param session
	 * @throws IOException
	 */
	@RequestMapping("/cleanUserCart")
	public void cleanUserCart(@RequestParam("userName")String userName,HttpServletRequest request,
			HttpServletResponse response,HttpSession session) throws IOException {
		User u = this.usi.findUserByName(userName);
		List<CartItem> ciList = this.csi.cleanUserCart(u);
		session.setAttribute("ciList", ciList);
		double sumprice = this.csi.showSumPrice(u);
		session.setAttribute("sumprice", sumprice);
		response.sendRedirect(request.getContextPath() + "/front/cart.jsp");
	}

	/**
	 * �������������1
	 * @param productName
	 * @param response
	 * @param session
	 * @throws IOException
	 */
	@RequestMapping("/subCount")
	public void subCount(@RequestParam("productName")String productName,HttpServletRequest request,
			HttpServletResponse response,HttpSession session) throws IOException {
		String userName = (String) session.getAttribute("userName");
		User u = this.usi.findUserByName(userName);
		List<CartItem> ciList = this.csi.subCount(u, productName);
		session.setAttribute("ciList", ciList);
		double sumprice = this.csi.showSumPrice(u);
		session.setAttribute("sumprice", sumprice);
		response.sendRedirect(request.getContextPath() + "/front/cart.jsp");
	}
	
	/**
	 * ����Ӻ�������1
	 * @param productName
	 * @param response
	 * @param session
	 * @throws IOException
	 */
	@RequestMapping("/addCount")
	public void addCount(@RequestParam("productName")String productName,HttpServletRequest request,
			HttpServletResponse response,HttpSession session) throws IOException {
		String userName = (String) session.getAttribute("userName");
		User u = this.usi.findUserByName(userName);
		List<CartItem> ciList = this.csi.addCount(u, productName);
		session.setAttribute("ciList", ciList);
		double sumprice = this.csi.showSumPrice(u);
		session.setAttribute("sumprice", sumprice);
		response.sendRedirect(request.getContextPath() + "/front/cart.jsp");
	}
}
