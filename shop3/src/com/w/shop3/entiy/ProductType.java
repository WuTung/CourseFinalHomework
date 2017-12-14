package com.w.shop3.entiy;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="producttype")
public class ProductType {

	private int typeId;
	private String typeName;
	private Set<Product> pSet = new HashSet<Product>();
	
	@Id
	@GenericGenerator(name="ptId",strategy="identity")
	@GeneratedValue(generator="ptId")
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	@OneToMany(mappedBy="productType",cascade=CascadeType.MERGE,targetEntity=Product.class)
	public Set<Product> getpSet() {
		return pSet;
	}
	public void setpSet(Set<Product> pSet) {
		this.pSet = pSet;
	}
	
	
}
