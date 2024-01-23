package com.levitea.Cart.dal.dalImpl;

import com.levitea.Cart.dal.OrderDAL;
import com.levitea.Cart.entity.Order;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDALImpl implements OrderDAL {
    @Autowired
    EntityManager entityManager;

    @Override
    public Order getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Order order = session.get(Order.class, id);
        return order;
    }

    @Override
    public void save(Order order) {
        Session session = entityManager.unwrap(Session.class);
        session.save(order);
    }

    @Override
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        Order order = session.get(Order.class, id);
        session.remove(order);
    }

    @Override
    public void update(Order updateOrder) {
        Session session = entityManager.unwrap(Session.class);
        Order order = session.get(Order.class, updateOrder.getId());
        order.setOrderType(updateOrder.getOrderType());
        order.setItems(updateOrder.getItems());
        session.update(order);
    }

}
