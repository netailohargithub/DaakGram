package com.daakgram.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daakgram.entities.User;
public interface UserRepository 

	extends JpaRepository<User, Long>{

		User findByUsername(String username);

		User findByEmail(String email);
}
