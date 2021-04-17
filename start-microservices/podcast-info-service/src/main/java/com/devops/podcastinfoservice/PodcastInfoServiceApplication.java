package com.devops.podcastinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class PodcastInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PodcastInfoServiceApplication.class, args);
	}

}
