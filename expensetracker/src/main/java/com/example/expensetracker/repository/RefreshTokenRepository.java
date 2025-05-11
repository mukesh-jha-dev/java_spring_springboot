package com.example.expensetracker.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.expensetracker.entities.RefreshToken;

public interface RefreshTokenRepository extends CrudRepository<RefreshToken, Integer>{
	
	Optional<RefreshToken> findByToken(String token);
}
