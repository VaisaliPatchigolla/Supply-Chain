package com.demand.forecasting.service;

import com.demand.forecasting.model.DemandForecast;
import com.demand.forecasting.model.Order;
import com.demand.forecasting.repository.DemandForecastRepository;
import com.demand.forecasting.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DemandForecastService {

    @Autowired
    private DemandForecastRepository demandForecastRepository;

    @Autowired
    private OrderRepository orderRepository;

    public List<DemandForecast> getAllForecasts() {
        return demandForecastRepository.findAll();
    }

    public List<DemandForecast> getForecastsByProductId(Long productId) {
        return demandForecastRepository.findByProductProductId(productId);
    }

    public DemandForecast generateForecast(Long productId) {
        List<Order> orders = orderRepository.findByProductProductId(productId);
        int forecastQuantity = orders.size() * 10; 

        DemandForecast forecast = new DemandForecast();
        forecast.setProduct(orders.get(0).getProduct());
        forecast.setForecastDate(LocalDate.now());
        forecast.setForecastQuantity(forecastQuantity);

        return demandForecastRepository.save(forecast);
    }
}
