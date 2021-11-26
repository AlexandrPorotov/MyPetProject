package com.example.mypetproject.service.user;

import com.example.mypetproject.dto.UserInfo;
import com.example.mypetproject.model.User;

public interface UserService {

    User createUser(UserInfo userInfo);
    User getUserById(Long userId);
    User getUserByName(String userName);
    Boolean findUserByName(String userName);
    Boolean findUserByMail(String userMail);
    Boolean checkBalance(Long userId, Long cost);
    Boolean checkUserPassword(User user, String password);

}
