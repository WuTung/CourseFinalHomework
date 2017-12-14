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
	* ����Ʒ��Ϣ���빺�ﳵ����
	* @param p true
	* @param u true
	* @return û�з���ֵ
	*/
    public void insertCartItem(Product p,User u) {
		this.cdi.insertCartItem(p,u);
	}
    
    /**
	* ����cartId��ѯ���ﳵ����
	* @param u true
	* @return ciList
	*/
  	public List<CartItem> getItemByCartId(User u) {
  		return this.cdi.getItemByCartId(u);
  	}
  	
  	/**
	* �ӹ�+1
	* @param ci true
	* @return û�з���ֵ
	*/
  	public void addOne(CartItem ci) {
  		this.cdi.addOne(ci);
  	}
  	
  	/**
	* ������Ʒ���͹��ﳵ��ѯ��Ʒ�Ƿ����
	* @param u true
	* @param p true
	* @return cartItem
	*/
  	public CartItem getPersonalCartItemByName(Product p,User u) {
  		return this.cdi.getPersonalCartItemByName(p, u);
  	}
    
  	/**
	* ɾ��ĳ�����ﳵ����
	* @param u true
	* @param productName true
	* @return cilist
	*/
  	public List<CartItem> deleteSomeOne(User u,String productName) {
  		return this.cdi.deleteSomeOne(u,productName);
  	}
  	
  	/**
	* ��ʾ���ﳵ�ܶ�
	* @param u true
	* @return sumprice
	*/
  	public double showSumPrice(User u) {
  		return this.cdi.showSumPrice(u);
  	}
  	
  	/**
	* ��չ��ﳵ
	* @param u true
	* @return ciList
	*/
  	public List<CartItem> cleanUserCart(User u) {
  		return this.cdi.cleanUserCart(u);
  	}
  	
  	/**
	* ���"-"����-1
	* @param u true
	* @param productName true
	* @return ciList
	*/
  	public List<CartItem> subCount(User u,String productName) {
  		return this.cdi.subCount(u, productName);
  	}
  	
  	/**
	* ���"+"����+1
	* @param u true
	* @param productName true
	* @return ciList
	*/
  	public List<CartItem> addCount(User u,String productName) {
  		return this.cdi.addCount(u, productName);
  	}
}
