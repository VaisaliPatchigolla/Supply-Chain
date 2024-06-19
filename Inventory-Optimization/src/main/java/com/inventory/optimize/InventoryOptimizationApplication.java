package com.inventory.optimize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class InventoryOptimizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryOptimizationApplication.class, args);
	}

}
