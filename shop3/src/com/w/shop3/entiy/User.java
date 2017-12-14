package com.w.shop3.entiy;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name="user")
public class User {

	private int userId;
	private String userName;
	private String pwd;
	private String email;
	private String address;
	private String avatar;
	private Set<Logging> lSet = new HashSet<Logging>();
	private Set<Orders> oSet = new HashSet<Orders>();
	private Cart cart;

	
	@Id
	@GenericGenerator(name="uId",strategy="identity")
	@GeneratedValue(generator="uId")
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	@Column(unique=true)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	@OneToMany(cascade=CascadeType.MERGE,fetch=FetchType.LAZY)
	@JoinColumn(name="userId")
	public Set<Logging> getlSet() {
		return lSet;
	}
	public void setlSet(Set<Logging> lSet) {
		this.lSet = lSet;
	}
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="userId")
	public Set<Orders> getoSet() {
		return oSet;
	}
	public void setoSet(Set<Orders> oSet) {
		this.oSet = oSet;
	}
	
	@OneToOne(mappedBy="user")
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}

	
	
	
}
