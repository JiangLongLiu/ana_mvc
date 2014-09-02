package com.liujl.entity;

import java.io.Serializable;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8018713072111628172L;
	private String userName;
	private String address;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", address=" + address + "]";
	}
}
