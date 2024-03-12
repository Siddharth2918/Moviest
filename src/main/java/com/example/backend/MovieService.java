package com.example.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;
    public List<Movie> findAllMovies(){
        // System.out.println(repository.findAll());
        return repository.findAll();
    }
}
