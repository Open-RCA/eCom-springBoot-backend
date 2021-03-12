package com.openrca.ecommerce.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Getter
@Setter
@Table(name = "")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @Column(name = "")
    private Long orderId;

    @Column(name = "")
    private Integer customerId;

    @Column(name = "")
    private Integer shipId;

    @Column(name = "")
    private Integer totalNumberOfOrderedProduct;

    @Column(name = "")
    private Double totalOrderedCost;

    @Column(name = "")
    private Double totalDiscount;

    @Column(name = "")
    private Time orderedAt;

    @Column(name = "")
    private Boolean OrderStatus;

    @Column(name = "")
    private String ShippingMethod;
}
