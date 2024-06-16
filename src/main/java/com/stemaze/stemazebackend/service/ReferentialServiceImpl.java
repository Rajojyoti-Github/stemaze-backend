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

import io.micrometer.common.util.StringUtils;

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
	

	private DropDownDto isKiitStudent() {
		DropDownDto dropDownDtoTimeZones = new DropDownDto();
		dropDownDtoTimeZones.setKey("isKiitStudent");
		List<Object[]> isKiitStudentEntity = mentorDao.getListOfMentor();
		logger.info("list of TimeZones", isKiitStudentEntity);
		List<DropDownInnerValuesDto> isKiitStudent = null;
		dropDownDtoTimeZones.setValues(isKiitStudent);
		if(isKiitStudentEntity != null) {
			isKiitStudent = convertObjectToDto(isKiitStudentEntity, !mergeCodeAndDescription());
		}
		return dropDownDtoTimeZones;
	}


	private DropDownDto getTimeZones() {
		DropDownDto dropDownDtoTimeZones = new DropDownDto();
		dropDownDtoTimeZones.setKey("timezone");
		List<Object[]> timeZoneEntity = mentorDao.getListOfMentor();
		logger.info("list of TimeZones", timeZoneEntity);
		List<DropDownInnerValuesDto> timeZones = null;
		dropDownDtoTimeZones.setValues(timeZones);
		if(timeZoneEntity != null) {
			timeZones = convertObjectToDto(timeZoneEntity, !mergeCodeAndDescription());
		}
		return dropDownDtoTimeZones;
	}

//	private DropDownDto isKiitStudent() {
//		DropDownDto dropDownDto = new DropDownDto();
//		dropDownDto.setKey("isKiitStudent");
//		List<>
//		return null;
//	}

	private DropDownDto getMentorNames() {
		DropDownDto dropDownDtoMentorNames = new DropDownDto();
		dropDownDtoMentorNames.setKey("mentorNames");
		List<Object[]> mentorEntity = mentorDao.getListOfMentor();
		logger.info("list of Mentors", mentorEntity);
		List<DropDownInnerValuesDto> mentorNames = null;
		dropDownDtoMentorNames.setValues(mentorNames);
		if(mentorEntity != null) {
			mentorNames = convertObjectToDto(mentorEntity, !mergeCodeAndDescription());
		}
		return dropDownDtoMentorNames;
	}


	private List<DropDownInnerValuesDto> convertObjectToDto(List<Object[]> mentorEntity,
			Boolean mergeCodeAndDescription) {
		// TODO Auto-generated method stub
		List<DropDownInnerValuesDto> beanList = new ArrayList<>();
		
		for(Object[] objArr : mentorEntity) {
			if(StringUtils.isNotBlank(((String) objArr[0]).trim())) {
				DropDownInnerValuesDto bean = new DropDownInnerValuesDto();
				if(objArr.length >1) {
					bean.setCode((String) objArr[0]);
					if(mergeCodeAndDescription) {
						bean.setDescription((String) objArr[0] + " - " + (String) objArr[1]);
					}
					else {
						bean.setDescription((String) objArr[1]);
					}
				}
				else {
					bean.setCode((String) objArr[0]);
					bean.setDescription((String) objArr[0]);
				}
				beanList.add(bean);
			}
		}
		return beanList;
	}

	
	public boolean mergeCodeAndDescription() {
	return true;
	}
	
	

}
