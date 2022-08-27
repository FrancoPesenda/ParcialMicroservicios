package com.dh.catalogservice.api.service.impl;

import com.dh.catalogservice.api.service.CatalogService;
import com.dh.catalogservice.api.service.feign.MovieFeignClient;
import com.dh.catalogservice.domain.model.dto.Catalog;
import com.dh.catalogservice.domain.model.dto.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

	private MovieFeignClient movieFeignClient;

	@Autowired
	public CatalogServiceImpl(MovieFeignClient movieFeignClient) {
		this.movieFeignClient = movieFeignClient;
	}

	//buscar catalogo por genero
	@Override
	public Catalog findCatalogByGenre(String genre){
		ResponseEntity<List<Movie>> movieResponse = movieFeignClient.findMovieByGenre(genre);
		return new Catalog(genre, movieResponse.getBody());
	}
}
