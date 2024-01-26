package com.levitea.Cart.repository;

import com.levitea.Cart.entity.ItemDetails;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemDetailsRepository extends CrudRepository<ItemDetails,Integer> {
    //below method will not work in crudRepository, as crud does not support it. see next commit to see its application using jpaRepository
    List<ItemDetails> findByPriceGreaterThan(double price);

    @Query("select itd from ItemDetails itd where itd.category=?1 ORDER BY itd.price DESC")
    List<ItemDetails> findByCategoryOrderByPrice(String category);
}
