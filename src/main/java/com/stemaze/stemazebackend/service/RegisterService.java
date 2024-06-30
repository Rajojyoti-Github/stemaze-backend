package com.stemaze.stemazebackend.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.stemaze.stemazebackend.dto.UserCreateDto;
import com.stemaze.stemazebackend.dto.UserDto;
import com.stemaze.stemazebackend.dto.UserLoginDto;

public interface RegisterService {

	UserCreateDto createUser(UserDto user);

	UserCreateDto updateUser(UserDto user);

	UserCreateDto deleteUser(UserDto user);

	UserCreateDto loginUser(UserLoginDto userLogin);

	UserCreateDto getUser(String id);

	List<UserCreateDto> searchUser(UserDto user);
	
	

}
