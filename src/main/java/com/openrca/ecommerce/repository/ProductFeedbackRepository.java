package com.openrca.ecommerce.repository;

import com.openrca.ecommerce.model.ProductFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductFeedbackRepository extends JpaRepository<ProductFeedback, Long> {

}
