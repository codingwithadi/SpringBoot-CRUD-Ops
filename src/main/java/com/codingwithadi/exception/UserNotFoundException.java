package com.codingwithadi.exception;

public class UserNotFoundException extends RuntimeException{
	
	private String resourceName;
	private String resourceFieldName;
	private int resourceId;
	
	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceFieldName() {
		return resourceFieldName;
	}

	public void setResourceFieldName(String resourceFieldName) {
		this.resourceFieldName = resourceFieldName;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public UserNotFoundException(String resourceName, String resourceFieldName, int resourceId) {
		super(String.format("Oops!! %s Not Found with %s : %s", resourceName, resourceFieldName, resourceId));
		this.resourceName = resourceName;
		this.resourceFieldName = resourceFieldName;
		this.resourceId = resourceId;
	}



	
	
	
	
	
	

}
