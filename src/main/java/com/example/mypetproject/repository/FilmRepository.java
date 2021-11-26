package com.example.mypetproject.repository;

import com.example.mypetproject.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
