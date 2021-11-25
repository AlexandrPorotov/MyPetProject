package com.example.mypetproject.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tickets")
@Data
public class Ticket {

    @Id
    @Column(name = "ticket_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "ticket_price")
    private Long ticketPrice;

    @ManyToOne
    @JoinColumn(name = "movie_session_id")
    private MovieSession movieSession;

    @OneToOne
    @JoinColumn(name = "seat_id")
    private Seat seat;

}
