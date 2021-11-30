package com.example.mypetproject.controller;


import com.example.mypetproject.dto.PlaceInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("place")
@RequiredArgsConstructor
public class PlaceController {

    @PostMapping("/add_place")
    public String addPlace(PlaceInfo placeInfo){
        return "null";
    }
}
