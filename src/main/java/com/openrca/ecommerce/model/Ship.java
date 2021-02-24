package com.openrca.ecommerce.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Setter
@Getter
@Table(name = "")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ship {

    @Id
    @Column(name = "")
    private Integer shipId;

    @Column(name = "")
    private Integer orderId;

    @Column(name = "")
    private Integer employeeId;

    @Column(name = "")
    private Time dateOfShipment;

    @Column(name = "")
    private String shipName;

    @Column(name = "")
    private String shipAddress;

    @Column(name = "")
    private String shipCity;

    @Column(name = "")
    private String shipCountry;

    @Column(name = "")
    private String shipPostalCode;

    @Column(name = "")
    private Time addedInDbAt;

    @Column(name = "")
    private Double shipCosts;

}
