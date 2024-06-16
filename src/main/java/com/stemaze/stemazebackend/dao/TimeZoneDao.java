package com.stemaze.stemazebackend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stemaze.stemazebackend.entity.TimeZoneEntity;

public interface TimeZoneDao extends JpaRepository<TimeZoneEntity, Integer>{
	
	@Query(value = "Select tmz.id, tmz.zone from stemaze.timezonetable tmz", nativeQuery = true)
	List<Object[]> getListTimeZone();

}
