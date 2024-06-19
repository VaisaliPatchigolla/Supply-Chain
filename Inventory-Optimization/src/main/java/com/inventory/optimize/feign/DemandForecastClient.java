package com.inventory.optimize.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.inventory.optimize.model.DemandForecastDTO;

import java.util.List;

@FeignClient(name = "demand-forecast-service", url = "${demand.forecast.service.url}")
public interface DemandForecastClient {

    @GetMapping("/forecast/all")
    List<DemandForecastDTO> getAllForecasts();

    @GetMapping("/forecast/product/{productId}")
    List<DemandForecastDTO> getForecastsByProductId(@PathVariable("productId") Long productId);
}

