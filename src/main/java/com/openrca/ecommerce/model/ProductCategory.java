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
public class ProductCategory {
    //Constructor without Id
    public ProductCategory(String categoryName, Date addedAt) {
        this.categoryName = categoryName;
        this.addedAt = addedAt;
    }

    @Id
    @Column(name = "")
    private Long categoryId;

    @Column(name = "")
    private String categoryName;

    @Column(name = "")
    private Date addedAt;
}
