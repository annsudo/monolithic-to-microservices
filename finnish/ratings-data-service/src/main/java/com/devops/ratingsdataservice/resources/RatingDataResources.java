package com.devops.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import com.devops.ratingsdataservice.models.Rating;
import com.devops.ratingsdataservice.models.UserRating;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingdata")
public class RatingDataResources{

    @RequestMapping("/{podcastId}")
    public Rating getRating(@PathVariable("podcastId") String podcastId){
        return new Rating(podcastId, 4);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        List<Rating> ratings = Arrays.asList(
            new Rating("1", 4), 
            new Rating("2", 5)
        );
        //return ratings;
        UserRating userRating= new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }

} 