package com.example.mypetproject.dto;

import lombok.Data;

@Data
public class FilmInfo {

    private Long filmId;

    private String filmName;

    private String filmDescription;

    private Long filmDuration;
}

