package com.stemaze.stemazebackend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stemaze.stemazebackend.entity.IsApprovedUniversityEntity;

public interface ApprovedUniversityDao extends JpaRepository<IsApprovedUniversityEntity, Integer>{
	
	@Query(value = "Select ins.id, ins.is_approved_university from stemaze.isApprovedInstitute ins", nativeQuery = true)
	List<Object[]> getIsApprovedUniversity();
	

}
