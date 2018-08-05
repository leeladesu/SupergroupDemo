package com.supergroup.videostore.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.supergroup.videostore.model.Movie;
import com.supergroup.videostore.model.User;
import com.supergroup.videostore.services.MovieService;
import com.supergroup.videostore.services.UserService;

@Controller
public class ApplicationController {
	
	@Autowired
	public MovieService movieService;
	
	@Autowired
	public UserService userService;
	
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	
	@RequestMapping("/login_user")
	public String loginPage(@ModelAttribute User user, HttpServletRequest request) {
		if(userService.findByUsernameAndPassword(user.getUsername(), user.getPassword()) !=null ) {
			return "welcomepage";
		}else {
			request.setAttribute("error", "Invalid username or password");
			return "login";
		}
	}

	@RequestMapping("/addMovie")
	public String SaveMovie() {
		return "addMovie";
	}

	@PostMapping("/savemovie")
	public String SaveMovieToDB(@ModelAttribute Movie movie,BindingResult result, HttpServletRequest request ) {
		movieService.saveMovieData(movie);
		request.setAttribute("success", "New movie data added successfully");
		return "welcomepage";
	}
	
	@RequestMapping("/listmovies")
	public String displayMovies(HttpServletRequest request){
		request.setAttribute("movies", movieService.displayAllMovies());
		return "listmovies";
	}

	@RequestMapping("/delete-movie")
	public String deleteSelectedMovie(@RequestParam int id, HttpServletRequest request) {
		
		movieService.deleteMoive(id);
		request.setAttribute("success", "selected movie was deleted successfully");
		request.setAttribute("movies", movieService.displayAllMovies());
		return "listmovies";
	}

	
	@RequestMapping("/edit-movie")
	public String editSelectedMovie(@RequestParam int id, HttpServletRequest request) {
		request.setAttribute("movie", movieService.editMovie(id));
		request.setAttribute("success", "selected movie was edited successfully");
		return "editmovie";
	}
	
}
