package com.devops.podcastinfoservice.resources;

import java.util.Arrays;
import java.util.List;

import com.devops.podcastinfoservice.models.Podcast;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PodcastResource {
   
    @RequestMapping ("/podcasts")
    public List <Podcast> getPodcast(){
        return Arrays.asList(
        new Podcast("1", "The school of Greatness"),
        new Podcast("2", "Security now"),
        new Podcast("3", "Frontiers of learning")
        );
        
    }

}
