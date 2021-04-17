package com.devops.podcastinfoservice.resources;

import java.util.Arrays;
import java.util.List;

import com.devops.podcastinfoservice.models.Podcast;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/podcasts")
public class PodcastResource {
   
    @RequestMapping("/{podcastId}")
    public Podcast getPodcast(@PathVariable("podcastId") String podcastId){
       // return new Podcast(podcastId, "The school of Greatness");

        if(podcastId.equals("1")){
            return new Podcast(podcastId, "The school of Greatness");
        } else if(podcastId.equals("2")){
            return new Podcast(podcastId, "Security now");
        } else if(podcastId.equals("3")){
            return new Podcast(podcastId, "Frontiers of learning");
        } else{
            return null;
        }
    }
}
