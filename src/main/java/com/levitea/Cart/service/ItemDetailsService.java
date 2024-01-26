package com.levitea.Cart.service;

import com.levitea.Cart.dal.ItemDetailsDAL;
import com.levitea.Cart.entity.ItemDetails;
import com.levitea.Cart.repository.ItemDetailsRepository;
import com.levitea.Cart.repository.ItemRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemDetailsService {

    @Autowired
    ItemDetailsRepository itemDetailsRepository;

    public void delete(int id) {
        itemDetailsRepository.deleteById(id);
    }

    public List<ItemDetails> getItemDetailsByPrice(double price) {
        return itemDetailsRepository.findByPriceGreaterThan(price);
    }
}
