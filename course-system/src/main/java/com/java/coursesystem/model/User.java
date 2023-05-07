package com.java.coursesystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

	@Entity
	@Table(name =  "_user", uniqueConstraints = @UniqueConstraint(columnNames = "user_email"))
	public class User{
		
		@Id
		@GeneratedValue(strategy =  GenerationType.AUTO)
		private Long id;
		
		@Column(name = "user_name")
		private String name;
		
		@Column(name = "user_email")
		private String email;
		
		@Column(name = "user_role")
		private String role;
		
		@Column(name= "user_password")
		private String password;

		
		
		public User() {
			
		}
		
		public User(Long id, String name, String email, String password, String role) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.password = password;
			this.role = role;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
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
		public String getRoles() {
			return role;
		}


		public void setRole(String role) {
			this.role = role;
		}
}

