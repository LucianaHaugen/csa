package com.sigmatechnology.csa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sigmatechnology.csa.entity.User;


public interface UserRepository extends CrudRepository<User, Long>{
	
	public List<Boolean> findByIsApproved(Boolean isApproved);
	

}
