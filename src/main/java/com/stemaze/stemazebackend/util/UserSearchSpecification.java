package com.stemaze.stemazebackend.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.stemaze.stemazebackend.dto.UserDto;
import com.stemaze.stemazebackend.entity.UserEntity;

import io.micrometer.common.util.StringUtils;
import jakarta.persistence.criteria.Predicate;

public class UserSearchSpecification {
	
	private UserSearchSpecification() {
	}

	public Specification<UserEntity> getSearchSpec(UserDto user) {
		// TODO Auto-generated method stub
		
		return (root, query, cb) -> {
			List<Predicate> predicates = new ArrayList<Predicate>();
			
			if(!StringUtils.isEmpty(user.getName())) {
				predicates.add(cb.equal(root.get(Constants.NAME), user.getName()));
			}
			if(StringUtils.isEmpty(user.getEmailAddress())) {
				predicates.add(cb.equal(root.get(Constants.EMAIL_ADDRESS), user.getEmailAddress()));
			}
			if(StringUtils.isEmpty(user.getPhoneNumbr())) {
				predicates.add(cb.equal(root.get(Constants.PHONE_NUMBER), user.getPhoneNumbr()));
			}
			return cb.and(predicates.toArray(new Predicate[0]));
			
			
		};
	}

}
