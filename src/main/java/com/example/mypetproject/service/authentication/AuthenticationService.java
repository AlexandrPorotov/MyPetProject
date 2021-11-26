package com.example.mypetproject.service.authentication;

import com.example.mypetproject.dto.UserInfo;
public interface AuthenticationService {

    String registration(UserInfo userInfo);
    String login(UserInfo userInfo);
}
