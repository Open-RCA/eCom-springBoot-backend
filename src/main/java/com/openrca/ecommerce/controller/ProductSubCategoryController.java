package com.openrca.ecommerce.controller;

import com.openrca.ecommerce.model.ProductSubCategory;
import com.openrca.ecommerce.repository.ProductSubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;


@RestController
public class ProductSubCategoryController {

    @Autowired
    private ProductSubCategoryRepository productSubCategoryRepository;

    @PostMapping("/productSubCategory")
    public ProductSubCategory addProductSubCategoryDetails(@RequestBody ProductSubCategory productSubCategory){
        return productSubCategoryRepository.save(productSubCategory);
    }

    @GetMapping("/productSubCategory/{id}")
    public ProductSubCategory getProductSubCategoryById(@PathVariable Long id){
        return productSubCategoryRepository.findById(id).
                orElseThrow(()-> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }


    @PutMapping("/productSubCategory/{id}")
    public ResponseEntity<ProductSubCategory> updateProductSubCategoryById(@PathVariable Long id, @RequestBody ProductSubCategory productSubCategory){

        Optional<ProductSubCategory> productSubCategoryData = productSubCategoryRepository.findById(id);

        if( productSubCategoryData.isPresent() ){
            ProductSubCategory _productSubCategory = productSubCategoryData.get();
            _productSubCategory.setSubCategoryId(productSubCategory.getSubCategoryId());
            _productSubCategory.setSubCategoryName(productSubCategory.getSubCategoryName());
            _productSubCategory.setCategoryId(productSubCategory.getCategoryId());
            _productSubCategory.setAddedAt(productSubCategory.getAddedAt());

            return new ResponseEntity<>(productSubCategoryRepository.save(_productSubCategory), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/productSubCategory/{id}")
    public void deleteProductSubCategoryById(@PathVariable Long id){
        productSubCategoryRepository.deleteById(id);
    }


}