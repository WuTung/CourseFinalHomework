package com.w.shop3.entiy;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="cart")
public class Cart {

	private int cartId;
	private User user;
	private Set<CartItem> ciSet = new HashSet<CartItem>(); 
	
	@Id
	@GeneratedValue(generator="cId")
	@GenericGenerator(name="cId",strategy="identity")
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="userId")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@OneToMany(cascade=CascadeType.MERGE,fetch=FetchType.LAZY)
	@JoinColumn(name="cartId")
	public Set<CartItem> getCiSet() {
		return ciSet;
	}
	public void setCiSet(Set<CartItem> ciSet) {
		this.ciSet = ciSet;
	}

	
}
