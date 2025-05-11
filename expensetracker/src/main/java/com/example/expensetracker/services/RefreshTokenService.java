package com.example.expensetracker.services;

import java.time.Instant;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expensetracker.entities.RefreshToken;
import com.example.expensetracker.entities.UserInfo;
import com.example.expensetracker.repository.RefreshTokenRepository;
import com.example.expensetracker.repository.UserRepository;


@Service
public class RefreshTokenService {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	RefreshTokenRepository refreshTokenRepository;
	
	public RefreshToken createRefreshToken(String username) {
		UserInfo userInfo = userRepository.findByUsername(username);
		RefreshToken refreshToken = RefreshToken.builder().userInfo(userInfo).token(UUID.randomUUID().toString())
		.expiryDate(Instant.now().plusMillis(600000))
		.build();
		return refreshTokenRepository.save(refreshToken);
	}
	
	public RefreshToken verifyExpiration(RefreshToken token) {
		if(token.getExpiryDate().compareTo(Instant.now())<0) {
			throw new RuntimeException(token.getToken()+ "Refresh Toke is Expired. Please make a new LogIn");
		}
		return token;
	}

}
