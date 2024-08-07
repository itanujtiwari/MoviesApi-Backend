package com.tanujtiwari.movieApi.repositories;

import com.tanujtiwari.movieApi.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepsitory extends JpaRepository<Movie, Integer> {
}
