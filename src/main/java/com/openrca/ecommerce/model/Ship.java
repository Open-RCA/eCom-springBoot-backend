package com.openrca.ecommerce.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Setter
@Getter
@Table(name = "ship_tbl")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ship {

    //Constructor without Id
    public Ship(Integer orderId, Integer employeeId, Time dateOfShipment, String shipName, String shipAddress, String shipCity, String shipCountry, String shipPostalCode, Time addedInDbAt, Double shipCosts) {
        this.orderId = orderId;
        this.employeeId = employeeId;
        this.dateOfShipment = dateOfShipment;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipCity = shipCity;
        this.shipCountry = shipCountry;
        this.shipPostalCode = shipPostalCode;
        this.addedInDbAt = addedInDbAt;
        this.shipCosts = shipCosts;
    }

    @Id
    @Column(name = "id")
    private Long shipId;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "date_of_shipment")
    private Time dateOfShipment;

    @Column(name = "shipName")
    private String shipName;

    @Column(name = "shipAddress")
    private String shipAddress;

    @Column(name = "shipCity")
    private String shipCity;

    @Column(name = "shipCountry")
    private String shipCountry;

    @Column(name = "shipPostalCode")
    private String shipPostalCode;

    @Column(name = "added_in_db_at")
    private Time addedInDbAt;

    @Column(name = "ship_cost")
    private Double shipCosts;

}
