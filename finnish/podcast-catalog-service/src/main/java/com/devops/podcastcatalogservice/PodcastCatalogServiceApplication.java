package com.devops.podcastcatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@EnableEurekaClient
@SpringBootApplication
public class PodcastCatalogServiceApplication {

	@Bean //methid executes just once
	@LoadBalanced //url I´m giving you is a hint what service to discover
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	@Bean
	public WebClient.Builder getWebClientBuilder(){
		return WebClient.builder();	
	}

	public static void main(String[] args) {
		SpringApplication.run(PodcastCatalogServiceApplication.class, args);
	}

}
