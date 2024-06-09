package com.stemaze.stemazebackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stemaze.stemazebackend.entity.ClassBookingEntity;

@Repository
public interface AppointmentDao extends JpaRepository<ClassBookingEntity, Integer> {

	@Query(value = "Select * from stemaze.classbooking u where u.user_mobile_number = :userMobileNumber", nativeQuery = true)
	ClassBookingEntity getByMobileNumber(@Param("userMobileNumber") String userMobileNumber);
	
	

}
