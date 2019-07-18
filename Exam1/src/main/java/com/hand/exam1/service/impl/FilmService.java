package com.hand.exam1.service.impl;

import com.hand.exam1.dao.IFilmDAO;
import com.hand.exam1.pojo.Film;
import com.hand.exam1.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService implements IFilmService {
    @Autowired
    IFilmDAO filmDAO;

    public void setFilmDAO(IFilmDAO filmDAO) {
        this.filmDAO = filmDAO;
    }

    @Override
    public void insert(Film film) {
        filmDAO.insert(film);
    }
}
