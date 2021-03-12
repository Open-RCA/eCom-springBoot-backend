package com.openrca.ecommerce.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Getter
@Setter
@Table(name = "ordered_items")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class OrderedItem {

    //Constructor without Id
    public OrderedItem(Integer productId, Integer orderedId, Integer productCategoryId, Double unit_price, Integer amount, Time createdAt) {
        this.productId = productId;
        this.orderedId = orderedId;
        this.productCategoryId = productCategoryId;
        this.unit_price = unit_price;
        this.amount = amount;
        this.createdAt = createdAt;
    }


    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "order_id")
    private Integer orderedId;

    @Column(name = "product_category_id")
    private Integer productCategoryId;

    @Column(name = "unit_price")
    private Double unit_price;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "created_at")
    private Time createdAt;

}
