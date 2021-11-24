package com.example.mypetproject.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "seats")
@Data
public class Seat {

    @Id
    @Column(name = "seat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seatId;

}
