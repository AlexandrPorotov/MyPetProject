package com.example.mypetproject.model;

import com.example.mypetproject.dto.FilmInfo;
import lombok.Data;

import javax.persistence.*;
import java.time.Duration;
import java.util.List;

@Entity
@Table(name = "films")
@Data
public class Film {

    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long filmId;

    @Column(name = "film_name")
    private String filmName;

    @Column(name = "film_description")
    private String filmDescription;

    @Column(name = "film_duration")
    private Duration filmDuration;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "film")
    private List<MovieSession> filmSessionList;

    public void setFilm(FilmInfo filmInfo){
        this.filmDescription = filmInfo.getFilmDescription();
        this.filmDuration = Duration.ofSeconds(filmInfo.getFilmDuration());
        this.filmName = filmInfo.getFilmName();
    }

    @Override
    public String toString(){
        return "Film {"+
                "id = " + filmId +
                ", film name ='" + filmName + "'" +
                ", film duration ='" + filmDuration.getSeconds() + " sec '" +
                ", film description ='" + filmDescription + "'" +
                "}";
    }
}
