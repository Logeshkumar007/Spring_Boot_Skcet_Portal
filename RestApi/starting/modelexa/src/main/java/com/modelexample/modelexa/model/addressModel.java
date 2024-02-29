package com.modelexample.modelexa.model;

public class addressModel {
    private String name;
    private int doorno;
    private String street;
    private int pincode;
    private String area;
    private String dist;
    private String state;
    private String country;
    
    public addressModel(String name, int doorno, String street, int pincode, String area, String dist, String state,
            String country) {
        this.name = name;
        this.doorno = doorno;
        this.street = street;
        this.pincode = pincode;
        this.area = area;
        this.dist = dist;
        this.state = state;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoorno() {
        return doorno;
    }

    public void setDoorno(int doorno) {
        this.doorno = doorno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
    
}
