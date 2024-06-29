package com.stemaze.stemazebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stemaze.stemazebackend.dto.UserCreateDto;
import com.stemaze.stemazebackend.dto.UserDto;
import com.stemaze.stemazebackend.dto.UserLoginDto;
import com.stemaze.stemazebackend.service.RegisterService;

@RestController
@RequestMapping(value = "/api")
public class UserController {
	
	@Autowired
	RegisterService registerService;
	
	@PostMapping(value = "/registerUser")
	public ResponseEntity<UserCreateDto> registerUser(@RequestBody UserDto user){
		return new ResponseEntity<>(registerService.createUser(user), HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/updateUser")
	public ResponseEntity<UserCreateDto> updateUser(@RequestBody UserDto user){
		return new ResponseEntity<>(registerService.updateUser(user), HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/deleteUser")
	public ResponseEntity<UserCreateDto> deleteUser(@RequestBody UserDto user){
		return new ResponseEntity<>(registerService.deleteUser(user), HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/login")
	public ResponseEntity<UserCreateDto> loginUser(@RequestBody UserLoginDto userLogin){
		return new ResponseEntity<>(registerService.loginUser(userLogin), HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/getUser")
	public ResponseEntity<UserCreateDto> getUser(String id){
		return new ResponseEntity<>(registerService.getUser(id), HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/searchUser")
	public ResponseEntity<UserCreateDto> searchUser(@RequestBody UserDto user){
		return new ResponseEntity<> (registerService.searchUser(user), HttpStatus.OK);
		
	}

}
