package com.stemaze.stemazebackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stemaze.stemazebackend.dto.AppointmentRegisterDto;
import com.stemaze.stemazebackend.dto.AppointmentRequestRegisterDto;

@Service
public interface AppointmentRegisterService {
	
	
	AppointmentRegisterDto registerAppointmentofUser(AppointmentRequestRegisterDto dto);

	AppointmentRegisterDto updateAppointment(AppointmentRequestRegisterDto dto);

	AppointmentRegisterDto deleteAppointment(AppointmentRequestRegisterDto dto);

	AppointmentRegisterDto getUser(String id);

	List<AppointmentRegisterDto> searchUser(AppointmentRequestRegisterDto dto);


}
