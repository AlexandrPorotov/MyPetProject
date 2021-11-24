package com.example.mypetproject.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "places")
@Data
public class Place {

    @Id
    @Column(name = "place_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long placeId;

}
