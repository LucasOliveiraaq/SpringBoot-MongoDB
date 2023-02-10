package com.lucas.springBootMongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.springBootMongo.domain.Post;
import com.lucas.springBootMongo.domain.User;
import com.lucas.springBootMongo.dto.UserDTO;
import com.lucas.springBootMongo.repository.PostRepository;
import com.lucas.springBootMongo.repository.UserRepository;
import com.lucas.springBootMongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired 
	private PostRepository postRepository;
	
	public Post findById(String id) {
		Optional<Post> obj = postRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text){
		return postRepository.searchTitle(text);
	}
}
