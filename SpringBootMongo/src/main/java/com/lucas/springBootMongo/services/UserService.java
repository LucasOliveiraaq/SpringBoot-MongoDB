package com.lucas.springBootMongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.springBootMongo.domain.User;
import com.lucas.springBootMongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired 
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
}
