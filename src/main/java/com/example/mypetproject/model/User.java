package com.example.mypetproject.model;

import com.example.mypetproject.dto.UserInfo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

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

    @Column(name = "user_age")
    private Byte userAge;

    @Column(name = "user_mail")
    private String userMail;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_balance")
    @Value("0")
    private Long userBalance;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private List<Ticket> userTickets;

    public void setUser(UserInfo userInfo) {
        this.userName = userInfo.getUserName();
        this.userMail = userInfo.getUserMail();
        this.userAge = userInfo.getUserAge();
        this.userBalance = userInfo.getUserBalance();
        this.userPassword = userInfo.getUserPassword();
    }

    @Override
    public String toString() {
        return "User {"+
                "id = " + userId +
                ", user name ='" + userName + "'" +
                ", user mail ='" + userMail + "'" +
                "}";
    }

}
