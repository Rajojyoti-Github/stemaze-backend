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
	
	@Column(name = "appointment_date")
	private LocalDate appointmentDate;
	
	@Column(name = "appointment_time")
	private LocalTime appointmentTime;
	
	@Column(name = "duration")
	private String duration;
	
	@Column(name = "amount")
	private String amount;
	
	@Column(name = "time_zone")
	private String timeZone;
	
	@Column(name = "current_date_time_stamp")
	private LocalDateTime currentTimeStamp;
	
	@Column(name = "updated_date_time_stamp")
	private LocalDateTime updatedTimeStamp;
	
	@Column(name = "updated_by")
	private String updatedBy;

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
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
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
	 * @return the currentTimeStamp
	 */
	public LocalDateTime getCurrentTimeStamp() {
		return currentTimeStamp;
	}

	/**
	 * @param currentTimeStamp the currentTimeStamp to set
	 */
	public void setCurrentTimeStamp(LocalDateTime currentTimeStamp) {
		this.currentTimeStamp = currentTimeStamp;
	}

	/**
	 * @return the updatedTimeStamp
	 */
	public LocalDateTime getUpdatedTimeStamp() {
		return updatedTimeStamp;
	}

	/**
	 * @param updatedTimeStamp the updatedTimeStamp to set
	 */
	public void setUpdatedTimeStamp(LocalDateTime updatedTimeStamp) {
		this.updatedTimeStamp = updatedTimeStamp;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @param id
	 * @param userName
	 * @param userEmail
	 * @param userMobileNumber
	 * @param mentorName
	 * @param mentorMobileNumber
	 * @param appointmentDate
	 * @param appointmentTime
	 * @param duration
	 * @param amount
	 * @param timeZone
	 * @param currentTimeStamp
	 * @param updatedTimeStamp
	 * @param updatedBy
	 */
	public ClassBookingEntity(Integer id, String userName, String userEmail, String userMobileNumber, String mentorName,
			String mentorMobileNumber, LocalDate appointmentDate, LocalTime appointmentTime, String duration,
			String amount, String timeZone, LocalDateTime currentTimeStamp, LocalDateTime updatedTimeStamp,
			String updatedBy) {
		super();
		this.id = id;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userMobileNumber = userMobileNumber;
		this.mentorName = mentorName;
		this.mentorMobileNumber = mentorMobileNumber;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.duration = duration;
		this.amount = amount;
		this.timeZone = timeZone;
		this.currentTimeStamp = currentTimeStamp;
		this.updatedTimeStamp = updatedTimeStamp;
		this.updatedBy = updatedBy;
	}

	/**
	 * 
	 */
	public ClassBookingEntity() {
		super();
	}

	@Override
	public String toString() {
		return "ClassBookingEntity [id=" + id + ", userName=" + userName + ", userEmail=" + userEmail
				+ ", userMobileNumber=" + userMobileNumber + ", mentorName=" + mentorName + ", mentorMobileNumber="
				+ mentorMobileNumber + ", appointmentDate=" + appointmentDate + ", appointmentTime=" + appointmentTime
				+ ", duration=" + duration + ", amount=" + amount + ", timeZone=" + timeZone + ", currentTimeStamp="
				+ currentTimeStamp + ", updatedTimeStamp=" + updatedTimeStamp + ", updatedBy=" + updatedBy + "]";
	}
	
}
