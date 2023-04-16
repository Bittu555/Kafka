package com.example.kafkaproducer.model;

public class HighSchool {
    private String schoolName;
    private String location;

    public HighSchool(){

    }

    public HighSchool(String schoolName, String location) {
        this.schoolName = schoolName;
        this.location = location;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
