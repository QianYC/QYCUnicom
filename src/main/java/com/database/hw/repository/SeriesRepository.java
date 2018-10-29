package com.database.hw.repository;

import com.database.hw.entity.MySeries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<MySeries, Long> {
}
