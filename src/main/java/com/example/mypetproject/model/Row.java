package com.example.mypetproject.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rows")
@Data
public class Row {

    @Id
    @Column(name = "row_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rowId;

    @Column(name = "row_number")
    private Integer rowNumber;

    @ManyToOne
    @JoinColumn(name = "palce_id")
    private Place place;

    @OneToMany(mappedBy = "row")
    private List<Seat> seatListInRow;

}
