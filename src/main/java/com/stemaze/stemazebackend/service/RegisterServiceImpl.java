package com.stemaze.stemazebackend.service;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.stemaze.stemazebackend.dao.UserCreateDao;
import com.stemaze.stemazebackend.dto.UserCreateDto;
import com.stemaze.stemazebackend.dto.UserDto;
import com.stemaze.stemazebackend.dto.UserLoginDto;
import com.stemaze.stemazebackend.entity.UserEntity;
import com.stemaze.stemazebackend.util.UserSearchSpecification;

import io.micrometer.common.util.StringUtils;

@Service
public class RegisterServiceImpl implements RegisterService {
	
	private static final Logger logger = LoggerFactory.getLogger(AppointmentRegisterServiceImpl.class);
	
	@Autowired
	UserCreateDao userCreateDao;
	
	@Autowired
	UserSearchSpecification searchSpecification;
	

	@Override
	public UserCreateDto createUser(UserDto user) {
		if (user.getName() != null) {
			UserEntity userCreateDTO = userCreateDao.findByEmailAddress(user.getEmailAddress());
			if (userCreateDTO == null) {
				UserEntity userEntity = new UserEntity();
				if(!StringUtils.isEmpty(user.getName())) {
					userEntity.setName(user.getName());
				}
				if(!StringUtils.isEmpty(user.getPassword())) {
					userEntity.setPassword(user.getPassword());
				}
				if(!StringUtils.isEmpty(user.getEmailAddress())) {
					userEntity.setEmailAddress(user.getEmailAddress());
				}
				if(!StringUtils.isEmpty(user.getEmailAddress())) {
					String kiitStudentEmailDomain = "kiitbiotech.ac.in";
					String currentStudentEmailAddress = user.getEmailAddress();
					String currentStudentEmailDomain = currentStudentEmailAddress.substring(currentStudentEmailAddress.length() - 17);
					if(kiitStudentEmailDomain.equalsIgnoreCase(currentStudentEmailDomain)) {
						userEntity.setIsKiitStudent("Yes");
					} else {
						userEntity.setIsKiitStudent("No");
					}
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
				logger.info("User has been successfully registered");
				return mapUserToDto(user);
			} else {
				logger.info("UserId is already present");
			}
		}
		logger.info("UserId is already present");
		return null;
	}

	private UserCreateDto mapUserToDto(UserDto user) {
		UserEntity userEntity = userCreateDao.findByEmailAddress(user.getEmailAddress());
		UserCreateDto myNewUser = mapEntitytoDto(userEntity);
		return myNewUser;
	}

	/**
	 * @param user
	 * @param userEntity
	 * @param myNewUser
	 */
	public UserCreateDto  mapEntitytoDto(UserEntity userEntity) {
		UserCreateDto myNewUser = new UserCreateDto();
		if(userEntity != null) {
			
			if(userEntity.getName() != null) {
				myNewUser.setName(userEntity.getName());
			}
			if(userEntity.getPassword() != null) {
				myNewUser.setPassword(userEntity.getPassword());
			}
			if(userEntity.getEmailAddress() != null) {
				myNewUser.setEmailAddress(userEntity.getEmailAddress());
			}
			if(userEntity.getPhoneNumbr() != null) {
				myNewUser.setPhoneNumbr(userEntity.getPhoneNumbr());
			}
			if(userEntity.getCountryOfOrigin() != null) {
				myNewUser.setCountryOfOrigin(userEntity.getCountryOfOrigin());
			}
			if(userEntity.getLastDegree() != null) {
				myNewUser.setLastDegree(userEntity.getLastDegree());
			}
			if(userEntity.getYearOfCompletion() != null) {
				myNewUser.setYearOfCompletion(userEntity.getYearOfCompletion());
			}
			if(userEntity.getCurrentDegree() != null) {
				myNewUser.setCurrentDegree(userEntity.getCurrentDegree());
			}
			if(userEntity.getExpectedYearOfCompletion() != null) {
				myNewUser.setExpectedYearOfCompletion(userEntity.getExpectedYearOfCompletion());
			}
			if(userEntity.getCareerInterest() != null) {
				myNewUser.setCareerInterest(userEntity.getCareerInterest());
			}
			if(userEntity.getInterestInCareerAbroad() != null) {
				myNewUser.setInterestInCareerAbroad(userEntity.getInterestInCareerAbroad());
			}
			if(userEntity.getPersueCountry1() != null) {
				myNewUser.setPersueCountry1(userEntity.getPersueCountry1());
			}
			if(userEntity.getPersueCountry2() != null) {
				myNewUser.setPersueCountry2(userEntity.getPersueCountry2());
			}
			if(userEntity.getPersueCountry3() != null) {
				myNewUser.setPersueCountry3(userEntity.getPersueCountry3());
			}
			if(userEntity.getTopicsPhdSub1() != null) {
				myNewUser.setTopicsPhdSub1(userEntity.getTopicsPhdSub1());
			}
			if(userEntity.getTopicsPhdSub2() != null) {
				myNewUser.setTopicsPhdSub2(userEntity.getTopicsPhdSub2());
			}
			if(userEntity.getTopicsPhdSub3() != null) {
				myNewUser.setTopicsPhdSub3(userEntity.getTopicsPhdSub3());
			}
			if(userEntity.getResearchGate() != null) {
				myNewUser.setResearchGate(userEntity.getResearchGate());
			}
			if(userEntity.getLinkedInProfile() != null) {
				myNewUser.setLinkedInProfile(userEntity.getLinkedInProfile());
			}
			if(userEntity.getProfessionalInterest() != null) {
				myNewUser.setProfessionalInterest(userEntity.getProfessionalInterest());
			}
			if(userEntity.getIsKiitStudent() != null) {
				myNewUser.setIsKiitStudent(userEntity.getIsKiitStudent());
			}
		}
		return myNewUser;
	}

	@Override
	public UserCreateDto updateUser(UserDto user) {
		
		UserEntity userEntity = userCreateDao.findByEmailAddress(user.getEmailAddress());
		if(userEntity != null) {
//			UserEntity userUpdatedEntity = new UserEntity();
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
			userEntity.setUpdatedTimeStamp(LocalDate.now());
			userEntity.setUpdatedBy("System");
			
			userCreateDao.save(userEntity);
			logger.info("User has been successfully updated");
			
		}
		
		return mapUserToDto(user);
	}

	@Override
	public UserCreateDto deleteUser(UserDto user) {
		
		UserEntity userEntity = userCreateDao.findByEmailAddress(user.getEmailAddress());
		
		if(userEntity != null) {
			userCreateDao.delete(userEntity);
			logger.info("User has been successfully deleted");
		} else {
			logger.info("User is not present in System");
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
		
		if(successParameter) {
			
		} else {
			
		}
		
		return null;
	}

	@Override
	public UserCreateDto getUser(String id) {
		UserEntity userEntity = userCreateDao.findByUserId(Integer.valueOf(id));
		UserCreateDto userDto = new UserCreateDto();
		if(userEntity != null) {
			userDto = mapExistingUserEntitytoDto(userEntity);
		}
		return userDto;
	}

	private UserCreateDto mapExistingUserEntitytoDto(UserEntity userEntity) {
		UserCreateDto userCreateDto = new UserCreateDto();
		userCreateDto = mapEntitytoDto(userEntity);
		return userCreateDto;
	}

	@Override
	public UserCreateDto searchUser(UserDto user) {
		UserCreateDto searchedUser = new UserCreateDto();
		Specification<UserEntity> spec = searchSpecification.getSearchSpec(user);
		UserEntity userEntity = userCreateDao.findAll(spec);
		if(userEntity != null) {
			searchedUser = mapExistingUserEntitytoDto(userEntity);
		}
		return searchedUser;
	}



}
