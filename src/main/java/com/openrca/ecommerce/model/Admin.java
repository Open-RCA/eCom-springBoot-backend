package com.openrca.ecommerce.model;

import lombok.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

@Getter
@Setter
@Table(name = "")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    @Id
    @Column(name = "")
    private Integer adminId;

    @Column(name = "")
    private String firstName;

    @Column(name = "")
    private String secondName;

    @Column(name = "")
    private String phoneNumber;

    @Column(name = "")
    private String verification_email;

    @Column(name = "")
    private String image_url;

    @Column(name = "")
    private String password;

    @Column(name = "")
    private Integer level;

    @Column(name = "")
    private Time passwordUpdatedAt;

    @Column(name = "")
    private Time joinedAt;

}
