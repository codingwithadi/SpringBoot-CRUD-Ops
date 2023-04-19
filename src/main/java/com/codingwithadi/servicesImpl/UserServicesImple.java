package com.codingwithadi.servicesImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingwithadi.DTO.UserDTO;
import com.codingwithadi.exception.UserNotFoundException;
import com.codingwithadi.model.User;
import com.codingwithadi.repo.UserRepo;
import com.codingwithadi.services.UserServices;

@Service
public class UserServicesImple implements UserServices {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDTO addUser(UserDTO userDto) {
		User user = this.modelMapper.map(userDto, User.class);
		User saved = this.userRepo.save(user);
		UserDTO dto = this.modelMapper.map(saved, UserDTO.class);
		return dto;
	}

	@Override
	public List<UserDTO> getAllUser() {
		List<User> list = this.userRepo.findAll();
		List<UserDTO> dtos = list.stream().map((eUser) -> this.modelMapper.map(eUser, UserDTO.class))
				.collect(Collectors.toList());
		return dtos;
	}

	@Override
	public UserDTO getByUserId(int userId) {
		User getUser = this.userRepo.findById(userId)
				.orElseThrow(() -> new UserNotFoundException("User", "Id", userId));
		UserDTO dto = this.modelMapper.map(getUser, UserDTO.class);
		return dto;
	}

	@Override
	public UserDTO updateUser(int userId, UserDTO userDto) {
		User getUser = this.userRepo.findById(userId)
				.orElseThrow(() -> new UserNotFoundException("User", "Id", userId));

		getUser.setUserFullName(userDto.getUserFullName());
		getUser.setUserName(userDto.getUserName());
		getUser.setUserMobileNumber(userDto.getUserMobileNumber());
		getUser.setUserEmail(userDto.getUserEmail());

		User saveUser = this.userRepo.save(getUser);

		UserDTO dto = this.modelMapper.map(saveUser, UserDTO.class);
		return dto;
	}

	@Override
	public void deleteUser(int userId) {
		User getUser = this.userRepo.findById(userId)
				.orElseThrow(() -> new UserNotFoundException("User", "Id", userId));
		this.userRepo.delete(getUser);

	}

}
