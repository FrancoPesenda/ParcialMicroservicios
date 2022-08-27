package com.dh.catalogservice.domain.model.dto;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data @Builder
public class Catalog {
    private String genre;
    private List<Movie> movies;

    public Catalog(String genre, List<Movie> movies) {
        this.genre = genre;
        this.movies = movies;
    }
}
