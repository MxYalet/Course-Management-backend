package com.java.coursesystem.dto;

public class UserDto {
	private String name;
	private String role;
	private String email;
	private String password;
	
	
	public UserDto() {
		
	}
	

	public UserDto(String name, String role, String email, String password) {
		super();
		this.name = name;
		this.role = role;
		this.email = email;
		this.password = password;
	}


	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

