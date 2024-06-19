package com.inventory.optimize.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.inventory.optimize.model.Inventory;
import com.inventory.optimize.service.InventoryOptimizationService;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class InventoryController {

    @Autowired
    private InventoryOptimizationService optimizationService;

    private List<Inventory> inventoryList = new ArrayList<>();

    @PostMapping("/optimize")
    public String optimizeInventory() {
        return optimizationService.optimizeInventory();
    }
    
    @GetMapping("/inventory")
    public List<Inventory> getCurrentInventory() {
        return inventoryList;
    }
    
    @PostMapping("/inventory")
    public String addInventoryItem(@RequestBody Inventory inventory) {
        inventoryList.add(inventory);
        return "Inventory item added successfully";
    }
}

