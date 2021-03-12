package com.openrca.ecommerce.controller;

import com.openrca.ecommerce.model.ProductCategory;
import com.openrca.ecommerce.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;


@RestController
public class ProductCategoryController {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @PostMapping("/productCategory")
    public ProductCategory addProductCategoryDetails(@RequestBody ProductCategory productCategory){
        return productCategoryRepository.save(productCategory);
    }

    @GetMapping("/productCategory/{id}")
    public ProductCategory getProductCategoryById(@PathVariable Long id){
        return productCategoryRepository.findById(id).
                orElseThrow(()-> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }


    @PutMapping("/productCategory/{id}")
    public ResponseEntity<ProductCategory> updateProductCategoryById(@PathVariable Long id, @RequestBody ProductCategory productCategory){

        Optional<ProductCategory> productCategoryData = productCategoryRepository.findById(id);

        if( productCategoryData.isPresent() ){
            ProductCategory _productCategory = productCategoryData.get();
            _productCategory.setCategoryId(productCategory.getCategoryId());
            _productCategory.setCategoryName(productCategory.getCategoryName());
            _productCategory.setAddedAt(productCategory.getAddedAt());

            return new ResponseEntity<>(productCategoryRepository.save(_productCategory), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/productCategory/{id}")
    public void deleteProductCategoryById(@PathVariable Long id){
        productCategoryRepository.deleteById(id);
    }


}