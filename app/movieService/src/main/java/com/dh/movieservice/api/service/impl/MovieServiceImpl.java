package com.dh.movieservice.api.service.impl;

import com.dh.movieservice.api.service.MovieService;
import com.dh.movieservice.domain.model.Movie;
import com.dh.movieservice.domain.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

	private MovieRepository repository;

	@Autowired
	public MovieServiceImpl(MovieRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Movie> getListByGenre(String genre) {
		return repository.findAllByGenre(genre);
	}

	@Override
	public Movie save(Movie movie) {
		return repository.save(movie);
	}
}
