package be.vdab.controller;

import be.vdab.repository.ActorRepository;
import be.vdab.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class FilmController {
    @Autowired
    ActorRepository actorRepository;
    @Autowired
    MovieRepository movieRepository;

    @RequestMapping("/index.html")
    public String Home() {
        return "home";
    }

    @RequestMapping("/movies")
    public String movies(Map<String, Object> model) {
        model.put("movies", movieRepository.findAll());
        return "movie/list";
    }

    @RequestMapping("/detail")
    public String movie(Map<String, Object> model, @RequestParam("id") Integer movieId) {
        model.put("movie", movieRepository.findOne((movieId)));
        return "movie/detail";
    }

    @RequestMapping("/rating")
    public String movieRating(Map<String, Object> model, @RequestParam("id") Integer movieId) {
        model.put("movie", movieRepository.findOne((movieId)));
        model.put("movies", movieRepository.findAll());
        return "movie/ratingForm";
    }

    @RequestMapping("/")
    public String redirect() {
        return "redirect:/movies";
    }

    @RequestMapping("rating_done")
    public String thankYou() {
        return "movie/ratingDone";
    }





//    @RequestMapping("/actor")
//    public String actor() {
//        return "movie/list";
//    }
//
//    @RequestMapping("/form")
//    public String form(Map<String, Object> model, @RequestParam("id") int filmId) {
//        model.put("film", filmRepository.findOne(filmId));
//        return "film/form";
//    }

//    @RequestMapping(value="/create", method = RequestMethod.POST)
//    public String create(Film film) {
//        filmRepository.save(film);
//        return "redirect:/films";
//    }

}
