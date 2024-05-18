package com.stemaze.stemazebackend.service;

import java.util.List;

import com.stemaze.stemazebackend.dto.DropDownDto;

public interface ReferentialService {

	List<DropDownDto> findDropDownList(List<String> requestBody);

}
