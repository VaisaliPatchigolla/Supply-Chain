package com.demand.forecasting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demand.forecasting.model.Order;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByProductProductId(Long productId);
}

