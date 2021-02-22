package com.openrca.ecommerce.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductSubCategory {

    @Id
    @Column(name = "")
    private Integer subCategoryId;

    @Column(name = "")
    private String subCategoryName;

    @Column(name = "")
    private Integer categoryId;

}
