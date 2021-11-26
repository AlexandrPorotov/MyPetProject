package com.example.mypetproject.repository;

import com.example.mypetproject.model.Row;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RowRepository extends JpaRepository<Row, Long> {
}
