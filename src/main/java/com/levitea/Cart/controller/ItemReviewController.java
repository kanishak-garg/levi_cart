package com.levitea.Cart.controller;

import com.levitea.Cart.entity.ItemReview;
import com.levitea.Cart.service.ItemReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ItemReviewController {

    @Autowired
    ItemReviewService itemReviewService;

    @PostMapping("/save")
    public void save(@RequestBody ItemReview itemReview){
        itemReviewService.save(itemReview);
    }

}
