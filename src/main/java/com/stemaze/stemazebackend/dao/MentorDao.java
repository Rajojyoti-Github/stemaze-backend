package com.stemaze.stemazebackend.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stemaze.stemazebackend.entity.MentorEntity;

public interface MentorDao extends JpaRepository<MentorEntity, Integer>{

	@Query(value = "select * from stemaze.mentor m", nativeQuery = true)
	List<MentorEntity> getListOfMentor();

	

	
	

}
