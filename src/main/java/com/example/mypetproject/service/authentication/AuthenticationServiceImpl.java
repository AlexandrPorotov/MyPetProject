package com.example.mypetproject.service.authentication;

import com.example.mypetproject.dto.UserInfo;
import com.example.mypetproject.model.User;
import com.example.mypetproject.service.user.UserService;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService{

    private final UserService userService;

    private final Gson gson;

    private String response;

    @Override
    public String registration(UserInfo userInfo) {

        if(!userService.findUserByName(userInfo.getUserName()) | !userService.findUserByMail(userInfo.getUserMail())) {

            response = "This name or mail already exist.";

        } else {

            User user = userService.createUser(userInfo);
            response = "Registration successful. " + user.toString();

        }
        return gson.toJson(response);
    }

    @Override
    public String login(UserInfo userInfo) {

        User userFromBd = userService.getUserByName(userInfo.getUserName());

        if(userFromBd == null) {

            response = "Check your name. If you dont have account, it doesn't matter, go through registration. ";

        } else if (userService.checkUserPassword(userFromBd,userInfo.getUserPassword())) {

            response = "Login successful, hello " + userFromBd.getUserName();

        } else {

            response = "Make sure that the password is correct";

        }
        return gson.toJson(response);
    }
}
