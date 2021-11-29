package com.example.mypetproject.service.film;

import com.example.mypetproject.dto.FilmInfo;
import com.example.mypetproject.model.Film;

public interface FilmService {

    Film addFilm(FilmInfo filmInfo);

    Film getFilmById(Long filmId);

    Film getFilmByName(String filmName);

    Boolean findFilmByName(String filmName);

}
