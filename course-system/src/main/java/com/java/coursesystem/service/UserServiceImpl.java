 package com.java.coursesystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.java.coursesystem.dto.UserDto;
import com.java.coursesystem.dto.UserLoginDto;
import com.java.coursesystem.model.User;
import com.java.coursesystem.repo.UserRepository;
import com.java.coursesystem.response.LoginResponse;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public User save(UserDto userDto) {
		
		User user = new User(
				null, userDto.getName(), 
				 userDto.getEmail(),
				 userDto.getRole(),
				passwordEncoder.encode(userDto.getPassword()));
		
		 return userRepository.save(user);
	
	}

	public LoginResponse loginUser(UserLoginDto loginDto) {
		 
        User user1 = userRepository.findByName(loginDto.getName());
        if (user1!= null) {
            String password = loginDto.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = userRepository.findOneByNameAndPassword(loginDto.getName(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
 
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("User does not exits", false);
        }

	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}



	





}

