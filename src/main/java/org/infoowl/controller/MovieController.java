package org.infoowl.controller;


import org.infoowl.domain.Movie;
import org.infoowl.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Created by caneraydin on 15.03.2016.
 */


@RestController
@RequestMapping(value = "/movies")
@CrossOrigin(value = "http://localhost:63342", maxAge = 3600)
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;
    private Movie movie;

    @RequestMapping("/home")
    public String home(){
        System.out.println("moviecontroller homeda");
        return "index";
    }

    @RequestMapping(value = "/add/{name}/{actor}", method = RequestMethod.POST)
    public HashMap<Movie, Long> add(@PathVariable String name, @PathVariable String actor){
        System.out.println("moviecontroller addeda");
        //Movie movie = new Movie("Scarface","AlPacino");
     movie = new Movie(name,actor);
        movieRepository.save(movie);
        HashMap<Movie,Long> hash = new HashMap<Movie,Long> ();
        return hash;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public HashMap<Movie, Long> delete(@PathVariable Long id ){
        System.out.println("moviecontroller deleteda");
        movieRepository.delete(id);
        HashMap<Movie,Long> hash = new HashMap<Movie,Long> ();
        return hash;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Iterable<Movie> list() {
        System.out.println("moviecontroller listed");

        return movieRepository.findAll();
    }




    @RequestMapping(value = "/edit/{id}/{name}/{actor}", method = RequestMethod.PUT)
    public HashMap<Movie, Long> edit(@PathVariable Long id, @PathVariable String name, @PathVariable String actor){
        System.out.println("moviecontroller editeda");
        movieRepository.delete(id);
        movie = new Movie(name,actor);
        movieRepository.save(movie);
        HashMap<Movie,Long> hash = new HashMap<Movie,Long> ();
        return hash;
    }
    @RequestMapping(method = RequestMethod.GET)
    public String getIndexPage() {
        return "UserManagement";
    }


}