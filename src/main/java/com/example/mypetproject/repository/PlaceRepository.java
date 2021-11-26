package com.example.mypetproject.repository;

import com.example.mypetproject.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
