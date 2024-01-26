package com.levitea.Cart.controller;

import com.levitea.Cart.entity.ItemDetails;
import com.levitea.Cart.service.ItemDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/details")
public class ItemDetailsController {

    @Autowired
    ItemDetailsService itemDetailsService;

    @DeleteMapping("/id/{id}")
    public void delete(@PathVariable int id){
        itemDetailsService.delete(id);
    }

    @GetMapping("/price/{price}")
    public List<ItemDetails> getItemDetailsByPrice(@PathVariable double price){
        return itemDetailsService.getItemDetailsByPrice(price);
    }

}
