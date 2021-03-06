package com.example.mypetproject.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "places")
@Data
public class Place {

    @Id
    @Column(name = "place_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long placeId;

    @Column(name = "place_number")
    private Integer placeNumber;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "place")
    private List<MovieSession> movieSessionList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "place")
    private List<Seat> seatListInPlace;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "place")
    private List<Row> rowListInPlace;

}
