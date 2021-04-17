package com.devops.podcastcatalogservice.models;

public class Rating {

    private String podcastId;
    private int rating;
    
    public Rating() {
    }

    public Rating(String podcastId, int rating) {
        this.podcastId = podcastId;
        this.rating = rating;
    }

    public String getPodcastId() {
        return podcastId;
    }

    public void setPodcastId(String podcastId) {
        this.podcastId = podcastId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    
}
