package com.example.mypetproject.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tickets")
@Data
public class Ticket {

    @Id
    @Column(name = "ticket_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;

    @Column(name = "ticket_film_name")
    private String ticketFilmName;

    @Column(name = "ticket_date")
    private LocalDateTime ticketDateTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
