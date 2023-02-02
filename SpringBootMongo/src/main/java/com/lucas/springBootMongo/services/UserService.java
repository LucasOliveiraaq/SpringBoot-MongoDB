package com.lucas.springBootMongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.springBootMongo.domain.User;
import com.lucas.springBootMongo.repository.UserRepository;
import com.lucas.springBootMongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired 
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
