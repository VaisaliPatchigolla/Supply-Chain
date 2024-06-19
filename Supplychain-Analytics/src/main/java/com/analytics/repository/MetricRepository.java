package com.analytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.analytics.model.Metric;
import java.util.List;

public interface MetricRepository extends JpaRepository<Metric, Long> {
    List<Metric> findByType(String type);
}
