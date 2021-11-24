package com.example.mypetproject.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "rows")
@Data
public class Row {

    @Id
    @Column(name = "row_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rowId;

}
