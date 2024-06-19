package com.demand.forecasting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demand.forecasting.model.DemandForecast;
import java.util.List;

public interface DemandForecastRepository extends JpaRepository<DemandForecast, Long> {
    List<DemandForecast> findByProductProductId(Long productId);
}

