package com.example.mypetproject.repository;

import com.example.mypetproject.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FilmRepository extends JpaRepository<Film, Long> {
    @Query("SELECT film FROM Film film WHERE film.filmName=?1")
    Film findFilmByName(String filmName);
}
