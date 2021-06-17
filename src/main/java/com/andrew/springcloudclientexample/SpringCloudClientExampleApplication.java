package com.andrew.springcloudclientexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudClientExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudClientExampleApplication.class, args);
	}

}
