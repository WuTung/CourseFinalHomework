package com.w.shop3.entiy;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="logging")
public class Logging {

	private int loggingId;
	private String loginTime;
	
	@Id
	@GenericGenerator(name="lId",strategy="identity")
	@GeneratedValue(generator="lId")
	public int getLoggingId() {
		return loggingId;
	}
	public void setLoggingId(int loggingId) {
		this.loggingId = loggingId;
	}
	
	
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	
	
}
