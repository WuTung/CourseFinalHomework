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
	* 将商品信息加入购物车子项
	* @param p true
	* @param u true
	* @return 没有返回值
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
	* 根据cartId查询购物车子项
	* @param u true
	* @return ciList
	*/
	public List<CartItem> getItemByCartId(User u) {
		Set<CartItem> ciSet = u.getCart().getCiSet();
		ArrayList<CartItem> ciList = new ArrayList<CartItem>(ciSet);		
		return ciList;
	}
	
	/**
	* 加购+1
	* @param ci true
	* @return 没有返回值
	*/
	public void addOne(CartItem ci) {
		ci.setCount(ci.getCount()+1);
		ci.setTotalprice(ci.getCount()*ci.getSingleprice());
		this.sf.getCurrentSession().update(ci);
	}
	
	/**
	* 根据商品名和购物车查询商品是否存在
	* <p>查询购物车中是否已经存在某个商品<br>
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
	* 删除某个购物车子项
	* <p>从数据库中删除用户的某个购物车子项<br>
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
	* 计算购物车总额
	* <p>计算某用户购物车中的总额<br>
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
	* 清空购物车
	* <p>清空某用户购物车信息<br>
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
	* 点击"-"数量-1
	* <p>在数据库中更新数量，并将新的购物车子项存入List中返回<br>
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
	* 点击"+"数量+1
	* <p>在数据库中更新数量，并将新的购物车子项存入List中返回<br>
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
