package com.levitea.Cart.repository;

import com.levitea.Cart.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
