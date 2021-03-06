package com.openrca.ecommerce.controller;

import com.openrca.ecommerce.model.Product;
import com.openrca.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;


@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/product")
    public Product addProductDetails(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable Long id){
        return productRepository.findById(id).
                orElseThrow(()-> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }


    @PutMapping("/product/{id}")
    public ResponseEntity<Product> updateProductById(@PathVariable Long id, @RequestBody Product product){

        Optional<Product> productData = productRepository.findById(id);

        if( productData.isPresent() ){
            Product _product = productData.get();
            _product.setProductId(product.getProductId());
            _product.setCategoryId(product.getCategoryId());
            _product.setSubCategoryId(product.getSubCategoryId());
            _product.setProductName(product.getProductName());
            _product.setPrice(product.getPrice());
            _product.setQuantity(product.getQuantity());
            _product.setImage_url(product.getImage_url());
            _product.setDescription(product.getDescription());
            _product.setAddedAt(product.getAddedAt());

            return new ResponseEntity<>(productRepository.save(_product), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/product/{id}")
    public void deleteProductById(@PathVariable Long id){
        productRepository.deleteById(id);
    }


}