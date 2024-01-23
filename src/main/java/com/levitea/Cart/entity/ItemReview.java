package com.levitea.Cart.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "item_review")
public class ItemReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String reviewerName;
    private String review;

//    @ManyToOne
//    private Item item;
//
//    public Item getItem() {
//        return item;
//    }
//
//    public void setItem(Item item) {
//        this.item = item;
//    }

    public int getId() {
        return id;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
