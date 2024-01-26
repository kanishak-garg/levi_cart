package com.levitea.Cart.service;

import com.levitea.Cart.dal.ItemDAL;
import com.levitea.Cart.dal.OrderDAL;
import com.levitea.Cart.entity.Item;
import com.levitea.Cart.entity.Order;
import com.levitea.Cart.repository.ItemRepository;
import com.levitea.Cart.repository.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ItemRepository itemRepository;

    public Order getOrderById(int id) {
        return orderRepository.findById(id).get();
    }

    public void save(Order order) {
        Order saveOrder = new Order();
        List<Item> itemList = new ArrayList<>();
        for(Item item: order.getItems()){
            Item populatedItem = itemRepository.findById(item.getId()).get();
            itemList.add(populatedItem);
        }
        saveOrder.setOrderType(order.getOrderType());
        saveOrder.setItems(itemList);
        orderRepository.save(saveOrder);
    }

    public String delete(int id) {
        orderRepository.deleteById(id);
        return "order has been deleted with id: " + id;
    }

    public void update(Order updateOrder) {
        orderRepository.save(updateOrder);
    }
}
