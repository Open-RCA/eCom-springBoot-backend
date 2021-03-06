package com.openrca.ecommerce.repository;

import com.openrca.ecommerce.model.ProductSubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSubCategoryRepository extends JpaRepository<ProductSubCategory,Long> {

}
