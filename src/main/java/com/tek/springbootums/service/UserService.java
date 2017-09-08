package com.tek.springbootums.service;

import java.util.List;

import com.tek.springbootums.model.User;

public interface UserService {

	User findById(long id);

	User findByName(String name);

	User saveOrUpdateUser(User user);

	void deleteUserById(long id);

	List<User> findAllUsers();

	void deleteAllUsers();

	public boolean isUserExist(User user);

}
