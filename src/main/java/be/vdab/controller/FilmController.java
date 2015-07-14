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

    @RequestMapping("/index")
    public String Home() {
        return "home";
    }

    @RequestMapping("/movies")
    public String films(Map<String, Object> model) {
        model.put("movies", movieRepository.findAll());
        return "movie/list";
    }




//    @RequestMapping("/actor")
//    public String actor() {
//        return "movie/list";
//    }

//    @RequestMapping("/film")
//    public String film(Map<String, Object> model, @RequestParam("id") int filmId) {
//        model.put("film", filmRepository.findOne(filmId));
//        return "film/detail";
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
