package com.stemaze.stemazebackend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stemaze.stemazebackend.dao.ApprovedUniversityDao;
import com.stemaze.stemazebackend.dao.MentorDao;
import com.stemaze.stemazebackend.dao.TimeZoneDao;
import com.stemaze.stemazebackend.dto.DropDownDto;
import com.stemaze.stemazebackend.dto.DropDownInnerValuesDto;
import com.stemaze.stemazebackend.entity.MentorEntity;

import io.micrometer.common.util.StringUtils;

@Service
public class ReferentialServiceImpl implements ReferentialService {
	
	public final Logger logger = LogManager.getLogger();
	
	@Autowired
	MentorDao mentorDao;
	
	@Autowired
	ApprovedUniversityDao approvedUniversityDao;
	
	@Autowired
	TimeZoneDao timeZoneDao;

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
		List<Object[]> isKiitStudentEntity = approvedUniversityDao.getIsApprovedUniversity();
		logger.info("list of TimeZones", isKiitStudentEntity);
		List<DropDownInnerValuesDto> isKiitStudent = null;
		dropDownDtoTimeZones.setValues(isKiitStudent);
		if(isKiitStudentEntity != null) {
			isKiitStudent = convertObjectToDto(isKiitStudentEntity, !mergeCodeAndDescription());
			dropDownDtoTimeZones.setValues(isKiitStudent);
		}
		return dropDownDtoTimeZones;
	}


	private DropDownDto getTimeZones() {
		DropDownDto dropDownDtoTimeZones = new DropDownDto();
		dropDownDtoTimeZones.setKey("timezone");
		List<Object[]> timeZoneEntity = timeZoneDao.getListTimeZone();
		logger.info("list of TimeZones", timeZoneEntity);
		List<DropDownInnerValuesDto> timeZones = null;
		dropDownDtoTimeZones.setValues(timeZones);
		if(timeZoneEntity != null) {
			timeZones = convertObjectToDto(timeZoneEntity, !mergeCodeAndDescription());
			dropDownDtoTimeZones.setValues(timeZones);
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
		logger.info("list of Yes. No:", mentorEntity);
		List<DropDownInnerValuesDto> mentorNames = null;
		dropDownDtoMentorNames.setValues(mentorNames);
		if(mentorEntity != null) {
			mentorNames = convertObjectToDto(mentorEntity, !mergeCodeAndDescription());
			dropDownDtoMentorNames.setValues(mentorNames);
		}
		return dropDownDtoMentorNames;
	}


	private List<DropDownInnerValuesDto> convertObjectToDto(List<Object[]> mentorEntity,
			Boolean mergeCodeAndDescription) {
		// TODO Auto-generated method stub
		List<DropDownInnerValuesDto> beanList = new ArrayList<>();
		
		for(Object[] objArr : mentorEntity) {
			if(objArr[0] != null) {
				DropDownInnerValuesDto bean = new DropDownInnerValuesDto();
				if(objArr.length >1) {
					bean.setCode( objArr[0].toString());
					if(mergeCodeAndDescription) {
						bean.setDescription(objArr[0].toString() + " - " + objArr[1].toString());
					}
					else {
						bean.setDescription(objArr[1].toString());
					}
				}
				else {
					bean.setCode(objArr[0].toString());
					bean.setDescription(objArr[0].toString());
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
