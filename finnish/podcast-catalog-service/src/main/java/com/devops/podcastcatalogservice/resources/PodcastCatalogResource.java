package com.devops.podcastcatalogservice.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.devops.podcastcatalogservice.models.CatalogItem;
import com.devops.podcastcatalogservice.models.Podcast;
import com.devops.podcastcatalogservice.models.Rating;
import com.devops.podcastcatalogservice.models.UserRating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/catalog")
public class PodcastCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}") // {variable}
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

        UserRating ratings = restTemplate.getForObject("http://ratings-data-service/ratingdata/users/"+userId, UserRating.class);
        
        return ratings.getUserRating().stream().map(rating -> {
        
            // For each podcastId call Podcast-info service to get details
            Podcast podcast = restTemplate.getForObject("http://podcast-info-service/podcasts/" + rating.getPodcastId(), Podcast.class); //url + class to unmarshal it to

            
            // Putting all data together
            return new CatalogItem(podcast.getName(), "Security", rating.getRating());
       
        }).collect(Collectors.toList());

    }
}