package com.openrca.ecommerce.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "customers")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class Customer {

    //Constructor without Id


    public Customer(String firstName, String secondName, String username, String password, String billingAddress, String defaultShippingAddress, String country, String phone) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.username = username;
        this.password = password;
        this.billingAddress = billingAddress;
        this.defaultShippingAddress = defaultShippingAddress;
        this.country = country;
        this.phone = phone;
    }

    @Id
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "billing_address")
    private String billingAddress;

    @Column(name = "default_shipping_address")
    private String defaultShippingAddress;

    @Column(name = "country")
    private String country;

    @Column(name = "phone")
    private String phone;


}
