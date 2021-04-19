package com.devops.podcastcatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PodcastCatalogServiceApplication {

	@Bean //method executes just once
	@LoadBalanced 
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(PodcastCatalogServiceApplication.class, args);
	}

}
