package com.example.travelplanner;

public class ItineraryItem {
    private String name;
    private String type;
    private String duration;

    public ItineraryItem(String name, String type, String duration) {
        this.name = name;
        this.type = type;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDuration() {
        return duration;
    }
}


