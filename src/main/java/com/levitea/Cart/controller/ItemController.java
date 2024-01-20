package com.levitea.Cart.controller;

import com.levitea.Cart.entity.Item;
import com.levitea.Cart.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {


    @Autowired
    ItemService itemService;

    @GetMapping("/id/{id}")
    public Item getItemById(@PathVariable int id){
        itemService.getItemById(id);
    }

}
