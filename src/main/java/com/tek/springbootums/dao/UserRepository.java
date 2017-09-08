package com.tek.springbootums.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tek.springbootums.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String username);

}
