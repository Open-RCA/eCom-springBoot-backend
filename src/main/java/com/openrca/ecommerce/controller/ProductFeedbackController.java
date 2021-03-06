package com.openrca.ecommerce.controller;

import com.openrca.ecommerce.model.ProductFeedback;
import com.openrca.ecommerce.repository.ProductFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;


@RestController
public class ProductFeedbackController {

    @Autowired
    private ProductFeedbackRepository productFeedbackRepository;

    @PostMapping("/productFeedback")
    public ProductFeedback addProductFeedbackDetails(@RequestBody ProductFeedback productFeedback){
        return productFeedbackRepository.save(productFeedback);
    }

    @GetMapping("/productFeedback/{id}")
    public ProductFeedback getProductFeedbackById(@PathVariable Long id){
        return productFeedbackRepository.findById(id).
                orElseThrow(()-> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }


    @PutMapping("/productFeedback/{id}")
    public ResponseEntity<ProductFeedback> updateProductById(@PathVariable Long id, @RequestBody ProductFeedback productFeedback){

        Optional<ProductFeedback> productFeedbackData = productFeedbackRepository.findById(id);

        if( productFeedbackData.isPresent() ){
            ProductFeedback _productFeedback = productFeedbackData.get();
            _productFeedback.setFeedbackId(productFeedback.getFeedbackId());
            _productFeedback.setProduct_id(productFeedback.getProduct_id());
            _productFeedback.setEmail(productFeedback.getEmail());
            _productFeedback.setBestQuality(productFeedback.getBestQuality());
            _productFeedback.setMediumQuality(productFeedback.getMediumQuality());
            _productFeedback.setLowQuality(productFeedback.getLowQuality());
            _productFeedback.setDescription(productFeedback.getDescription());
            _productFeedback.setAddedAt(productFeedback.getAddedAt());

            return new ResponseEntity<>(productFeedbackRepository.save(_productFeedback), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/productFeedback/{id}")
    public void deleteProductById(@PathVariable Long id){
        productFeedbackRepository.deleteById(id);
    }

}