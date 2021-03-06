package com.openrca.ecommerce.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @Column(name = "")
    private Long customerId;

    @Column(name = "")
    private String firstName;

    @Column(name = "")
    private String secondName;

    @Column(name = "")
    private String password;

    @Column(name = "")
    private String billingAddress;

    @Column(name = "")
    private String defaultShippingAddress;

    @Column(name = "")
    private String country;

    @Column(name = "")
    private String phone;


}
