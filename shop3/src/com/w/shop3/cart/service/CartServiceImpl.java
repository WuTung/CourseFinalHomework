package com.w.shop3.cart.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.w.shop3.cart.dao.CartDAOImpl;
import com.w.shop3.entiy.CartItem;
import com.w.shop3.entiy.Product;
import com.w.shop3.entiy.User;

@Service
@Transactional
public class CartServiceImpl {

	@Resource
	private CartDAOImpl cdi;
	
	/**
	* 将商品信息加入购物车子项
	* @param p true
	* @param u true
	* @return 没有返回值
	*/
    public void insertCartItem(Product p,User u) {
		this.cdi.insertCartItem(p,u);
	}
    
    /**
	* 根据cartId查询购物车子项
	* @param u true
	* @return ciList
	*/
  	public List<CartItem> getItemByCartId(User u) {
  		return this.cdi.getItemByCartId(u);
  	}
  	
  	/**
	* 加购+1
	* @param ci true
	* @return 没有返回值
	*/
  	public void addOne(CartItem ci) {
  		this.cdi.addOne(ci);
  	}
  	
  	/**
	* 根据商品名和购物车查询商品是否存在
	* @param u true
	* @param p true
	* @return cartItem
	*/
  	public CartItem getPersonalCartItemByName(Product p,User u) {
  		return this.cdi.getPersonalCartItemByName(p, u);
  	}
    
  	/**
	* 删除某个购物车子项
	* @param u true
	* @param productName true
	* @return cilist
	*/
  	public List<CartItem> deleteSomeOne(User u,String productName) {
  		return this.cdi.deleteSomeOne(u,productName);
  	}
  	
  	/**
	* 显示购物车总额
	* @param u true
	* @return sumprice
	*/
  	public double showSumPrice(User u) {
  		return this.cdi.showSumPrice(u);
  	}
  	
  	/**
	* 清空购物车
	* @param u true
	* @return ciList
	*/
  	public List<CartItem> cleanUserCart(User u) {
  		return this.cdi.cleanUserCart(u);
  	}
  	
  	/**
	* 点击"-"数量-1
	* @param u true
	* @param productName true
	* @return ciList
	*/
  	public List<CartItem> subCount(User u,String productName) {
  		return this.cdi.subCount(u, productName);
  	}
  	
  	/**
	* 点击"+"数量+1
	* @param u true
	* @param productName true
	* @return ciList
	*/
  	public List<CartItem> addCount(User u,String productName) {
  		return this.cdi.addCount(u, productName);
  	}
}
