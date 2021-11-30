package com.example.mypetproject.controller;

import com.example.mypetproject.dto.FilmInfo;
import com.example.mypetproject.model.Film;
import com.example.mypetproject.service.film.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("film")
@RequiredArgsConstructor
public class FilmController {

    private final FilmService filmService;

    private String response;

    @PostMapping("/add_film")
    public String addFilm(@RequestBody FilmInfo filmInfo){
        if(filmService.findFilmByName(filmInfo.getFilmName())){
            Film film = filmService.addFilm(filmInfo);
            response = "Film added - " + film.toString();
        } else {
            Film filmFromBD = filmService.getFilmByName(filmInfo.getFilmName());
            response = "This film already exist. "+filmFromBD.toString();
        }
        return response;
    }

}
