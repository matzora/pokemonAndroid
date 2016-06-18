package com.Entity;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class Area {

    protected String name;
    protected String picture_path;

    protected Trainer champion;

    public Area(String name, String picture_path, Trainer trainer)
    {
        champion = trainer;
        this.name = name;
        this.picture_path = picture_path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture_path() {
        return picture_path;
    }

    public void setPicture_path(String picture_path) {
        this.picture_path = picture_path;
    }
}
