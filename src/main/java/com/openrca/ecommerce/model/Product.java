package com.openrca.ecommerce.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Table(name = "products")
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
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "sub_category_id")
    private Long subCategoryId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "price")
    private Float price;

    @Column(name = "qunatity")
    private Integer quantity;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "description")
    private String description;

    @Column(name = "added_at")
    private Date addedAt;

}
