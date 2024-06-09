package com.stemaze.stemazebackend.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentRequestRegisterDto {
	
	private Integer id;
	
	private String userName;
	
	private String userEmail;
	
	private String userMobileNumber;
	
	private String mentorName;
	
	private String mentorMobileNumber;
	
	private LocalDate appointmentDate;
	
	private LocalTime appointmentTime;
	
	private String duraton;
	
	private String amount;
	
	private String timeZone;

	
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @return the userMobileNumber
	 */
	public String getUserMobileNumber() {
		return userMobileNumber;
	}

	/**
	 * @param userMobileNumber the userMobileNumber to set
	 */
	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	/**
	 * @return the mentorName
	 */
	public String getMentorName() {
		return mentorName;
	}

	/**
	 * @param mentorName the mentorName to set
	 */
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}

	/**
	 * @return the mentorMobileNumber
	 */
	public String getMentorMobileNumber() {
		return mentorMobileNumber;
	}

	/**
	 * @param mentorMobileNumber the mentorMobileNumber to set
	 */
	public void setMentorMobileNumber(String mentorMobileNumber) {
		this.mentorMobileNumber = mentorMobileNumber;
	}

	/**
	 * @return the appointmentDate
	 */
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	/**
	 * @param appointmentDate the appointmentDate to set
	 */
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	/**
	 * @return the appointmentTime
	 */
	public LocalTime getAppointmentTime() {
		return appointmentTime;
	}

	/**
	 * @param appointmentTime the appointmentTime to set
	 */
	public void setAppointmentTime(LocalTime appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	/**
	 * @return the duraton
	 */
	public String getDuraton() {
		return duraton;
	}

	/**
	 * @param duraton the duraton to set
	 */
	public void setDuraton(String duraton) {
		this.duraton = duraton;
	}

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * @return the timeZone
	 */
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 * @param timeZone the timeZone to set
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	/**
	 * @param userName
	 * @param userEmail
	 * @param userMobileNumber
	 * @param mentorName
	 * @param mentorMobileNumber
	 * @param appointmentDate
	 * @param appointmentTime
	 * @param duraton
	 * @param amount
	 * @param timeZone
	 */
	public AppointmentRequestRegisterDto(Integer id, String userName, String userEmail, String userMobileNumber, String mentorName,
			String mentorMobileNumber, LocalDate appointmentDate, LocalTime appointmentTime, String duraton,
			String amount, String timeZone) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userMobileNumber = userMobileNumber;
		this.mentorName = mentorName;
		this.mentorMobileNumber = mentorMobileNumber;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.duraton = duraton;
		this.amount = amount;
		this.timeZone = timeZone;
		this.id = id;
	}

	/**
	 * 
	 */
	public AppointmentRequestRegisterDto() {
		super();
	}

	@Override
	public String toString() {
		return "AppointmentRequestRegisterDto [id=" + id + ", userName=" + userName + ", userEmail=" + userEmail
				+ ", userMobileNumber=" + userMobileNumber + ", mentorName=" + mentorName + ", mentorMobileNumber="
				+ mentorMobileNumber + ", appointmentDate=" + appointmentDate + ", appointmentTime=" + appointmentTime
				+ ", duraton=" + duraton + ", amount=" + amount + ", timeZone=" + timeZone + "]";
	}

}
