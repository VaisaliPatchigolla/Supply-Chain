package com.supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SupplierCollaborationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupplierCollaborationApplication.class, args);
	}

}
