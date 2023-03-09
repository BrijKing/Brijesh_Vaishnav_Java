package com.example.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.datajpa.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, String> {

}
