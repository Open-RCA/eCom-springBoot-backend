package com.openrca.ecommerce.model;

import lombok.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@Table(name = "")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    //Constructor without Id
    public Admin(String firstName, String secondName, String phoneNumber, String verification_email, String image_url, String password, Integer level, Date passwordUpdatedAt, Date joinedAt) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.verification_email = verification_email;
        this.image_url = image_url;
        this.password = password;
        this.level = level;
        this.passwordUpdatedAt = passwordUpdatedAt;
        this.joinedAt = joinedAt;
    }


    @Id
    @Column(name = "")
    private Long adminId;

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
    private Date passwordUpdatedAt;

    @Column(name = "")
    private Date joinedAt;

}
