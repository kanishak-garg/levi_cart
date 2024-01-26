package com.levitea.Cart.controller;

import com.levitea.Cart.entity.Item;
import com.levitea.Cart.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {


    @Autowired
    ItemService itemService;

    @GetMapping("/id/{id}")
    public Item getItemById(@PathVariable int id){
        return itemService.getItemById(id);
    }

    @GetMapping("/all")
    public List<Item> getAllItems(){
        return itemService.getAll();
    }

    @PostMapping
    public void saveItem(@RequestBody Item item){
        itemService.save(item);
    }

    @DeleteMapping("/delete/id/{id}")
    public void deleteitemByid(@PathVariable int id){
        itemService.delete(id);
    }

    @PutMapping("/update")
    public void UpdateItem(@RequestBody Item updateItem){
        itemService.update(updateItem);
    }

}
