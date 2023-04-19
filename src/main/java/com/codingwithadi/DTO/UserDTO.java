package com.codingwithadi.DTO;

public class UserDTO {

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

	public UserDTO(int userId, String userFullName, String userName, String userMobileNumber, String userEmail) {
		super();
		this.userId = userId;
		this.userFullName = userFullName;
		this.userName = userName;
		this.userMobileNumber = userMobileNumber;
		this.userEmail = userEmail;
	}

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
