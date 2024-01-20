package com.levitea.Cart.dal;

import com.levitea.Cart.entity.Item;

public interface ItemDAL {
    Item getById(int id);

    void save(Item item);

    void delete(int id);

    void update(Item updateItem);
}
