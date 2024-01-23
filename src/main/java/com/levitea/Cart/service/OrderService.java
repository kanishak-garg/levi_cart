package com.levitea.Cart.service;

import com.levitea.Cart.dal.ItemDAL;
import com.levitea.Cart.dal.OrderDAL;
import com.levitea.Cart.entity.Item;
import com.levitea.Cart.entity.Order;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderDAL orderDAL;

    @Autowired
    ItemDAL itemDAL;

    @Transactional
    public Order getOrderById(int id) {
        return orderDAL.getById(id);
    }

    @Transactional
    public void save(Order order) {
        Order saveOrder = new Order();
        List<Item> itemList = new ArrayList<>();
        for(Item item: order.getItems()){
            Item populatedItem = itemDAL.getById(item.getId());
            itemList.add(populatedItem);
        }
        saveOrder.setOrderType(order.getOrderType());
        saveOrder.setItems(itemList);
        orderDAL.save(saveOrder);
    }

    @Transactional
    public String delete(int id) {
        orderDAL.delete(id);
        return "order has been deleted with id: " + id;
    }

    @Transactional
    public void update(Order updateOrder) {
        orderDAL.update(updateOrder);
    }
}
