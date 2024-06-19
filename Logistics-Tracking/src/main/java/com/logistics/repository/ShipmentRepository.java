package com.logistics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.logistics.model.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
//    Shipment findById(long id);
}