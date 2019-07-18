package com.hand.exam1.controller;

import com.hand.exam1.pojo.Film;
import com.hand.exam1.service.IFilmService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @RequestMapping("/")
    public String insert(){
        System.out.println("Context Start");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IFilmService filmService = ac.getBean("filmService",IFilmService.class);
        Film film = new Film();
        film.setTitle("Title");
        film.setDescription("Description");
        film.setReleaseYear("0000");
        film.setLanguageId(1);
        film.setOriginalLanguageId(1);
        film.setRentalDuration(1);
        film.setRentalRate(1.1);
        film.setLength(1);
        film.setReplacementCost(1.1);
        film.setRating("G");
        film.setSpecialFeatures("Trailers");
        filmService.insert(film);
        System.out.println("Context stop");
        ac.close();
        return "ok";
    }
}
