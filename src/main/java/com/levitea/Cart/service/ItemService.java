package com.levitea.Cart.service;

import com.levitea.Cart.dal.ItemDAL;
import com.levitea.Cart.entity.Item;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemDAL itemDAL;

    @Transactional
    public Item getItemById(int id) {
        return itemDAL.getById(id);
    }

    @Transactional
    public void save(Item item) {
        itemDAL.save(item);
    }

    @Transactional
    public void delete(int id) {
        itemDAL.delete(id);
    }

    @Transactional
    public void update(Item updateItem) {
        itemDAL.update(updateItem);
    }
}
