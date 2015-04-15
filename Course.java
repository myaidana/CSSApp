package com.example.aidana.cssapp;

/**
 * Created by Aidana on 4/13/2015.
 */
public class Course {
    private String courseID;
    private String description;
    private String long_description;

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLong_description() {
        return long_description;
    }

    public void setLong_description(String long_description) {
        this.long_description = long_description;
    }
}
