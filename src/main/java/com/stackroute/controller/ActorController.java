package com.stackroute.controller;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import com.stackroute.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

//@RestController annotation in a Spring application to build a Restful controller.
@RestController
//RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods.
@RequestMapping(value = "api/v1")
public class ActorController {
  private MovieService movieService;

  @Autowired
  private ActorController(MovieService movieService) {
    this.movieService = movieService;
  }

  //get all actors
  @GetMapping(value = "/actors")
  public Collection<Actor> getAllActor() {
    return movieService.getAllActor();
  }

  //get all movies
  @GetMapping(value = "/movies")
  public Iterable<Movie> getAllMovie() {
    return movieService.getAllMovie();
  }

  //post the actor properties
  @PostMapping(value = "/actor")
  public Actor saveActor(@RequestBody Actor actor) {
    return movieService.saveActor(actor);
  }

  //update the actor properties
  @PutMapping(value = "/actor")
  public Actor updateActor(@RequestBody Actor actor) {
    return movieService.updateActorById(actor);
  }

  //post the movie properties
  @PostMapping(value = "/movie")
  public Movie saveMovie(@RequestBody Movie movie) {
    return movieService.saveMovie(movie);
  }

  //update the movie properties
  @PutMapping(value = "/movie")
  public Movie updateMovie(@RequestBody Movie movie) {
    return movieService.updateMovieById(movie);
  }

  //delete the actor
  @DeleteMapping(value = "/actor")
  public Actor deleteActor(@RequestBody Actor actor) {
    return movieService.deleteActorById(actor);
  }

  //delete the movie
  @DeleteMapping(value = "/movie")
  public Movie deleteMovie(@RequestBody Movie movie) {
    return movieService.deleteMovieById(movie);
  }


}
