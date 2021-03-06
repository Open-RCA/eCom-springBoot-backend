package com.openrca.ecommerce.controller;

import com.openrca.ecommerce.model.Ship;
import com.openrca.ecommerce.repository.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;



@RestController
public class ShipController {

    @Autowired
    private ShipRepository shipRepository;

    @PostMapping("/ship")
    public Ship addShipDetails(@RequestBody Ship ship){
        return shipRepository.save(ship);
    }

    @GetMapping("/ship/{id}")
    public Ship getShipById(@PathVariable Long id){
        return shipRepository.findById(id).
                orElseThrow(()-> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }


    @PutMapping("/product/{id}")
    public ResponseEntity<Ship> updateShipById(@PathVariable Long id, @RequestBody Ship ship){

        Optional<Ship> shipData = shipRepository.findById(id);

        if( shipData.isPresent() ){
            Ship _ship = shipData.get();
            _ship.setShipId(ship.getShipId());
            _ship.setOrderId(ship.getOrderId());
            _ship.setEmployeeId(ship.getEmployeeId());
            _ship.setDateOfShipment(ship.getDateOfShipment());
            _ship.setShipName(ship.getShipName());
            _ship.setShipAddress(ship.getShipAddress());
            _ship.setShipCity(ship.getShipCity());
            _ship.setShipCountry(ship.getShipCountry());
            _ship.setShipPostalCode(ship.getShipPostalCode());
            _ship.setAddedInDbAt(ship.getAddedInDbAt());
            _ship.setShipCosts(ship.getShipCosts());

            return new ResponseEntity<>(shipRepository.save(_ship), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/product/{id}")
    public void deleteShipById(@PathVariable Long id){
        shipRepository.deleteById(id);
    }


}