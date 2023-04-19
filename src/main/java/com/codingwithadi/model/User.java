package com.codingwithadi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_info")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	private String userFullName;
	private String userName;
	private String userMobileNumber;
	private String userEmail;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMobileNumber() {
		return userMobileNumber;
	}
	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public User(int userId, String userFullName, String userName, String userMobileNumber, String userEmail) {
		super();
		this.userId = userId;
		this.userFullName = userFullName;
		this.userName = userName;
		this.userMobileNumber = userMobileNumber;
		this.userEmail = userEmail;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
