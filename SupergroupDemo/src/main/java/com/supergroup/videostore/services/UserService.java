package com.supergroup.videostore.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.supergroup.videostore.model.User;
import com.supergroup.videostore.repo.UserRepository;

@Service
@Transactional
public class UserService {
	private final UserRepository userRepo;
	
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	public void saveUserData(User user) {
		userRepo.save(user);
	}

	public User findByUsernameAndPassword(String username, String password) {
		
		return userRepo.findByUsernameAndPassword(username, password);
	} 
}
