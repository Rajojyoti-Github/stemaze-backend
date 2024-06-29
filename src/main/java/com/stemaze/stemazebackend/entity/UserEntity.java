package com.stemaze.stemazebackend.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column (name = "career_interest")
	private String careerInterest;
	
	@Column (name = "name")
	private String name;
	
	@Column (name = "email_address")
	private String emailAddress;
	
	@Column (name = "password")
	private String password;
	
	@Column (name = "phone_number")
	private String phoneNumber;
	
	@Column (name = "country_of_origin")
	private String countryOfOrigin;
	
	@Column (name = "last_degree")
	private String lastDegree;
	
	@Column (name = "year_of_completion")
	private String yearOfCompletion;
	
	@Column (name = "current_degree")
	private String currentDegree;
	
	@Column (name = "expected_year_of_completion")
	private String expectedYearOfCompletion;
	
	@Column (name = "interest_in_career_abroad")
	private String interestInCareerAbroad;
	
	@Column (name = "persue_country1")
	private String persueCountry1;
	
	@Column (name = "persue_country2")
	private String persueCountry2;
	
	@Column (name = "persue_country3")
	private String persueCountry3;
	
	@Column (name = "topics_phd_sub1")
	private String topicsPhdSub1;
	
	@Column (name = "topics_phd_sub2")
	private String topicsPhdSub2;
	
	@Column (name = "topics_phd_sub3")
	private String topicsPhdSub3;
	
	@Column (name = "research_gate")
	private String researchGate;
	
	@Column (name = "linked_in_profile")
	private String linkedInProfile;
	
	@Column (name = "professional_interest")
	private String professionalInterest;
	
	@Column (name = "upload_cv")
	private String uploadCv;
	
	@Column (name = "upload_cover_letter")
	private String uploadCoverLetter;
	
	@Column (name = "created_time_stamp")
	private LocalDate createdTimeStamp;
	
	@Column (name = "updated_time_stamp")
	private LocalDate updatedTimeStamp;
	
	@Column (name = "updated_by")
	private String updatedBy;
	
	@Column(name = "is_kiit_student")
	private String isKiitStudent;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the phoneNumbr
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumbr the phoneNumbr to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the countryOfOrigin
	 */
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	/**
	 * @param countryOfOrigin the countryOfOrigin to set
	 */
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	/**
	 * @return the lastDegree
	 */
	public String getLastDegree() {
		return lastDegree;
	}

	/**
	 * @param lastDegree the lastDegree to set
	 */
	public void setLastDegree(String lastDegree) {
		this.lastDegree = lastDegree;
	}

	/**
	 * @return the yearOfCompletion
	 */
	public String getYearOfCompletion() {
		return yearOfCompletion;
	}

	/**
	 * @param yearOfCompletion the yearOfCompletion to set
	 */
	public void setYearOfCompletion(String yearOfCompletion) {
		this.yearOfCompletion = yearOfCompletion;
	}

	/**
	 * @return the currentDegree
	 */
	public String getCurrentDegree() {
		return currentDegree;
	}

	/**
	 * @param currentDegree the currentDegree to set
	 */
	public void setCurrentDegree(String currentDegree) {
		this.currentDegree = currentDegree;
	}

	/**
	 * @return the expectedYearOfCompletion
	 */
	public String getExpectedYearOfCompletion() {
		return expectedYearOfCompletion;
	}

	/**
	 * @param expectedYearOfCompletion the expectedYearOfCompletion to set
	 */
	public void setExpectedYearOfCompletion(String expectedYearOfCompletion) {
		this.expectedYearOfCompletion = expectedYearOfCompletion;
	}

	/**
	 * @return the careerInterest
	 */
	public String getCareerInterest() {
		return careerInterest;
	}

	/**
	 * @param careerInterest the careerInterest to set
	 */
	public void setCareerInterest(String careerInterest) {
		this.careerInterest = careerInterest;
	}

	/**
	 * @return the interestInCareerAbroad
	 */
	public String getInterestInCareerAbroad() {
		return interestInCareerAbroad;
	}

	/**
	 * @param interestInCareerAbroad the interestInCareerAbroad to set
	 */
	public void setInterestInCareerAbroad(String interestInCareerAbroad) {
		this.interestInCareerAbroad = interestInCareerAbroad;
	}

	/**
	 * @return the persueCountry1
	 */
	public String getPersueCountry1() {
		return persueCountry1;
	}

	/**
	 * @param persueCountry1 the persueCountry1 to set
	 */
	public void setPersueCountry1(String persueCountry1) {
		this.persueCountry1 = persueCountry1;
	}

	/**
	 * @return the persueCountry2
	 */
	public String getPersueCountry2() {
		return persueCountry2;
	}

	/**
	 * @param persueCountry2 the persueCountry2 to set
	 */
	public void setPersueCountry2(String persueCountry2) {
		this.persueCountry2 = persueCountry2;
	}

	/**
	 * @return the persueCountry3
	 */
	public String getPersueCountry3() {
		return persueCountry3;
	}

	/**
	 * @param persueCountry3 the persueCountry3 to set
	 */
	public void setPersueCountry3(String persueCountry3) {
		this.persueCountry3 = persueCountry3;
	}

	/**
	 * @return the topicsPhdSub1
	 */
	public String getTopicsPhdSub1() {
		return topicsPhdSub1;
	}

	/**
	 * @param topicsPhdSub1 the topicsPhdSub1 to set
	 */
	public void setTopicsPhdSub1(String topicsPhdSub1) {
		this.topicsPhdSub1 = topicsPhdSub1;
	}

	/**
	 * @return the topicsPhdSub2
	 */
	public String getTopicsPhdSub2() {
		return topicsPhdSub2;
	}

	/**
	 * @param topicsPhdSub2 the topicsPhdSub2 to set
	 */
	public void setTopicsPhdSub2(String topicsPhdSub2) {
		this.topicsPhdSub2 = topicsPhdSub2;
	}

	/**
	 * @return the topicsPhdSub3
	 */
	public String getTopicsPhdSub3() {
		return topicsPhdSub3;
	}

	/**
	 * @param topicsPhdSub3 the topicsPhdSub3 to set
	 */
	public void setTopicsPhdSub3(String topicsPhdSub3) {
		this.topicsPhdSub3 = topicsPhdSub3;
	}

	/**
	 * @return the researchGate
	 */
	public String getResearchGate() {
		return researchGate;
	}

	/**
	 * @param researchGate the researchGate to set
	 */
	public void setResearchGate(String researchGate) {
		this.researchGate = researchGate;
	}

	/**
	 * @return the linkedInProfile
	 */
	public String getLinkedInProfile() {
		return linkedInProfile;
	}

	/**
	 * @param linkedInProfile the linkedInProfile to set
	 */
	public void setLinkedInProfile(String linkedInProfile) {
		this.linkedInProfile = linkedInProfile;
	}

	/**
	 * @return the professionalInterest
	 */
	public String getProfessionalInterest() {
		return professionalInterest;
	}

	/**
	 * @param professionalInterest the professionalInterest to set
	 */
	public void setProfessionalInterest(String professionalInterest) {
		this.professionalInterest = professionalInterest;
	}

	/**
	 * @return the uploadCv
	 */
	public String getUploadCv() {
		return uploadCv;
	}

	/**
	 * @param uploadCv the uploadCv to set
	 */
	public void setUploadCv(String uploadCv) {
		this.uploadCv = uploadCv;
	}

	/**
	 * @return the uploadCoverLetter
	 */
	public String getUploadCoverLetter() {
		return uploadCoverLetter;
	}

	/**
	 * @param uploadCoverLetter the uploadCoverLetter to set
	 */
	public void setUploadCoverLetter(String uploadCoverLetter) {
		this.uploadCoverLetter = uploadCoverLetter;
	}

	/**
	 * @return the createdTimeStamp
	 */
	public LocalDate getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	/**
	 * @param createdTimeStamp the createdTimeStamp to set
	 */
	public void setCreatedTimeStamp(LocalDate createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	/**
	 * @return the updatedTimeStamp
	 */
	public LocalDate getUpdatedTimeStamp() {
		return updatedTimeStamp;
	}

	/**
	 * @param updatedTimeStamp the updatedTimeStamp to set
	 */
	public void setUpdatedTimeStamp(LocalDate updatedTimeStamp) {
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
	 * @return the isKiitStudent
	 */
	public String getIsKiitStudent() {
		return isKiitStudent;
	}

	/**
	 * @param isKiitStudent the isKiitStudent to set
	 */
	public void setIsKiitStudent(String isKiitStudent) {
		this.isKiitStudent = isKiitStudent;
	}

	/**
	 * @param id
	 * @param careerInterest
	 * @param name
	 * @param emailAddress
	 * @param password
	 * @param phoneNumbr
	 * @param countryOfOrigin
	 * @param lastDegree
	 * @param yearOfCompletion
	 * @param currentDegree
	 * @param expectedYearOfCompletion
	 * @param interestInCareerAbroad
	 * @param persueCountry1
	 * @param persueCountry2
	 * @param persueCountry3
	 * @param topicsPhdSub1
	 * @param topicsPhdSub2
	 * @param topicsPhdSub3
	 * @param researchGate
	 * @param linkedInProfile
	 * @param professionalInterest
	 * @param uploadCv
	 * @param uploadCoverLetter
	 * @param createdTimeStamp
	 * @param updatedTimeStamp
	 * @param updatedBy
	 * @param isKiitStudent
	 */
	public UserEntity(Integer id, String careerInterest, String name, String emailAddress, String password,
			String phoneNumber, String countryOfOrigin, String lastDegree, String yearOfCompletion, String currentDegree,
			String expectedYearOfCompletion, String interestInCareerAbroad, String persueCountry1,
			String persueCountry2, String persueCountry3, String topicsPhdSub1, String topicsPhdSub2,
			String topicsPhdSub3, String researchGate, String linkedInProfile, String professionalInterest,
			String uploadCv, String uploadCoverLetter, LocalDate createdTimeStamp, LocalDate updatedTimeStamp,
			String updatedBy, String isKiitStudent) {
		super();
		this.id = id;
		this.careerInterest = careerInterest;
		this.name = name;
		this.emailAddress = emailAddress;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.countryOfOrigin = countryOfOrigin;
		this.lastDegree = lastDegree;
		this.yearOfCompletion = yearOfCompletion;
		this.currentDegree = currentDegree;
		this.expectedYearOfCompletion = expectedYearOfCompletion;
		this.interestInCareerAbroad = interestInCareerAbroad;
		this.persueCountry1 = persueCountry1;
		this.persueCountry2 = persueCountry2;
		this.persueCountry3 = persueCountry3;
		this.topicsPhdSub1 = topicsPhdSub1;
		this.topicsPhdSub2 = topicsPhdSub2;
		this.topicsPhdSub3 = topicsPhdSub3;
		this.researchGate = researchGate;
		this.linkedInProfile = linkedInProfile;
		this.professionalInterest = professionalInterest;
		this.uploadCv = uploadCv;
		this.uploadCoverLetter = uploadCoverLetter;
		this.createdTimeStamp = createdTimeStamp;
		this.updatedTimeStamp = updatedTimeStamp;
		this.updatedBy = updatedBy;
		this.isKiitStudent = isKiitStudent;
	}

	/**
	 * 
	 */
	public UserEntity() {
		super();
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", careerInterest=" + careerInterest + ", name=" + name + ", emailAddress="
				+ emailAddress + ", password=" + password + ", phoneNumber=" + phoneNumber + ", countryOfOrigin="
				+ countryOfOrigin + ", lastDegree=" + lastDegree + ", yearOfCompletion=" + yearOfCompletion
				+ ", currentDegree=" + currentDegree + ", expectedYearOfCompletion=" + expectedYearOfCompletion
				+ ", interestInCareerAbroad=" + interestInCareerAbroad + ", persueCountry1=" + persueCountry1
				+ ", persueCountry2=" + persueCountry2 + ", persueCountry3=" + persueCountry3 + ", topicsPhdSub1="
				+ topicsPhdSub1 + ", topicsPhdSub2=" + topicsPhdSub2 + ", topicsPhdSub3=" + topicsPhdSub3
				+ ", researchGate=" + researchGate + ", linkedInProfile=" + linkedInProfile + ", professionalInterest="
				+ professionalInterest + ", uploadCv=" + uploadCv + ", uploadCoverLetter=" + uploadCoverLetter
				+ ", createdTimeStamp=" + createdTimeStamp + ", updatedTimeStamp=" + updatedTimeStamp + ", updatedBy="
				+ updatedBy + ", isKiitStudent=" + isKiitStudent + "]";
	}

	
}
