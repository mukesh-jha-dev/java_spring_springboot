package com.example.expensetracker.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.expensetracker.entities.UserInfo;

public interface UserRepository extends CrudRepository<UserInfo, Long>{
	
	public UserInfo findByUsername(String username);

}
