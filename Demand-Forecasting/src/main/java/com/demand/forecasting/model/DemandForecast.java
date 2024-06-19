package com.demand.forecasting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DemandForecast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long forecastId;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
    private LocalDate forecastDate;
    private int forecastQuantity;
    
	public DemandForecast() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DemandForecast(Long forecastId, Product product, LocalDate forecastDate, int forecastQuantity) {
		super();
		this.forecastId = forecastId;
		this.product = product;
		this.forecastDate = forecastDate;
		this.forecastQuantity = forecastQuantity;
	}
	
	public Long getForecastId() {
		return forecastId;
	}
	public void setForecastId(Long forecastId) {
		this.forecastId = forecastId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
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

