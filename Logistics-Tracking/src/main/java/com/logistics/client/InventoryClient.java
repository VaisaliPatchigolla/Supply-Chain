package com.logistics.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.logistics.model.InventoryDTO;
import java.util.List;

@FeignClient(name = "inventory-service", url = "${inventory.service.url}")
public interface InventoryClient {

    @GetMapping("/inventory")
    List<InventoryDTO> getAllInventories();
}