package com.database.hw.repository;

import com.database.hw.entity.MyOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<MyOrder, Long> {
}
