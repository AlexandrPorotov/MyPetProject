package com.example.mypetproject.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.*;
import java.util.List;

@Entity
@Table(name = "movie_sessions")
@Data
public class MovieSession {

    @Id
    @Column(name = "movie_session_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieSessionId;

    @Column(name = "movie_session_duration")
    private Duration movieSessionDuration;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    @Column(name = "date_time_start_session")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime dateTimeStartSession;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "movieSession")
    private List<Ticket> ticketList;

}
