package com.supergroup.videostore.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {
	@Id
	private int id;
	private String moviename;
	private String movietype;
	private String moviedescription;
	
	public Movie() {
	
	}
	
	public Movie(String moviename, String movietype, String moviedescription) {
		super();
		this.moviename = moviename;
		this.movietype = movietype;
		this.moviedescription = moviedescription;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getMovietype() {
		return movietype;
	}
	public void setMovietype(String movietype) {
		this.movietype = movietype;
	}
	public String getMoviedescription() {
		return moviedescription;
	}
	public void setMoviedescription(String moviedescription) {
		this.moviedescription = moviedescription;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", moviename=" + moviename + ", movietype=" + movietype + ", moviedescription="
				+ moviedescription + "]";
	}
	
	

}
