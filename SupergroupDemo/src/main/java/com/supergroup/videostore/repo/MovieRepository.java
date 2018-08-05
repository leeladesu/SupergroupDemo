package com.supergroup.videostore.repo;

import org.springframework.data.repository.CrudRepository;

import com.supergroup.videostore.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
