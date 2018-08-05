package com.supergroup.videostore.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.supergroup.videostore.model.Movie;
import com.supergroup.videostore.repo.MovieRepository;

@Service
@Transactional
public class MovieService {
	
	private final MovieRepository movieRep;
	
	public MovieService(MovieRepository movieRep ) {
		
		this.movieRep = movieRep;
	}

	public void saveMovieData(Movie movie) {
		movieRep.save(movie);
	}
	
	
	public List<Movie> displayAllMovies(){
		List<Movie> movies = new ArrayList<Movie>();
		for (Movie movie:movieRep.findAll()) {
			movies.add(movie);
		}
		return movies;
	}
	
	public void deleteMoive(int id) {
		movieRep.deleteById(id);
	}
	
	public Movie editMovie(int id) {
		return movieRep.findById(id).orElse(null);
	}

}
