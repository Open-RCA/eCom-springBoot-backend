package com.openrca.ecommerce.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Getter
@Setter
@Table(name = "orders")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    //Constructor without Id
    public Order(Integer customerId, Integer shipId, Integer totalNumberOfOrderedProduct, Double totalOrderedCost, Double totalDiscount, Time orderedAt, Boolean orderStatus, String shippingMethod) {
        this.customerId = customerId;
        this.shipId = shipId;
        this.totalNumberOfOrderedProduct = totalNumberOfOrderedProduct;
        this.totalDiscount = totalDiscount;
        this.orderedAt = orderedAt;
        OrderStatus = orderStatus;
        ShippingMethod = shippingMethod;
    }

    @Id
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "ship_id")
    private Integer shipId;

    @Column(name = "total_number_of_ordered_product")
    private Integer totalNumberOfOrderedProduct;

    @Column(name = "total_discount")
    private Double totalDiscount;

    @Column(name = "ordered_at")
    private Time orderedAt;

    @Column(name = "ordered_status")
    private Boolean OrderStatus;

    @Column(name = "shipping_method")
    private String ShippingMethod;
}
