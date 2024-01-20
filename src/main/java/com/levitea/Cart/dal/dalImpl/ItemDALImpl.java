package com.levitea.Cart.dal.dalImpl;

import com.levitea.Cart.dal.ItemDAL;
import com.levitea.Cart.entity.Item;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDALImpl implements ItemDAL {

    @Autowired
    EntityManager entityManager;

    @Override
    public Item getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Item item = session.get(Item.class, id);
        return item;
    }
}
