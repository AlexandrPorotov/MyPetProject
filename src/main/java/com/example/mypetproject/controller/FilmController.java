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

    @PostMapping("/add_film")
    public String addFilm(@RequestBody FilmInfo filmInfo){
        Film film = filmService.addFilm(filmInfo);
        System.out.println(film.toString());
        return film.toString();
    }

}
