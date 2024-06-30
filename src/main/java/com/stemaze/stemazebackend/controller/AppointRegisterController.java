package com.stemaze.stemazebackend.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stemaze.stemazebackend.dto.AppointmentRegisterDto;
import com.stemaze.stemazebackend.dto.AppointmentRequestRegisterDto;
import com.stemaze.stemazebackend.dto.UserCreateDto;
import com.stemaze.stemazebackend.dto.UserDto;
import com.stemaze.stemazebackend.service.AppointmentRegisterService;

@RestController
@RequestMapping(value = "/api")
public class AppointRegisterController {
	
	@Autowired
	AppointmentRegisterService appointmentRegisterService;
	
	@PostMapping(value = "/registerAppointment")
	public ResponseEntity<AppointmentRegisterDto> registerAnAppointment(@RequestBody AppointmentRequestRegisterDto dto){
		return new ResponseEntity<>(appointmentRegisterService.registerAppointmentofUser(dto), HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/updateAppointment")
	public ResponseEntity<AppointmentRegisterDto> updateAnAppointment(@RequestBody AppointmentRequestRegisterDto dto){
		return new ResponseEntity<>(appointmentRegisterService.updateAppointment(dto), HttpStatus.OK);
	}
	
	@PostMapping(value = "/deleteAppointment")
	public ResponseEntity<AppointmentRegisterDto> deleteAnAppointmnt(@RequestBody AppointmentRequestRegisterDto dto){
		return new ResponseEntity<>(appointmentRegisterService.deleteAppointment(dto), HttpStatus.OK);
	}
	
	@GetMapping(value = "/getAppointmment")
	public ResponseEntity<AppointmentRegisterDto> getUser(Integer id){
		return new ResponseEntity<>(appointmentRegisterService.getUser(id), HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/searchAppointment")
	public ResponseEntity<List<AppointmentRegisterDto>> searchUser(@RequestBody AppointmentRequestRegisterDto dto){
		return new ResponseEntity<> (appointmentRegisterService.searchUser(dto), HttpStatus.OK);
		
	}

}
