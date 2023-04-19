package com.codingwithadi.services;

import java.util.List;

import com.codingwithadi.DTO.UserDTO;

public interface UserServices {

	//create user
	UserDTO addUser(UserDTO userDto);
	
	//get user
	List<UserDTO> getAllUser();
	
	//get by Id
	UserDTO getByUserId(int userId);
	
	//update by Id
	UserDTO updateUser(int userId, UserDTO userDto);
	
	//delete by Id
	void deleteUser(int userId);
}
