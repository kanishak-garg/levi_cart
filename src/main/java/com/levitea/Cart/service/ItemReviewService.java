package com.levitea.Cart.service;

import com.levitea.Cart.dal.ItemReviewDAL;
import com.levitea.Cart.entity.ItemReview;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemReviewService {

    @Autowired
    ItemReviewDAL itemReviewDAL;

    @Transactional
    public void save(ItemReview itemReview) {
        itemReviewDAL.save(itemReview);
    }
}
