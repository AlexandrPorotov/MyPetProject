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

    @Column(name = "seat_number")
    private Integer seatNumber;

    @OneToOne
    private Ticket ticket;

    @Column(name = "is_vacant")
    private Boolean isVacant;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;

    @ManyToOne
    @JoinColumn(name = "row_id")
    private Row row;
}
