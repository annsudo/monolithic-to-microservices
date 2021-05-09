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




@RestController
@RequestMapping("/catalog")
public class PodcastCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/Katacoda") 
    public List<CatalogItem> getCatalog() {


    }
}
