package com.logistics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long shipmentId;
    private String supplier;
    private String warehouse;
    private String customer;
    private String status;
    
	public Shipment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Shipment(Long shipmentId, String supplier, String warehouse, String customer, String status) {
		super();
		this.shipmentId = shipmentId;
		this.supplier = supplier;
		this.warehouse = warehouse;
		this.customer = customer;
		this.status = status;
	}
	
	public Long getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(Long shipmentId) {
		this.shipmentId = shipmentId;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

