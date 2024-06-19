package com.analytics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.analytics.model.Metric;
import com.analytics.repository.MetricRepository;
import java.util.List;

@Service
public class MetricsService {

    @Autowired
    private MetricRepository metricRepository;

    public List<Metric> getMetrics(String type) {
        if (type != null) {
            return metricRepository.findByType(type);
        }
        return metricRepository.findAll();
    }
}

