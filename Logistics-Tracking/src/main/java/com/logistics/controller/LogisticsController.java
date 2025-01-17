package com.logistics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.logistics.model.InventoryDTO;
import com.logistics.model.Shipment;
import com.logistics.service.LogisticsService;
import com.logistics.service.ShipmentService;

import java.util.List;

@RestController
@RequestMapping("/logistics")
public class LogisticsController {

    @Autowired
    private LogisticsService logisticsService;

    @Autowired
    private ShipmentService shipmentService;

    @GetMapping("/fetch-inventory")
    public List<InventoryDTO> fetchInventory() {
        return logisticsService.fetchCurrentInventory();
    }

    @PostMapping("/track")
    public Shipment trackShipment(@RequestBody Shipment shipment) {
        return shipmentService.trackShipment(shipment);
    }

    @GetMapping("/status")
    public Shipment getShipmentStatus(@RequestParam long id) {
        return shipmentService.getShipmentStatus(id);
    }
}
