package com.dahl.myapp;

public class Fruit {

    private String name;
    private String time;
    private String url;
    private int imageId;

    public Fruit(String name,String time,String uurl){
        this.name = name;
        this.imageId = imageId;
        this.time = time;
        this.url = uurl;

    }

    public String getName() {
        return name;
    }

    public String gettime() {
        return time;
    }

    public String geturl() {
        return url;
    }

    public int getImageId() {
        return imageId;
    }
}