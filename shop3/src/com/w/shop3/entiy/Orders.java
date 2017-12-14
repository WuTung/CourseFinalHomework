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
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="orders")
public class Orders {

	private int orderId;
	private double finalPrice;
	private String sendto;
	private Set<OrderDetails> odSet = new HashSet<OrderDetails>();
	
	@Id
	@GenericGenerator(name="oId",strategy="identity")
	@GeneratedValue(generator="oId")
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	

	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	
	@OneToMany(cascade=CascadeType.MERGE,fetch=FetchType.LAZY)
	@JoinColumn(name="orderId")
	public Set<OrderDetails> getOdSet() {
		return odSet;
	}
	public void setOdSet(Set<OrderDetails> odSet) {
		this.odSet = odSet;
	}
	
	
	public String getSendto() {
		return sendto;
	}
	public void setSendto(String sendto) {
		this.sendto = sendto;
	}
	
	
}
