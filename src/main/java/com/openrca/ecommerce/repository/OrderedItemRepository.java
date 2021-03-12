package com.openrca.ecommerce.repository;


import com.openrca.ecommerce.model.OrderedItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderedItemRepository extends JpaRepository<OrderedItem,Long> {

}
