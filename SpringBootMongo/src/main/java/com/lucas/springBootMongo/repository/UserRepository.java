package com.lucas.springBootMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucas.springBootMongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
}
