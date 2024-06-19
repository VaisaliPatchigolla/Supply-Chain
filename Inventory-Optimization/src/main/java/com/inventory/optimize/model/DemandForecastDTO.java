package com.inventory.optimize.model;

import java.time.LocalDate;

public class DemandForecastDTO {

    private Long forecastId;
    private Long productId;
    private LocalDate forecastDate;
    private int forecastQuantity;

    public DemandForecastDTO() {
    }

    public DemandForecastDTO(Long forecastId, Long productId, LocalDate forecastDate, int forecastQuantity) {
        this.forecastId = forecastId;
        this.productId = productId;
        this.forecastDate = forecastDate;
        this.forecastQuantity = forecastQuantity;
    }

    public Long getForecastId() {
        return forecastId;
    }

    public void setForecastId(Long forecastId) {
        this.forecastId = forecastId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public LocalDate getForecastDate() {
        return forecastDate;
    }

    public void setForecastDate(LocalDate forecastDate) {
        this.forecastDate = forecastDate;
    }

    public int getForecastQuantity() {
        return forecastQuantity;
    }

    public void setForecastQuantity(int forecastQuantity) {
        this.forecastQuantity = forecastQuantity;
    }
}
