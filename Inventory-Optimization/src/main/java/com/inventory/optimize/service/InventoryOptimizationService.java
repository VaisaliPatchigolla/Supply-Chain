package com.inventory.optimize.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inventory.optimize.feign.DemandForecastClient;
import com.inventory.optimize.model.DemandForecastDTO;
import java.util.List;

@Service
public class InventoryOptimizationService {

    @Autowired
    private DemandForecastClient demandForecastClient;

    public List<DemandForecastDTO> fetchAllForecasts() {
        return demandForecastClient.getAllForecasts();
    }

    public List<DemandForecastDTO> fetchForecastsByProductId(Long productId) {
        return demandForecastClient.getForecastsByProductId(productId);
    }

    public String optimizeInventory() {
        Long productId = 1L;
        List<DemandForecastDTO> forecasts = fetchForecastsByProductId(productId);

        if (forecasts.isEmpty()) {
            return "No forecasts available for optimization.";
        }

        int totalForecastQuantity = forecasts.stream()
                .mapToInt(DemandForecastDTO::getForecastQuantity)
                .sum();

        return "Inventory optimized successfully. Total forecast quantity: " + totalForecastQuantity;
    }
}


