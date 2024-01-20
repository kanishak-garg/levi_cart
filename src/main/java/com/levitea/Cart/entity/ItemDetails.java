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
}
