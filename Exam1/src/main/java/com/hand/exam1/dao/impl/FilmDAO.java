package com.hand.exam1.dao.impl;

import com.hand.exam1.dao.IFilmDAO;
import com.hand.exam1.pojo.Film;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.stereotype.Repository;

@Repository
public class FilmDAO implements IFilmDAO {
    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }
    @Override
    public void insert(Film film) {
        try {

            runner.update("insert into film(title,description,release_year," +
                            "language_id,original_language_id,rental_duration," +
                            "rental_rate,length,replacement_cost," +
                            "rating,special_features) values(?,?,?,?,?,?,?,?,?,?,?)"
                    ,film.getTitle(),film.getDescription(),film.getReleaseYear()
                    ,film.getLanguageId(),film.getOriginalLanguageId(),film.getRentalDuration()
                    ,film.getRentalRate(),film.getLength(),film.getReplacementCost()
                    ,film.getRating(),film.getSpecialFeatures());
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
