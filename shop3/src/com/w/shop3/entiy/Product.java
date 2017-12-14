package com.w.shop3.entiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="product")
public class Product {

	private int productId;
	private String productName;
	private double singlePrice;
	private double cut;
	private String img1;
	private String img2;
	private String img3;
	private ProductType productType;
	
	@Id
	@GenericGenerator(name="pId",strategy="identity")
	@GeneratedValue(generator="pId")
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	@Column(unique=true)
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	public double getSinglePrice() {
		return singlePrice;
	}
	public void setSinglePrice(double singlePrice) {
		this.singlePrice = singlePrice;
	}
	
	
	public double getCut() {
		return cut;
	}
	public void setCut(double cut) {
		this.cut = cut;
	}
	
	
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1 = img1;
	}
	
	
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
	}
	
	
	public String getImg3() {
		return img3;
	}
	public void setImg3(String img3) {
		this.img3 = img3;
	}

	
	@ManyToOne
	@JoinColumn(name="typeId")
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType pType) {
		this.productType = pType;
	}

}
