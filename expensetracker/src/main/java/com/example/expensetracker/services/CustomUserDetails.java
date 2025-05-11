package com.example.expensetracker.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.expensetracker.entities.UserInfo;
import com.example.expensetracker.entities.UserRole;

public class CustomUserDetails extends UserInfo implements UserDetails{
	
	private String userName;
	private String password;
	Collection<? extends GrantedAuthority> authorities;
	
	public CustomUserDetails(UserInfo userInfo) {
		this.userName=userInfo.getUsername();
		this.password=userInfo.getPssword();
		List<GrantedAuthority> auths=new ArrayList<>();
		for(UserRole role:userInfo.getRoles()) {
			auths.add(new SimpleGrantedAuthority(role.getName().toUpperCase()));
		}
		this.authorities=auths;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
	@Override
	public String getPassword() {
		return password;
	} 
	
	@Override
	public String getUsername() {
		return userName;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	

}
