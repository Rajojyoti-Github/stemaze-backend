package com.stemaze.stemazebackend.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stemaze.stemazebackend.dao.UserCreateDao;
import com.stemaze.stemazebackend.dto.UserCreateDto;
import com.stemaze.stemazebackend.dto.UserDto;
import com.stemaze.stemazebackend.dto.UserLoginDto;
import com.stemaze.stemazebackend.entity.UserEntity;

import io.micrometer.common.util.StringUtils;

@Service
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	UserCreateDao userCreateDao;

	@Override
	public UserCreateDto createUser(UserDto user) {
		if (user.getName() != null) {
			UserEntity userCreateDTO = userCreateDao.findByEmailAddress(user.getEmailAddress());
			if (userCreateDTO == null) {
				UserEntity userEntity = new UserEntity();
				if(!StringUtils.isEmpty(user.getName())) {
					userEntity.setName(user.getName());
				}
				if(!StringUtils.isEmpty(user.getEmailAddress())) {
					userEntity.setEmailAddress(user.getEmailAddress());
				}
				if(!StringUtils.isEmpty(user.getPhoneNumbr())) {
					userEntity.setPhoneNumbr(user.getPhoneNumbr());
				}
				if(!StringUtils.isEmpty(user.getCountryOfOrigin())) {
					userEntity.setCountryOfOrigin(user.getCountryOfOrigin());
				}
				if(!StringUtils.isEmpty(user.getLastDegree())) {
					userEntity.setLastDegree(user.getLastDegree());
				}
				if(!StringUtils.isEmpty(user.getYearOfCompletion())) {
					userEntity.setYearOfCompletion(user.getYearOfCompletion());
				}
				if(!StringUtils.isEmpty(user.getCurrentDegree())) {
					userEntity.setCurrentDegree(user.getCurrentDegree());
				}
				if(!StringUtils.isEmpty(user.getExpectedYearOfCompletion())) {
					userEntity.setExpectedYearOfCompletion(user.getExpectedYearOfCompletion());
				}
				if(!StringUtils.isEmpty(user.getCareerInterest())) {
					userEntity.setCareerInterest(user.getCareerInterest());
				}
				if(!StringUtils.isEmpty(user.getInterestInCareerAbroad())) {
					userEntity.setInterestInCareerAbroad(user.getInterestInCareerAbroad());
				}
				if(!StringUtils.isEmpty(user.getPersueCountry1())) {
					userEntity.setPersueCountry1(user.getPersueCountry1());
				}
				if(!StringUtils.isEmpty(user.getPersueCountry2())) {
					userEntity.setPersueCountry2(user.getPersueCountry2());
				}
				if(!StringUtils.isEmpty(user.getPersueCountry3())) {
					userEntity.setPersueCountry3(user.getPersueCountry3());
				}
				if(!StringUtils.isEmpty(user.getTopicsPhdSub1())) {
					userEntity.setTopicsPhdSub1(user.getTopicsPhdSub1());
				}
				if(!StringUtils.isEmpty(user.getTopicsPhdSub2())) {
					userEntity.setTopicsPhdSub2(user.getTopicsPhdSub2());
				}
				if(!StringUtils.isEmpty(user.getTopicsPhdSub3())) {
					userEntity.setTopicsPhdSub3(user.getTopicsPhdSub3());
				}
				if(!StringUtils.isEmpty(user.getResearchGate())) {
					userEntity.setResearchGate(user.getResearchGate());
				}
				if(!StringUtils.isEmpty(user.getLinkedInProfile())) {
					userEntity.setLinkedInProfile(user.getLinkedInProfile());
				}
				if(!StringUtils.isEmpty(user.getProfessionalInterest())) {
					userEntity.setProfessionalInterest(user.getProfessionalInterest());
				}
				userEntity.setCreatedTimeStamp(LocalDate.now());
				userEntity.setUpdatedTimeStamp(LocalDate.now());
				userEntity.setUpdatedBy("System");

				userCreateDao.save(userEntity);
				System.out.println("User has been successfully registered");
				return mapUserToDto(user);
			} else {
				System.out.println("UserId is already present");
			}
		}
		System.out.println("UserId is already present");
		return null;
	}

	private UserCreateDto mapUserToDto(UserDto user) {
		UserEntity userEntity = userCreateDao.findByEmailAddress(user.getEmailAddress());
		UserCreateDto myNewUser = new UserCreateDto();
		if(userEntity != null) {
			if(userEntity.getName() != null) {
				myNewUser.setName(userEntity.getName());
			}
			if(userEntity.getEmailAddress() != null) {
				myNewUser.setEmailAddress(userEntity.getEmailAddress());
			}
			if(userEntity.getPhoneNumbr() != null) {
				myNewUser.setPhoneNumbr(user.getPhoneNumbr());
			}
			if(userEntity.getCountryOfOrigin() != null) {
				myNewUser.setCountryOfOrigin(user.getCountryOfOrigin());
			}
			if(userEntity.getLastDegree() != null) {
				myNewUser.setLastDegree(user.getLastDegree());
			}
			if(userEntity.getYearOfCompletion() != null) {
				myNewUser.setYearOfCompletion(user.getYearOfCompletion());
			}
			if(userEntity.getCurrentDegree() != null) {
				myNewUser.setCurrentDegree(user.getCurrentDegree());
			}
			if(userEntity.getExpectedYearOfCompletion() != null) {
				myNewUser.setExpectedYearOfCompletion(user.getExpectedYearOfCompletion());
			}
			if(userEntity.getCareerInterest() != null) {
				myNewUser.setCareerInterest(user.getCareerInterest());
			}
			if(userEntity.getInterestInCareerAbroad() != null) {
				myNewUser.setInterestInCareerAbroad(user.getInterestInCareerAbroad());
			}
			if(userEntity.getPersueCountry1() != null) {
				myNewUser.setPersueCountry1(user.getPersueCountry1());
			}
			if(userEntity.getPersueCountry2() != null) {
				myNewUser.setPersueCountry2(user.getPersueCountry2());
			}
			if(userEntity.getPersueCountry3() != null) {
				myNewUser.setPersueCountry3(user.getPersueCountry3());
			}
			if(userEntity.getTopicsPhdSub1() != null) {
				myNewUser.setTopicsPhdSub1(user.getTopicsPhdSub1());
			}
			if(userEntity.getTopicsPhdSub2() != null) {
				myNewUser.setTopicsPhdSub2(user.getTopicsPhdSub2());
			}
			if(userEntity.getTopicsPhdSub3() != null) {
				myNewUser.setTopicsPhdSub3(user.getTopicsPhdSub3());
			}
			if(userEntity.getResearchGate() != null) {
				myNewUser.setResearchGate(user.getResearchGate());
			}
			if(userEntity.getLinkedInProfile() != null) {
				myNewUser.setLinkedInProfile(user.getLinkedInProfile());
			}
			if(userEntity.getProfessionalInterest() != null) {
				myNewUser.setProfessionalInterest(user.getProfessionalInterest());
			}
		}
		
		return myNewUser;
	}

	@Override
	public UserCreateDto updateUser(UserDto user) {
		
		UserEntity userEntity = userCreateDao.findByEmailAddress(user.getEmailAddress());
		if(userEntity != null) {
			UserEntity userUpdatedEntity = new UserEntity();
			if(!StringUtils.isEmpty(user.getName())) {
				userUpdatedEntity.setName(user.getName());
			}
			if(!StringUtils.isEmpty(user.getEmailAddress())) {
				userUpdatedEntity.setEmailAddress(user.getEmailAddress());
			}
			if(!StringUtils.isEmpty(user.getPhoneNumbr())) {
				userUpdatedEntity.setPhoneNumbr(user.getPhoneNumbr());
			}
			if(!StringUtils.isEmpty(user.getCountryOfOrigin())) {
				userUpdatedEntity.setCountryOfOrigin(user.getCountryOfOrigin());
			}
			if(!StringUtils.isEmpty(user.getLastDegree())) {
				userUpdatedEntity.setLastDegree(user.getLastDegree());
			}
			if(!StringUtils.isEmpty(user.getYearOfCompletion())) {
				userUpdatedEntity.setYearOfCompletion(user.getYearOfCompletion());
			}
			if(!StringUtils.isEmpty(user.getCurrentDegree())) {
				userUpdatedEntity.setCurrentDegree(user.getCurrentDegree());
			}
			if(!StringUtils.isEmpty(user.getExpectedYearOfCompletion())) {
				userUpdatedEntity.setExpectedYearOfCompletion(user.getExpectedYearOfCompletion());
			}
			if(!StringUtils.isEmpty(user.getCareerInterest())) {
				userUpdatedEntity.setCareerInterest(user.getCareerInterest());
			}
			if(!StringUtils.isEmpty(user.getInterestInCareerAbroad())) {
				userUpdatedEntity.setInterestInCareerAbroad(user.getInterestInCareerAbroad());
			}
			if(!StringUtils.isEmpty(user.getPersueCountry1())) {
				userUpdatedEntity.setPersueCountry1(user.getPersueCountry1());
			}
			if(!StringUtils.isEmpty(user.getPersueCountry2())) {
				userUpdatedEntity.setPersueCountry2(user.getPersueCountry2());
			}
			if(!StringUtils.isEmpty(user.getPersueCountry3())) {
				userUpdatedEntity.setPersueCountry3(user.getPersueCountry3());
			}
			if(!StringUtils.isEmpty(user.getTopicsPhdSub1())) {
				userUpdatedEntity.setTopicsPhdSub1(user.getTopicsPhdSub1());
			}
			if(!StringUtils.isEmpty(user.getTopicsPhdSub2())) {
				userUpdatedEntity.setTopicsPhdSub2(user.getTopicsPhdSub2());
			}
			if(!StringUtils.isEmpty(user.getTopicsPhdSub3())) {
				userUpdatedEntity.setTopicsPhdSub3(user.getTopicsPhdSub3());
			}
			if(!StringUtils.isEmpty(user.getResearchGate())) {
				userUpdatedEntity.setResearchGate(user.getResearchGate());
			}
			if(!StringUtils.isEmpty(user.getLinkedInProfile())) {
				userUpdatedEntity.setLinkedInProfile(user.getLinkedInProfile());
			}
			if(!StringUtils.isEmpty(user.getProfessionalInterest())) {
				userUpdatedEntity.setProfessionalInterest(user.getProfessionalInterest());
			}
			userUpdatedEntity.setUpdatedTimeStamp(LocalDate.now());
			userUpdatedEntity.setUpdatedBy("System");
			
			userCreateDao.save(userUpdatedEntity);
			System.out.println("User has been successfully updated");
			
		}
		
		return mapUserToDto(user);
	}

	@Override
	public UserCreateDto deleteUser(UserDto user) {
		
		UserEntity userEntity = userCreateDao.findByEmailAddress(user.getEmailAddress());
		
		if(userEntity != null) {
			userCreateDao.delete(userEntity);
			System.out.println("User has been successfully deleted");
		} else {
			System.out.println("User is not present in System");
		}
		
		return mapUserToDto(user);
	}

	@Override
	public UserCreateDto loginUser(UserLoginDto userLogin) {
		
		UserEntity userEntity = userCreateDao.findByEmailAddress(userLogin.getEmailAddress());
		if(userEntity != null) {
			System.out.println("User Found Successfully");
			if(userLogin.getPassword().equalsIgnoreCase(userEntity.getPassword())) {
				System.out.println("User credentials are valid");
				return mapUserLoginToDto(userLogin, true);
			} else {
				System.out.println("User credentials are not valid");
				return mapUserLoginToDto(userLogin, false);
			}
			
		}
		return null;
		
	}

	private UserCreateDto mapUserLoginToDto(UserLoginDto userLogin, boolean successParameter) {
		
		
		
		return null;
	}



}
