package com.demand.forecasting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.demand.forecasting.model.DemandForecast;
import com.demand.forecasting.service.DemandForecastService;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/forecast")
public class DemandForecastController {

    @Autowired
    private DemandForecastService demandForecastService;

    @GetMapping("/all")
    public List<DemandForecast> getAllForecasts() {
        return demandForecastService.getAllForecasts();
    }

    @GetMapping("/product/{productId}")
    public List<DemandForecast> getForecastsByProductId(@PathVariable Long productId) {
        return demandForecastService.getForecastsByProductId(productId);
    }

    @PostMapping("/create")
    public DemandForecast generateForecast(@RequestBody Map<String, Long> request) {
        Long productId = request.get("productId");
        return demandForecastService.generateForecast(productId);
    }
}

