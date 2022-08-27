package com.dh.movieservice.domain.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@Table(name = "movies")
@FieldDefaults( level = AccessLevel.PRIVATE)
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String name;
	String genre;
	String urlStream;
}
