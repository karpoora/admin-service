package com.plantwoo.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class PlantwooAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantwooAdminApplication.class, args);
	}
}
