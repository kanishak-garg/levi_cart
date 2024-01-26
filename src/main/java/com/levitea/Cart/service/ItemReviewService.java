package com.levitea.Cart.service;

import com.levitea.Cart.dal.ItemReviewDAL;
import com.levitea.Cart.entity.ItemReview;
import com.levitea.Cart.repository.ItemReviewRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemReviewService {

    @Autowired
    ItemReviewRepository itemReviewRepository;

    public void save(ItemReview itemReview) {
        itemReviewRepository.save(itemReview);
    }
}
