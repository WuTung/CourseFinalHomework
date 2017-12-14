package com.w.shop3.orders.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.w.shop3.entiy.CartItem;
import com.w.shop3.entiy.OrderDetails;
import com.w.shop3.entiy.Orders;
import com.w.shop3.entiy.User;

@Repository
public class OrdersDAOImpl {

	@Resource
	private SessionFactory sf;
	
	//全部购买
	/**
	 * 将购物车中的所有商品加入订单详情表
	 * @param ciList
	 * @return
	 */
	public List<OrderDetails> buyAll(List<CartItem> ciList) {
		List<OrderDetails> odList = new ArrayList<OrderDetails>();
		for (CartItem cartItem : ciList) {
			OrderDetails od = new OrderDetails();
			od.setProduct(cartItem.getProduct());
			od.setImg1(cartItem.getImg1());
			od.setSingleprice(cartItem.getSingleprice());
			od.setCount(cartItem.getCount());
			od.setTotalprice(cartItem.getTotalprice());
			odList.add(od);
			this.sf.getCurrentSession().save(od);
		}
		for (OrderDetails orderDetails : odList) {
			System.out.println(orderDetails.getProduct().getProductName());
		}
		return odList;
	}
	

	/**
	 * 计算订单详情页的总价
	 * @param odList
	 * @return
	 */
	public double getFinalprice(List<OrderDetails> odList) {
		double sum = 0;
		for (OrderDetails od : odList) {
			sum += od.getTotalprice();
		}
		return sum;
	}
	
	/**
	 * 创建订单
	 * @param odList
	 * @param u
	 * @param finalPrice
	 * @param userAddress
	 */
	public void createOrder(List<OrderDetails> odList,User u,double finalPrice,String userAddress) {
		Orders o = new Orders();
		u.getoSet().add(o);
		for (OrderDetails orderDetails : odList) {
			o.getOdSet().add(orderDetails);
		}
		o.setFinalPrice(finalPrice);
		o.setSendto(userAddress);
		this.sf.getCurrentSession().save(o);
	}
}
