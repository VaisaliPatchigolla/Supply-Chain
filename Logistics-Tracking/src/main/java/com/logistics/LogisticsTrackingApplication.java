package com.logistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LogisticsTrackingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogisticsTrackingApplication.class, args);
	}

}
