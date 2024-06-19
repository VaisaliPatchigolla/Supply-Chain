package com.logistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistics.model.Shipment;
import com.logistics.repository.ShipmentRepository;

@Service
public class ShipmentService {

    @Autowired
    private ShipmentRepository shipmentRepository;

    public Shipment trackShipment(Shipment shipment) {
        shipment.setStatus("In Transit");
        return shipmentRepository.save(shipment);
    }

    public Shipment getShipmentStatus(long id) {
        return shipmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Shipment not found with id: " + id));
    }
}
