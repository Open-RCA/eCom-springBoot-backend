package com.openrca.ecommerce.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Getter
@Setter
@Table(name = "")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    //Constructor without Id
    public Product(Long categoryId, Long subCategoryId, String productName, Float price, Integer quantity, String image_url, String description, Date addedAt) {
        this.categoryId = categoryId;
        this.subCategoryId = subCategoryId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.image_url = image_url;
        this.description = description;
        this.addedAt = addedAt;
    }

    @Id
    @Column(name = "")
    private Long productId;

    @Column(name = "")
    private Long categoryId;

    @Column(name = "")
    private Long subCategoryId;

    @Column(name = "")
    private String productName;

    @Column(name = "")
    private Float price;

    @Column(name = "")
    private Integer quantity;

    @Column(name = "")
    private String image_url;

    @Column(name = "")
    private String description;

    @Column(name = "")
    private Date addedAt;

}
