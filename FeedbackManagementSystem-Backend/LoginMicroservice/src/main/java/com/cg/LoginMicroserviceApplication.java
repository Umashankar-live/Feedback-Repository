package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LoginMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginMicroserviceApplication.class, args);
	}

}
