package com.stemaze.stemazebackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mentor")
public class MentorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "mentor_name")
	private String mentorName;
	
	@Column(name = "mobile_number")
	private String mobileNumber;
	
	@Column(name = "mentor_Address")
	private String mentorAddress;

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
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the mentorAddress
	 */
	public String getMentorAddress() {
		return mentorAddress;
	}

	/**
	 * @param mentorAddress the mentorAddress to set
	 */
	public void setMentorAddress(String mentorAddress) {
		this.mentorAddress = mentorAddress;
	}

	/**
	 * @param id
	 * @param mentorName
	 * @param mobileNumber
	 * @param mentorAddress
	 */
	public MentorEntity(Integer id, String mentorName, String mobileNumber, String mentorAddress) {
		super();
		this.id = id;
		this.mentorName = mentorName;
		this.mobileNumber = mobileNumber;
		this.mentorAddress = mentorAddress;
	}

	/**
	 * 
	 */
	public MentorEntity() {
		super();
	}

	@Override
	public String toString() {
		return "MentorEntity [id=" + id + ", mentorName=" + mentorName + ", mobileNumber=" + mobileNumber
				+ ", mentorAddress=" + mentorAddress + "]";
	}
	
	
	

}
