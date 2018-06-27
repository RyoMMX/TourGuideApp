package com.example.android.tourguideapp;

public class Item {
    private int image;
    private String map;
    private String location;

    Item(int image, String map, String location) {
        this.image = image;
        this.map = map;
        this.location = location;
    }

    int getImage() {
        return image;
    }

    String getMap() {
        return map;
    }

    String getLocation() {
        return location;
    }
}
