package com.stemaze.stemazebackend.service;


import com.stemaze.stemazebackend.dto.UserCreateDto;
import com.stemaze.stemazebackend.dto.UserDto;
import com.stemaze.stemazebackend.dto.UserLoginDto;


public interface RegisterService {

	UserCreateDto createUser(UserDto user);

	UserCreateDto updateUser(UserDto user);

	UserCreateDto deleteUser(UserDto user);

	UserCreateDto loginUser(UserLoginDto userLogin);
	
	

}
