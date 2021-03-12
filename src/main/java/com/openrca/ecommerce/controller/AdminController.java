package com.openrca.ecommerce.controller;

import com.openrca.ecommerce.model.Admin;
import com.openrca.ecommerce.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@RestController
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/admin")
    public Admin addAdminDetails(@RequestBody Admin admin){
        return adminRepository.save(admin);
    }

    @GetMapping("/admin/{id}")
    public Admin getAdminById(@PathVariable Long id){
        return adminRepository.findById(id).
                orElseThrow(()-> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }


    @PutMapping("/admin/{id}")
    public ResponseEntity<Admin> updateAdminById(@PathVariable Long id, @RequestBody Admin admin){

        Optional<Admin> adminData = adminRepository.findById(id);

        if( adminData.isPresent() ){
            Admin _admin = adminData.get();
            _admin.setAdminId(admin.getAdminId());
            _admin.setFirstName(admin.getFirstName());
            _admin.setSecondName(admin.getSecondName());
            _admin.setPhoneNumber(admin.getPhoneNumber());
            _admin.setVerification_email(admin.getVerification_email());
            _admin.setImage_url(admin.getImage_url());
            _admin.setUsername(admin.getUsername());
            _admin.setPassword(admin.getPassword());
            _admin.setLevel(admin.getLevel());
            _admin.setPasswordUpdatedAt(admin.getPasswordUpdatedAt());
            _admin.setJoinedAt(admin.getJoinedAt());

            return new ResponseEntity<>(adminRepository.save(_admin), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/admin/{id}")
    public void deleteAdminById(@PathVariable Long id){
        adminRepository.deleteById(id);
    }


}
