package com.openrca.ecommerce.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Getter
@Setter
@Table(name = "product_sub_categories")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductSubCategory {
    //Constructor without Id
    public ProductSubCategory(String subCategoryName, Integer categoryId, Date addedAt) {
        this.subCategoryName = subCategoryName;
        this.categoryId = categoryId;
        this.addedAt = addedAt;
    }

    @Id
    @Column(name = "sub_category_id")
    private Long subCategoryId;

    @Column(name = "sub_category_name")
    private String subCategoryName;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "addedAt")
    private Date addedAt;

}
