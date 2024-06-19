package com.logistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.logistics.client.InventoryClient;
import com.logistics.model.InventoryDTO;
import java.util.List;

@Service
public class LogisticsService {

    @Autowired
    private InventoryClient inventoryClient;

    public List<InventoryDTO> fetchCurrentInventory() {
        return inventoryClient.getAllInventories();
    }
}
