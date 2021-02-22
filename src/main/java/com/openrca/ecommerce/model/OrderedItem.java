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

    @Id
    @Column(name = "")
    private Integer id;

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
