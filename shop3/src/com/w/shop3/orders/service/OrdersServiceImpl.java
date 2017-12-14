package com.w.shop3.orders.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.w.shop3.entiy.CartItem;
import com.w.shop3.entiy.OrderDetails;
import com.w.shop3.entiy.User;
import com.w.shop3.orders.dao.OrdersDAOImpl;

@Service
@Transactional
public class OrdersServiceImpl {
	
	@Resource
	private OrdersDAOImpl odi;
	
	/**
	 * 调用dao中加入订单详情表的方法
	 * @param ciList
	 * @return
	 */
	public List<OrderDetails> buyAll(List<CartItem> ciList) {
		return this.odi.buyAll(ciList);
	}
	
	/**
	 * 接收dao传递的总价
	 * @param odList
	 * @return
	 */
	public double getFinalprice(List<OrderDetails> odList) {
		return this.odi.getFinalprice(odList);
	}
	
	/**
	 * 调用创建订单的方法
	 * @param odList
	 * @param u
	 * @param finalPrice
	 * @param userAddress
	 */
	public void createOrder(List<OrderDetails> odList,User u,double finalPrice,String userAddress) {
		this.odi.createOrder(odList, u, finalPrice,userAddress);
	}

}
