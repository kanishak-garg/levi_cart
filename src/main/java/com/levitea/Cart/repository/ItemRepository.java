package com.levitea.Cart.repository;

import com.levitea.Cart.entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item,Integer> {
}
