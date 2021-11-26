package com.example.mypetproject.model;

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
    private Long filmName;

    @Column(name = "film_description")
    private String filmDescription;

    @Column(name = "film_duration")
    private Duration filmDuration;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "film")
    private List<MovieSession> filmSessionList;

}
