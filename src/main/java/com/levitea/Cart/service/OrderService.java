package com.levitea.Cart.service;

import com.levitea.Cart.dal.OrderDAL;
import com.levitea.Cart.entity.Order;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderDAL orderDAL;

    @Transactional
    public Order getOrderById(int id) {
        return orderDAL.getById(id);
    }

    @Transactional
    public void save(Order order) {
        orderDAL.save(order);
    }

    @Transactional
    public void delete(int id) {
        orderDAL.delete(id);
    }

    @Transactional
    public void update(Order updateOrder) {
        orderDAL.update(updateOrder);
    }
}
