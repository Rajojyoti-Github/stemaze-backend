package com.stemaze.stemazebackend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stemaze.stemazebackend.dao.MentorDao;
import com.stemaze.stemazebackend.dto.DropDownDto;
import com.stemaze.stemazebackend.dto.DropDownInnerValuesDto;
import com.stemaze.stemazebackend.entity.MentorEntity;

@Service
public class ReferentialServiceImpl implements ReferentialService {
	
	public final Logger logger = LogManager.getLogger();
	
	@Autowired
	MentorDao mentorDao;

	@Override
	public List<DropDownDto> findDropDownList(List<String> key) {
		List<DropDownDto> dropDownDto = new ArrayList<>();
		
		for(String value : key) {
			switch(value) {
			case "mentorNames":
				dropDownDto.add(getMentorNames());
				
			case "isKiitStudent":
				dropDownDto.add(isKiitStudent());
			
			case "timezone":
				dropDownDto.add(getTimeZones());
		}
		

		}
		return dropDownDto;
	}
	

	private DropDownDto getTimeZones() {
		return null;
	}

	private DropDownDto isKiitStudent() {
		DropDownDto dropDownDto = new DropDownDto();
		dropDownDto.setKey("isKiitStudent");
		List<>
		return null;
	}

	private DropDownDto getMentorNames() {
		DropDownDto dropDownDto = new DropDownDto();
		dropDownDto.setKey("");
		List<MentorEntity> mentorEntity = mentorDao.getListOfMentor();
		logger.info("list of Mentors", mentorEntity);
		List<DropDownDto> mentorDropDownList = new ArrayList<DropDownDto>();
		DropDownInnerValuesDto dropDownInnerValuesDto = new DropDownInnerValuesDto();
		for (MentorEntity mentor:mentorEntity) {
			dropDownInnerValuesDto.setCode(mentorEntity.get(1).toString());
			dropDownInnerValuesDto.setDescription(mentorEntity.get(1).toString());
//			mentorDropDownList.add(mentor);	
		}
		
		return dropDownDto;
	}
	
	

}
