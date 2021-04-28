package com.openrca.ecommerce.controller;

import com.openrca.ecommerce.model.Order;
import com.openrca.ecommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/order")
    public Order addOrderDetails(@RequestBody Order order){
        return orderRepository.save(order);
    }

    @GetMapping("/order/{id}")
    public Order getOrderById(@PathVariable Long id){
        return orderRepository.findById(id).
                orElseThrow(()-> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }


    @PutMapping("/order/{id}")
    public ResponseEntity<Order> updateOrderById(@PathVariable Long id, @RequestBody Order order){

        Optional<Order> orderData = orderRepository.findById(id);

        if( orderData.isPresent() ){
            Order _order = orderData.get();
            _order.setOrderId(order.getOrderId());
            _order.setCustomerId(order.getCustomerId());
            _order.setShipId(order.getShipId());

            _order.setTotalDiscount(order.getTotalDiscount());
            _order.setOrderedAt(order.getOrderedAt());
            _order.setOrderStatus(order.getOrderStatus());
            _order.setShippingMethod(order.getShippingMethod());

            return new ResponseEntity<>(orderRepository.save(_order), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/order/{id}")
    public void deleteCustomerById(@PathVariable Long id){
        orderRepository.deleteById(id);
    }


}