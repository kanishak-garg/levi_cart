package com.levitea.Cart.repository;

import com.levitea.Cart.entity.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item,Integer> {

    @Query(value = "SELECT * FROM item WHERE description LIKE CONCAT(:desc%,'%') LIMIT 4",nativeQuery = true)
    List<Item> getItemByDesc(@Param("desc") String desc);
}
