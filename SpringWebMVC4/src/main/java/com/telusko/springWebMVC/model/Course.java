package com.telusko.springWebMVC.model;

public class Course {
    private Integer couresId;
    private String couresName;
    private Double couresPrice;

    public Course() {

    }

    public Integer getCouresId() {
        return couresId;
    }

    public void setCouresId(Integer couresId) {
        this.couresId = couresId;
    }

    public String getCouresName() {
        return couresName;
    }

    public void setCouresName(String couresName) {
        this.couresName = couresName;
    }

    public Double getCouresprice() {
        return couresPrice;
    }

    public void setCouresprice(Double couresprice) {
        this.couresPrice = couresprice;
    }

    public Course(Integer couresId, String couresName, Double couresprice) {
       super();
        this.couresId = couresId;
        this.couresName = couresName;
        this.couresPrice = couresprice;
    }
}
