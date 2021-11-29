package com.example.mypetproject.controller;

import com.example.mypetproject.dto.UserInfo;
import com.example.mypetproject.service.authentication.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("main")
@RequiredArgsConstructor
public class RegistrationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/registration")
    public String registration(@RequestBody UserInfo userInfo) {
        return authenticationService.registration(userInfo);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserInfo userInfo) {
        return authenticationService.login(userInfo);
    }

}
