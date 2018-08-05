package com.supergroup.videostore.repo;

import org.springframework.data.repository.CrudRepository;

import com.supergroup.videostore.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	public User findByUsernameAndPassword(String username, String password);

}
