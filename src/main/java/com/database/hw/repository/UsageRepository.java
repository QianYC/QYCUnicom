package com.database.hw.repository;

import com.database.hw.entity.MyUsage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsageRepository extends JpaRepository<MyUsage, Long> {
}
