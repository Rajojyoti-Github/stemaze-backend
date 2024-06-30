package com.stemaze.stemazebackend.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.util.Predicates;
import org.springframework.stereotype.Service;

import com.stemaze.stemazebackend.dto.AppointmentRequestRegisterDto;
import com.stemaze.stemazebackend.entity.ClassBookingEntity;

import io.micrometer.common.util.StringUtils;
import jakarta.persistence.criteria.Predicate;

@Service
public class AppointmentSearchSpecification {

	public Specification<ClassBookingEntity> getSearchSpec(AppointmentRequestRegisterDto dto) {
		
		return(root, query, cb) ->{
			List<Predicate> predicate = new ArrayList<Predicate>();
			
			if(!StringUtils.isEmpty(dto.getUserName())) {
				predicate.add(cb.equal(root.get(Constants.USER_NAME), dto.getUserName()));
			}
			if(!StringUtils.isEmpty(dto.getUserMobileNumber())) {
				predicate.add(cb.equal(root.get(Constants.USER_MOBILE_NUMBER), dto.getUserMobileNumber()));
			}
			if(!StringUtils.isEmpty(dto.getMentorName())) {
				predicate.add(cb.equal(root.get(Constants.MENTOR_NAME), dto.getMentorName()));
			}
			if(!StringUtils.isEmpty(dto.getMentorMobileNumber())) {
				predicate.add(cb.equal(root.get(Constants.MENTOR_MOBILE_NUMBER), dto.getMentorMobileNumber()));
			}
			return cb.and(predicate.toArray(new Predicate[0]));
		};
	}

}
