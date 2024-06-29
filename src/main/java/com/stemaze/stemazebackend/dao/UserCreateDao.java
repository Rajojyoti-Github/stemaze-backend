package com.stemaze.stemazebackend.dao;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stemaze.stemazebackend.entity.UserEntity;

@Repository
public interface UserCreateDao extends JpaRepository<UserEntity, Integer> {

	@Query(value = "Select * from stemaze.user u where u.email_address = :emailAddress", nativeQuery = true)
	UserEntity findByEmailAddress(@Param("emailAddress") String emailAddress);
	
	@Query(value = "Select * from stemaze.user u where u.id = :id", nativeQuery = true)
	UserEntity findByUserId(@Param ("id") Integer id);

	List<UserEntity> findAll(Specification<UserEntity> spec);

}
