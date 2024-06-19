package com.analytics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.analytics.model.Metric;
import com.analytics.service.MetricsService;

import java.util.List;

@RestController
public class MetricsController {

    @Autowired
    private MetricsService metricsService;

    @GetMapping("/metrics")
    public List<Metric> getMetrics(@RequestParam(name = "type", required = false) String type) {
        return metricsService.getMetrics(type);
    }
}
