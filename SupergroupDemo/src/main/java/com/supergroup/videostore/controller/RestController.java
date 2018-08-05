package com.supergroup.videostore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.supergroup.videostore.model.Movie;
import com.supergroup.videostore.model.User;
import com.supergroup.videostore.services.MovieService;
import com.supergroup.videostore.services.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private MovieService movieService;

	@GetMapping("/")
	public String start() {
		return "This is the Start Page";
	}

	@GetMapping("/save_user")
	public String saveUserToDB(@RequestParam String username, @RequestParam String firstname,
			@RequestParam String lastname, @RequestParam String password) {

		User user = new User(username, firstname, lastname, password);
		userService.saveUserData(user);
		
		return "New User Saved to Database";

	}

	@GetMapping("/add_movie")
	public String addMovieDetailsToDB(@RequestParam String moviename, @RequestParam String movietype, @RequestParam String moviedescription) {

		Movie movie = new Movie(moviename, movietype, moviedescription);
		movieService.saveMovieData(movie);
		
		return "New Movie details Saved to database ";

	}
	
}
