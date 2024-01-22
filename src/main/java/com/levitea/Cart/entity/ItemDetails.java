package com.levitea.Cart.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "item_details")
public class ItemDetails {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String brand;
    private double price;
    private String category;

    @OneToOne(mappedBy = "itemDetails",cascade = CascadeType.ALL)
    private Item item;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
