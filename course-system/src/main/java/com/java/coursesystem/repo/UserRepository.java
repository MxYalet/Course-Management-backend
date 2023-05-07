package com.java.coursesystem.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.java.coursesystem.model.User;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long>{
	
    Optional<User> findOneByNameAndPassword(String name, String password);
    
    User findByName(String name);
}
