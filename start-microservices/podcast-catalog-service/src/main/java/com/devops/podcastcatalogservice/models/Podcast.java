package com.devops.podcastcatalogservice.models;

public class Podcast {

private String podcastId;
private String name;

public Podcast(){

}
public Podcast(String podcastId, String name) {
    this.podcastId = podcastId;
    this.name = name;
}

public String getPodcastId() {
    return podcastId;
}

public void setPodcastId(String podcastId) {
    this.podcastId = podcastId;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}



}
