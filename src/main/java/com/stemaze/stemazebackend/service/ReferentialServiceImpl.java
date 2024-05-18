package com.stemaze.stemazebackend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.stemaze.stemazebackend.dto.DropDownDto;

@Service
public class ReferentialServiceImpl implements ReferentialService {

	@Override
	public List<DropDownDto> findDropDownList(List<String> key) {
		List<DropDownDto> dropDownDto = new ArrayList<>();
		
		for(String value : key) {
			switch(value) {
			case "mentorNmes":
				dropDownDto.add(getMentorNames());
			}
		}
		
		return null;
	}

	private DropDownDto getMentorNames() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
