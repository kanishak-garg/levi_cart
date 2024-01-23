package com.levitea.Cart.controller;

import com.levitea.Cart.entity.Order;
import com.levitea.Cart.entity.Order;
import com.levitea.Cart.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/id/{id}")
    public Order getOrderById(@PathVariable int id){
        return orderService.getOrderById(id);
    }

    @PostMapping
    public void saveOrder(@RequestBody Order order){
        orderService.save(order);
    }

    @DeleteMapping("/delete/id/{id}")
    public String deleteorderByid(@PathVariable int id){
        return orderService.delete(id);
    }

    @PutMapping("/update")
    public void UpdateOrder(@RequestBody Order updateOrder){
        orderService.update(updateOrder);
    }

}
