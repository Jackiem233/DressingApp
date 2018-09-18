package com.example.dell.dressing;

public class Dress {
    private String name;
    private int imageId;
    public Dress(String name, int imageId) {
        this.imageId = imageId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
