package com.example.aidana.cssapp;
import java.util.ArrayList;

import android.media.Image;
import android.widget.ImageView;

/**
 * Created by Aidana on 4/13/2015.
 */
public class Instructor {
    private String name;
    private String title;
    private ImageView picture;
    private String email;
    private int phone;
    private String office_location;
    private String short_bio;

    public Instructor(String name){
        setName(name);
    }
    public Instructor(String name, String title, String email, int phone, String office, String shortBio){
        this.name = name;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.office_location = office;
        this.short_bio = shortBio;


    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ImageView getPicture() {
        return picture;
    }

    public void setPicture(ImageView picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getShort_bio() {
        return short_bio;
    }

    public void setShort_bio(String short_bio) {
        this.short_bio = short_bio;
    }

    public String getOffice_location() {
        return office_location;
    }

    public void setOffice_location(String office_location) {
        this.office_location = office_location;
    }



    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    private ArrayList<Course> courses;

}
