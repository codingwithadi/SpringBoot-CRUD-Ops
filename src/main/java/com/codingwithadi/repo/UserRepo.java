package com.codingwithadi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingwithadi.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	

}
