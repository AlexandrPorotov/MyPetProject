package com.example.mypetproject.repository;

import com.example.mypetproject.model.User;
import org.springframework.data.jpa.repository.*;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT user FROM User user WHERE user.userName=?1")
    User findByUserName(String userName);

    @Query("SELECT user FROM User user WHERE user.userMail=?1")
    User findByUserMail(String userMail);

}
