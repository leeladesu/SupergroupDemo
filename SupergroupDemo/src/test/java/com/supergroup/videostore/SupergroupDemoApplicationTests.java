package com.supergroup.videostore;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import java.util.logging.Logger;
import com.supergroup.videostore.model.Movie;
import com.supergroup.videostore.model.User;
import com.supergroup.videostore.services.MovieService;
import com.supergroup.videostore.services.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SupergroupDemoApplicationTests {

	private final static Logger LOGGER = Logger.getLogger(SupergroupDemoApplicationTests.class.getName());

	@Test
	public void contextLoads() {
	}

	@Autowired
	public MovieService movieService;
	
	@Autowired
	public UserService userService;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
 
	private MockMvc mockMvc;
 
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void TestSaveUserToDB() {
		
		try {
			mockMvc.perform(post("/save_user"))
			.andExpect(content().contentType("application/json;charset=UTF-8"))
			.andExpect(jsonPath("$.username").value("John"))
			.andExpect(jsonPath("$.firstname").value("paul"))
			.andExpect(jsonPath("$.lastname").value("test"))
			.andExpect(jsonPath("$.password").value("john"))
			.andExpect(status().isOk());
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void TestEditMovie() {
		movieService.editMovie(2);
		LOGGER.info("movie edited Succesfully :");
	}
	
	@Test
	public void TestDeleteMovie() {
		movieService.deleteMoive(2);
		LOGGER.info("movie deleted :");
		
	}
	
	@Test
	public void TestListMovies() {
		List<Movie> movie = movieService.displayAllMovies();
		LOGGER.info("movie List :" + movie.size());
	}
	
	@Test
	public void TestAddMovie() {
		Movie movie = new Movie("Spiderman", "fantasy", "Nice to watch");
		movieService.saveMovieData(movie);
		LOGGER.info("movie Added :");
	}
	
}
