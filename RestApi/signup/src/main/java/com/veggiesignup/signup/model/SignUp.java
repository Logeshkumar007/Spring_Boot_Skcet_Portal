package com.veggiesignup.signup.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SignUp {
    @Id
    private String username;
    private String email;
    private String password;
    private String name;
    private String doorno;
    private String street;
    private String city;
    private String landmark;
    private String address1;
    private String address2;
    private String mobilenumber;
    private String pincode;
    private int id;

    public SignUp(){}

    public SignUp(String username, String email, String password, String name, String doorno, String street,
            String city, String landmark, String address1, String address2, String mobilenumber, String pincode,
            int id) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
        this.doorno = doorno;
        this.street = street;
        this.city = city;
        this.landmark = landmark;
        this.address1 = address1;
        this.address2 = address2;
        this.mobilenumber = mobilenumber;
        this.pincode = pincode;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoorno() {
        return doorno;
    }

    public void setDoorno(String doorno) {
        this.doorno = doorno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
}