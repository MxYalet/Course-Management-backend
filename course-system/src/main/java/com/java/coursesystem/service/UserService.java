package com.java.coursesystem.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.java.coursesystem.dto.UserDto;
import com.java.coursesystem.dto.UserLoginDto;
import com.java.coursesystem.model.User;
import com.java.coursesystem.response.LoginResponse;



public interface UserService extends UserDetailsService{
	User save(UserDto userDto);
	LoginResponse loginUser(UserLoginDto loginDto);

}
