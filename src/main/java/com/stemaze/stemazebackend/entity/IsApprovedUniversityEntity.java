package com.stemaze.stemazebackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "isapprovedinstitute")
public class IsApprovedUniversityEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "university_name")
	private String universityName;
	
	@Column(name = "is_approved_university")
	private String isUniversityApproved;

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
	 * @return the universityName
	 */
	public String getUniversityName() {
		return universityName;
	}

	/**
	 * @param universityName the universityName to set
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	/**
	 * @return the isUniversityApproved
	 */
	public String getIsUniversityApproved() {
		return isUniversityApproved;
	}

	/**
	 * @param isUniversityApproved the isUniversityApproved to set
	 */
	public void setIsUniversityApproved(String isUniversityApproved) {
		this.isUniversityApproved = isUniversityApproved;
	}

	/**
	 * @param id
	 * @param universityName
	 * @param isUniversityApproved
	 */
	public IsApprovedUniversityEntity(Integer id, String universityName, String isUniversityApproved) {
		super();
		this.id = id;
		this.universityName = universityName;
		this.isUniversityApproved = isUniversityApproved;
	}

	/**
	 * 
	 */
	public IsApprovedUniversityEntity() {
		super();
	}

	@Override
	public String toString() {
		return "IsKiitStudentEntity [id=" + id + ", universityName=" + universityName + ", isUniversityApproved="
				+ isUniversityApproved + "]";
	}
	
}
