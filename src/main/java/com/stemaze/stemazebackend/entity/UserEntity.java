package com.stemaze.stemazebackend.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class UserEntity {
	
	private Integer id;
	
	private String Name;
	
	private String emailAddress;
	
	private String phoneNumbr;
	
	private String countryOfOrigin;
	
	private String lastDegree;
	
	private String yearOfCompletion;
	
	private String currentDegree;
	
	private String expectedYearOfCompletion;
	
	private String careerInterest;
	
	private String interestInCareerAbroad;
	
	
		
		
	
	

}
