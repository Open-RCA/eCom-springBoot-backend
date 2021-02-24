package com.openrca.ecommerce.repository;


import com.openrca.ecommerce.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepository extends JpaRepository<Ship, Integer> {
}
