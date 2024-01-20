package com.levitea.Cart.service;

import com.levitea.Cart.dal.ItemDAL;
import com.levitea.Cart.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemDAL itemDAL;

    public Item getItemById(int id) {
        return itemDAL.getById(id);
    }
}
