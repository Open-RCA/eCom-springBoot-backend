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
public class ProductSubCategory {

    @Id
    @Column(name = "")
    private Long subCategoryId;

    @Column(name = "")
    private String subCategoryName;

    @Column(name = "")
    private Integer categoryId;

    @Column(name = "")
    private Date addedAt;

}
