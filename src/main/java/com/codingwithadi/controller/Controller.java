package com.codingwithadi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingwithadi.DTO.UserDTO;
import com.codingwithadi.response.APIResponse;
import com.codingwithadi.services.UserServices;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class Controller {
	
	@Autowired
	private UserServices userServices;
	
	//Post
	@PostMapping("/user")
	public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDto){
		UserDTO dto = this.userServices.addUser(userDto);
		return new ResponseEntity<UserDTO>(dto, HttpStatus.CREATED);
	}
	
	//Get All
	@GetMapping("/users")
	public ResponseEntity<List<UserDTO>> getAllUsers(){
		List<UserDTO> list = this.userServices.getAllUser();
		return new ResponseEntity<List<UserDTO>>(list, HttpStatus.OK);
	}
	
	//Get By User ID
	@GetMapping("/user/{id}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable("id") Integer id){
		UserDTO dto = this.userServices.getByUserId(id);
		return new ResponseEntity<UserDTO>(dto, HttpStatus.OK);
	}
	
	//Update By User ID
	@PutMapping("/user/{id}")
	public ResponseEntity<UserDTO> updateUserById(@PathVariable("id") Integer id, @RequestBody UserDTO userDto){
		UserDTO dto = this.userServices.updateUser(id, userDto);
		return new ResponseEntity<UserDTO>(dto, HttpStatus.OK);
	}
	
	//Delete By User ID
	@DeleteMapping("/user/{id}")
	public ResponseEntity<APIResponse> deleteUserById(@PathVariable("id") Integer id){
		this.userServices.deleteUser(id);
		return new ResponseEntity<APIResponse>(new APIResponse("User Deleted Succefully!!", true), HttpStatus.OK);
	}
}
