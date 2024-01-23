package com.levitea.Cart.dal;

import com.levitea.Cart.entity.Order;

public interface OrderDAL {
    Order getById(int id);

    void save(Order item);

    void delete(int id);

    void update(Order updateItem);
}
