package com.levitea.Cart.dal.dalImpl;

import com.levitea.Cart.dal.ItemReviewDAL;
import com.levitea.Cart.entity.Item;
import com.levitea.Cart.entity.ItemReview;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemReviewDALImpl implements ItemReviewDAL {
    @Autowired
    EntityManager entityManager;

    @Override
    public void save(ItemReview itemReview) {
        Session session = entityManager.unwrap(Session.class);
        session.save(itemReview);
    }
}
