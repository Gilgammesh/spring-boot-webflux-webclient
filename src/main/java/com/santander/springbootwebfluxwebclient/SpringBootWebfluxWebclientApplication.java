package com.santander.springbootwebfluxwebclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootWebfluxWebclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebfluxWebclientApplication.class, args);
	}

}
