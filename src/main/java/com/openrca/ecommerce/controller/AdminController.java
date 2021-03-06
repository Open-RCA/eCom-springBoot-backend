package com.openrca.ecommerce.controller;

import com.openrca.ecommerce.model.Admin;
import com.openrca.ecommerce.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

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
        return (Admin) adminRepository.findById(id).
                orElseThrow(()-> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }

}
