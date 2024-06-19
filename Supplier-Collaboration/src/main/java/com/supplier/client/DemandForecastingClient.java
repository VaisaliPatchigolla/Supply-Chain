package com.supplier.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.supplier.model.OrderDTO;
import java.util.List;

@FeignClient(name = "demand-forecasting", url = "http://localhost:8080")
public interface DemandForecastingClient {

	@GetMapping("/orders/all")
    List<OrderDTO> getAllOrders();
}

