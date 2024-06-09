package com.stemaze.stemazebackend.service;

import org.springframework.stereotype.Service;

import com.stemaze.stemazebackend.dto.AppointmentRegisterDto;
import com.stemaze.stemazebackend.dto.AppointmentRequestRegisterDto;

@Service
public interface AppointmentRegisterService {
	
	
	AppointmentRegisterDto registerAppointmentofUser(AppointmentRequestRegisterDto dto);

	AppointmentRegisterDto updateAppointment(AppointmentRequestRegisterDto dto);

	AppointmentRegisterDto deleteAppointment(AppointmentRequestRegisterDto dto);

}
