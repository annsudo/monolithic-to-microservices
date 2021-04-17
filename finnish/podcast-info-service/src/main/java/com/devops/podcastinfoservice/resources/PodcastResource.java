package com.devops.podcastinfoservice.resources;

import com.devops.podcastinfoservice.models.Podcast;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/podcasts")
public class PodcastResource {
   
    @RequestMapping("/{podcastId}")
    public Podcast getPodcast(@PathVariable("podcastId") String podcastId){
        return new Podcast(podcastId, "The school of Greatness");
    }

}
