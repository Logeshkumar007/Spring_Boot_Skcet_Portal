package com.veggievibes.veggie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vegetables {
    @Id
    private int id;
    private String name;
    private String full_description;
    private String description;
    private int stock;
    private double price;
    private String image_url;

    public Vegetables(){}
    
    public Vegetables(int id, String name, String full_description, String description, int stock, double price,
            String image_url) {
        this.id = id;
        this.name = name;
        this.full_description = full_description;
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.image_url = image_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_description() {
        return full_description;
    }

    public void setFull_description(String full_description) {
        this.full_description = full_description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    
}
