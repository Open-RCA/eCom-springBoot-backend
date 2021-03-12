package com.openrca.ecommerce.controller;

import com.openrca.ecommerce.model.OrderedItem;
import com.openrca.ecommerce.repository.OrderedItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@RestController
public class OrderedItemController {

    @Autowired
    private OrderedItemRepository orderedItemRepository;

    @PostMapping("/orderedItem")
    public OrderedItem addOrderDetails(@RequestBody OrderedItem orderedItem){
        return orderedItemRepository.save(orderedItem);
    }

    @GetMapping("/orderedItem/{id}")
    public OrderedItem getOrderedItemById(@PathVariable Long id){
        return orderedItemRepository.findById(id).
                orElseThrow(()-> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }


    @PutMapping("/orderedItem/{id}")
    public ResponseEntity<OrderedItem> updateOrderById(@PathVariable Long id, @RequestBody OrderedItem orderedItem){

        Optional<OrderedItem> orderedItemData = orderedItemRepository.findById(id);

        if( orderedItemData.isPresent() ){
            OrderedItem _order = orderedItemData.get();
            _order.setId(orderedItem.getId());
            _order.setProductId(orderedItem.getProductId());
            _order.setOrderedId(orderedItem.getOrderedId());
            _order.setProductCategoryId(orderedItem.getProductCategoryId());
            _order.setUnit_price(orderedItem.getUnit_price());
            _order.setAmount(orderedItem.getAmount());
            _order.setCreatedAt(orderedItem.getCreatedAt());

            return new ResponseEntity<>(orderedItemRepository.save(_order), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/orderedItem/{id}")
    public void deleteCustomerById(@PathVariable Long id){
        orderedItemRepository.deleteById(id);
    }


}