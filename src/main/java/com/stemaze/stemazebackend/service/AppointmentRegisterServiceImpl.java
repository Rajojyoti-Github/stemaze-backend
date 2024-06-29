package com.stemaze.stemazebackend.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.stemaze.stemazebackend.dao.AppointmentDao;
import com.stemaze.stemazebackend.dto.AppointmentRegisterDto;
import com.stemaze.stemazebackend.dto.AppointmentRequestRegisterDto;
import com.stemaze.stemazebackend.entity.ClassBookingEntity;

@Service
public class AppointmentRegisterServiceImpl implements AppointmentRegisterService {
	
	@Autowired
	AppointmentDao appointmentDao;
	
	
	private static final Logger logger = LoggerFactory.getLogger(AppointmentRegisterServiceImpl.class);


	@Override
	public AppointmentRegisterDto registerAppointmentofUser(
			AppointmentRequestRegisterDto dto) {
		ClassBookingEntity appointmentEntity = new ClassBookingEntity();
		ClassBookingEntity finalAppointmentEntity = null;
		if(StringUtils.hasLength(dto.getUserMobileNumber())) {
			ClassBookingEntity entity = appointmentDao.getByMobileNumber(dto.getUserMobileNumber());
			if(entity != null) {
				logger.info("User already have an appointment");
				appointmentEntity = convertAppointmentDtoToEntity(dto, appointmentEntity);
			} else {
				logger.info("User do not have an appointment");
				appointmentEntity = convertAppointmentDtoToEntity(dto, appointmentEntity);
			}
			finalAppointmentEntity = appointmentDao.save(appointmentEntity);
		}
		AppointmentRegisterDto appointmentRegisterDto = convertEntitytoDTO(finalAppointmentEntity);
		return appointmentRegisterDto;
	}

	private AppointmentRegisterDto convertEntitytoDTO(ClassBookingEntity appointmentEntity) {
		// TODO Auto-generated method stub
		AppointmentRegisterDto registeredDto = new AppointmentRegisterDto();
		if(appointmentEntity != null) {
			if(appointmentEntity.getId() != null) {
				registeredDto.setId(appointmentEntity.getId());
			}
			if(StringUtils.hasLength(appointmentEntity.getUserName())) {
				registeredDto.setUserName(appointmentEntity.getUserName());
			}
			if(StringUtils.hasLength(appointmentEntity.getUserEmail())) {
				registeredDto.setUserEmail(appointmentEntity.getUserEmail());
			}
			if(StringUtils.hasLength(appointmentEntity.getUserMobileNumber())) {
				registeredDto.setUserMobileNumber(appointmentEntity.getUserMobileNumber());
			}
			if(StringUtils.hasLength(appointmentEntity.getMentorName())) {
				registeredDto.setMentorName(appointmentEntity.getMentorName());
			}
			if(StringUtils.hasLength(appointmentEntity.getMentorMobileNumber())) {
				registeredDto.setMentorMobileNumber(appointmentEntity.getMentorMobileNumber());
			}
			if(StringUtils.hasLength(appointmentEntity.getTimeZone())) {
				registeredDto.setTimeZone(appointmentEntity.getTimeZone());
			}
			if(StringUtils.hasLength(appointmentEntity.getDuration())) {
				registeredDto.setDuraton(appointmentEntity.getDuration());
			}
			if(StringUtils.hasLength(appointmentEntity.getAmount())) {
				registeredDto.setAmount(appointmentEntity.getAmount());
			}
			if(appointmentEntity.getAppointmentDate() != null) {
				registeredDto.setAppointmentDate(appointmentEntity.getAppointmentDate());
			}
			if(appointmentEntity.getAppointmentTime() != null) {
				registeredDto.setAppointmentTime(appointmentEntity.getAppointmentTime());
			}
		}
		return registeredDto;
	}

	/**
	 * @param dto
	 * @param entity
	 * @return 
	 */
	private ClassBookingEntity convertAppointmentDtoToEntity(AppointmentRequestRegisterDto dto, ClassBookingEntity entity) {
		
		if(StringUtils.hasLength(dto.getUserName())) {
			entity.setUserName(dto.getUserName());
		}
		if(StringUtils.hasLength(dto.getUserMobileNumber())) {
			entity.setUserMobileNumber(dto.getUserMobileNumber());
		}
		if(StringUtils.hasLength(dto.getUserEmail())) {
			entity.setUserEmail(dto.getUserEmail());
		}
		if(StringUtils.hasLength(dto.getMentorName())) {
			entity.setMentorName(dto.getMentorName());
		}
		if(StringUtils.hasLength(dto.getMentorMobileNumber())) {
			entity.setMentorMobileNumber(dto.getMentorMobileNumber());
		}
		if(StringUtils.hasLength(dto.getDuraton())) {
			entity.setDuration(dto.getDuraton());
		}
		if(StringUtils.hasLength(dto.getTimeZone())) {
			entity.setTimeZone(dto.getTimeZone());
		}
		if(dto.getAppointmentDate() != null) {
			entity.setAppointmentDate(dto.getAppointmentDate());
		}
		if(dto.getAppointmentTime() != null) {
			entity.setAppointmentTime(dto.getAppointmentTime());
		}
		if(StringUtils.hasLength(dto.getAmount())) {
			entity.setAmount(dto.getAmount());
		}
		entity.setCurrentTimeStamp(LocalDateTime.now());
		entity.setUpdatedTimeStamp(LocalDateTime.now());
		entity.setUpdatedBy("System");
		return entity;
	}

	@Override
	public AppointmentRegisterDto updateAppointment(AppointmentRequestRegisterDto dto) {
		AppointmentRegisterDto appointmentRegisterDto = new AppointmentRegisterDto();
		ClassBookingEntity appointmentEntity = new ClassBookingEntity();
		ClassBookingEntity finalAppointmentEntity = null;
		if(dto.getId() != null) {
			ClassBookingEntity entity = appointmentDao.getReferenceById(dto.getId());
			try {
				if(entity != null) {
					appointmentEntity = convertAppointmentDtoToEntity(dto, entity);
					finalAppointmentEntity = appointmentDao.save(appointmentEntity);
					appointmentRegisterDto = convertEntitytoDTO(finalAppointmentEntity);
				}
			} catch (Exception e) {
				logger.info("The update was not successfull because of the following issue", e.getCause());
			}
		}
		return appointmentRegisterDto;
	}

	@Override
	public AppointmentRegisterDto deleteAppointment(AppointmentRequestRegisterDto dto) {
		AppointmentRegisterDto appointmentRegisterDto = new AppointmentRegisterDto();
		ClassBookingEntity appointmentEntity = new ClassBookingEntity();
		if(dto.getId() != null) {
			ClassBookingEntity entity = appointmentDao.getReferenceById(dto.getId());
			if(entity != null) {
				appointmentDao.deleteById(Integer.valueOf(entity.getId()));
				logger.info("The User has been successfully deleted.");
				appointmentRegisterDto = convertEntitytoDTO(entity);
			}
		}
		return appointmentRegisterDto;
	}

	@Override
	public AppointmentRegisterDto getUser(String id) {
		
		AppointmentRegisterDto appointmentRegister = new AppointmentRegisterDto();
		
		return null;
	}

	@Override
	public List<AppointmentRegisterDto> searchUser(AppointmentRequestRegisterDto dto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
