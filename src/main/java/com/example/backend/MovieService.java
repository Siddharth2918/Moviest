package com.example.backend;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;
    public List<Movie> findAllMovies(){
        // System.out.p                                                                                                                                                                                                             rintln(repository.findAll());
        return repository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return repository.findMovieByImdbId(imdbId);
    }
}
