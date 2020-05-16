package com.foued.springcloudlastname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudLastnameApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLastnameApplication.class, args);
	}

}
