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
    @Column(name = "")
    private Long id;

    @Column(name = "")
    private Integer productId;

    @Column(name = "")
    private Integer orderedId;

    @Column(name = "")
    private Integer productCategoryId;

    @Column(name = "")
    private Double unit_price;

    @Column(name = "")
    private Integer amount;

    @Column(name = "")
    private Time createdAt;

}
