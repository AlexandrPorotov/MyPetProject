package com.example.mypetproject.service.film;

import com.example.mypetproject.dto.FilmInfo;
import com.example.mypetproject.model.Film;
import com.example.mypetproject.repository.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService{

    private final FilmRepository filmRepository;

    @Override
    public Film addFilm(FilmInfo filmInfo) {
        Film film = new Film();
        film.setFilm(filmInfo);
        filmRepository.save(film);
        return film;
    }

    @Override
    public Film getFilmById(Long filmId) {
        return null;
    }

    @Override
    public Film getFilmByName(String filmName) {
        return null;
    }

    @Override
    public Boolean findFilmByName(String filmName) {
        return null;
    }
}
