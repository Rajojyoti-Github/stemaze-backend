package com.stemaze.stemazebackend.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "classbooking")
public class ClassBookingEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "user_email")
	private String userEmail;
	
	@Column(name = "user_mobile_number")
	private String userMobileNumber;
	
	@Column(name = "mentor_name")
	private String mentorName;
	
	@Column(name = "mentor_mobile_number")
	private String mentorMobileNumber;
	
	@Column(name = "booked_date")
	private LocalDate bookedDate;
	
	@Column(name = "booked_time")
	private LocalTime bookedTime;
	
	@Column(name = "duration")
	private String duration;
	
	@Column(name = "amount")
	private String amount;
	
	@Column(name = "time_zone")
	private String timeZone;
	
	@Column(name = "updated_time_zone")
	private LocalDateTime updatedTimeZone;
	
	@Column(name = "updated_by")
	private String updatedBy;

}
