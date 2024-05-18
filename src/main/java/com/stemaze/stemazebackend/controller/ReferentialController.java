package com.stemaze.stemazebackend.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stemaze.stemazebackend.dto.DropDownDto;
import com.stemaze.stemazebackend.dto.UserCreateDto;
import com.stemaze.stemazebackend.dto.UserDto;
import com.stemaze.stemazebackend.service.ReferentialService;

@RestController
@RequestMapping(value = "/api")
public class ReferentialController {

	public final Logger logger = LogManager.getLogger();
	
	@Autowired
	ReferentialService referentialService;
	
	@PostMapping(value = "referential/dropdownList")
	public ResponseEntity<List<DropDownDto>> dropdownList(@RequestBody(required = false) List<String> requestBody) {
		logger.info("DropDown for the following items", requestBody);
		List<DropDownDto> dropDownDto = referentialService.findDropDownList(requestBody);
		return new ResponseEntity<>(dropDownDto, HttpStatus.OK);

	}

}
