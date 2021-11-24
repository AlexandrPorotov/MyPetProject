package com.example.mypetproject.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_mail")
    private String userMail;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_balance")
    private Long userBalance;

    @OneToMany(mappedBy = "user")
    private List<Ticket> userTickets;

}
