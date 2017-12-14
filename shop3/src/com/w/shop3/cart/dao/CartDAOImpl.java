package com.w.shop3.cart.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.w.shop3.entiy.Cart;
import com.w.shop3.entiy.CartItem;
import com.w.shop3.entiy.Product;
import com.w.shop3.entiy.User;

@Repository
public class CartDAOImpl {

	@Resource
	private SessionFactory sf;
	
	/**
	* ����Ʒ��Ϣ���빺�ﳵ����
	* @param p true
	* @param u true
	* @return û�з���ֵ
	*/
	public void insertCartItem(Product p,User u) {
		CartItem ci = new CartItem();
		ci.setProductName(p.getProductName());
		ci.setImg1(p.getImg1());
		ci.setSingleprice(p.getSinglePrice());
		ci.setCount(1);
		ci.setTotalprice(p.getSinglePrice());
		ci.setProduct(p);
		u.getCart().getCiSet().add(ci);
		this.sf.getCurrentSession().save(ci);
	}
	
	/**
	* ����cartId��ѯ���ﳵ����
	* @param u true
	* @return ciList
	*/
	public List<CartItem> getItemByCartId(User u) {
		Set<CartItem> ciSet = u.getCart().getCiSet();
		ArrayList<CartItem> ciList = new ArrayList<CartItem>(ciSet);		
		return ciList;
	}
	
	/**
	* �ӹ�+1
	* @param ci true
	* @return û�з���ֵ
	*/
	public void addOne(CartItem ci) {
		ci.setCount(ci.getCount()+1);
		ci.setTotalprice(ci.getCount()*ci.getSingleprice());
		this.sf.getCurrentSession().update(ci);
	}
	
	/**
	* ������Ʒ���͹��ﳵ��ѯ��Ʒ�Ƿ����
	* <p>��ѯ���ﳵ���Ƿ��Ѿ�����ĳ����Ʒ<br>
	* @param u true
	* @param p true
	* @return cartItem
	*/
	public CartItem getPersonalCartItemByName(Product p,User u) {
		Set<CartItem> ciSet = u.getCart().getCiSet();
		ArrayList<CartItem> list = new ArrayList<CartItem>(ciSet);
		for (CartItem cartItem : list) {
			if(cartItem.getProductName().equals(p.getProductName())) {
				return cartItem;
			}
		}
		return null;
	}
	
	/**
	* ɾ��ĳ�����ﳵ����
	* <p>�����ݿ���ɾ���û���ĳ�����ﳵ����<br>
	* @param u true
	* @param productName true
	* @return cilist
	*/
	public List<CartItem> deleteSomeOne(User u,String productName) {
		Set<CartItem> ciSet = u.getCart().getCiSet();
		ArrayList<CartItem> cilist = new ArrayList<CartItem>(ciSet);
		for (int i = 0;i < cilist.size();i ++) {
			CartItem ci = cilist.get(i);
			if(ci.getProductName().equals(productName)) {
				this.sf.getCurrentSession().delete(ci);
				cilist.remove(ci);
				i--;
			}
		}
		return cilist;
	}
	
	
	/**
	* ���㹺�ﳵ�ܶ�
	* <p>����ĳ�û����ﳵ�е��ܶ�<br>
	* @param u true
	* @return sumprice
	*/
	public double showSumPrice(User u) {
		Cart c = u.getCart();
		Query q = this.sf.getCurrentSession().createQuery("select sum(totalprice) from CartItem ci where cartId =:cartId");
		q.setParameter("cartId", c.getCartId());
		double sumprice = 0.00;
		Number number = (Number) q.uniqueResult();
		if(number != null) {
			sumprice = number.doubleValue();
		}
		return sumprice;
	}
	
	/**
	* ��չ��ﳵ
	* <p>���ĳ�û����ﳵ��Ϣ<br>
	* @param u true
	* @return ciList
	*/
	public List<CartItem> cleanUserCart(User u) {
		Set<CartItem> ciSet = u.getCart().getCiSet();
		ArrayList<CartItem> ciList = new ArrayList<CartItem>(ciSet);
		for(Iterator<CartItem> ciIt = ciList.iterator(); ciIt.hasNext();) {
			CartItem ci = ciIt.next();
			this.sf.getCurrentSession().delete(ci);
			ciIt.remove();
		}
		return ciList;
	}

	
	/**
	* ���"-"����-1
	* <p>�����ݿ��и��������������µĹ��ﳵ�������List�з���<br>
	* @param u true
	* @param productName true
	* @return ciList
	*/
	public List<CartItem> subCount(User u,String productName) {
		Set<CartItem> ciSet = u.getCart().getCiSet();
		ArrayList<CartItem> ciList = new ArrayList<CartItem>(ciSet);
		for (CartItem cartItem : ciList) {
			if(cartItem.getProductName().equals(productName)) {
				cartItem.setCount(cartItem.getCount()-1);
				cartItem.setTotalprice(cartItem.getCount()*cartItem.getSingleprice());
			}
		}
		return ciList;
	}
	
	/**
	* ���"+"����+1
	* <p>�����ݿ��и��������������µĹ��ﳵ�������List�з���<br>
	* @param u true
	* @param productName true
	* @return ciList
	*/
	public List<CartItem> addCount(User u,String productName) {
		Set<CartItem> ciSet = u.getCart().getCiSet();
		ArrayList<CartItem> ciList = new ArrayList<CartItem>(ciSet);
		for (CartItem cartItem : ciList) {
			if(cartItem.getProductName().equals(productName)) {
				cartItem.setCount(cartItem.getCount()+1);
				cartItem.setTotalprice(cartItem.getCount()*cartItem.getSingleprice());
			}
		}
		return ciList;
	}
}
