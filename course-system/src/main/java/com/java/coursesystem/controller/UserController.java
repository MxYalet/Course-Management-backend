package com.java.coursesystem.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.coursesystem.dto.UserDto;
import com.java.coursesystem.dto.UserLoginDto;
import com.java.coursesystem.response.LoginResponse;
import com.java.coursesystem.service.UserService;



@RestController
public class UserController {
	
	private UserService userService;

	

	@PostMapping("/register")
	public String registerUser(@RequestBody UserDto userDto) {
		 userService.save(userDto);
		return userDto.getName();
	}
	

}
