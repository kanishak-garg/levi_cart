package com.levitea.Cart.dal.dalImpl;

import com.levitea.Cart.dal.ItemDetailsDAL;
import com.levitea.Cart.entity.Item;
import com.levitea.Cart.entity.ItemDetails;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDetailsDALImpl implements ItemDetailsDAL {

    @Autowired
    EntityManager entityManager;

    @Override
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        ItemDetails itemDetails = session.get(ItemDetails.class,id);
        session.remove(itemDetails);
    }
}
