package com.devops.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import com.devops.ratingsdataservice.models.Rating;
import com.devops.ratingsdataservice.models.UserRating;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingdata")
public class RatingDataResources{

   @RequestMapping("/users/Katacoda")
    public UserRating getUserRating(){
        List<Rating> ratings = Arrays.asList(
            new Rating("1", 5), 
            new Rating("2", 4),
            new Rating("3", 5)
        );
   
    // Good practices to pass an object and not a list
        UserRating userRating= new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }

} 