package com.levitea.Cart.service;

import com.levitea.Cart.dal.ItemDAL;
import com.levitea.Cart.entity.Item;
import com.levitea.Cart.repository.ItemRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public Item getItemById(int id) {
        return itemRepository.findById(id).get();
    }

    public void save(Item item) {
        itemRepository.save(item);
    }

    public void delete(int id) {
        itemRepository.deleteById(id);
    }

    public void update(Item updateItem) {
        itemRepository.save(updateItem);
    }

    public List<Item> getAll() {
        List<Item> itemList = new ArrayList<>();
        itemRepository.findAll().forEach(item -> itemList.add(item));
        return itemList;
    }
}
