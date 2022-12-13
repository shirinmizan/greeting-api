package com.example.greeting.model;

import java.sql.Timestamp;

public class Greeting {
    private int id;
    private String createdBy;
    private String greeting;
    private String originCountry;
    private Timestamp dateCreated;

    public Greeting(int id, String createdBy, String greeting, String originCountry, Timestamp dateCreated) {
        this.id = id;
        this.createdBy = createdBy;
        this.greeting = greeting;
        this.originCountry = originCountry;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", createdBy='" + createdBy + '\'' +
                ", greeting='" + greeting + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
