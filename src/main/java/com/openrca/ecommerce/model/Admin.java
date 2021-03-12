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
@Table(name = "admin")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    //Constructor without Id


    public Admin(String firstName, String secondName, String phoneNumber, String verification_email, String image_url, String username, String password, Integer level, Date passwordUpdatedAt, Date joinedAt) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.verification_email = verification_email;
        this.image_url = image_url;
        this.username = username;
        this.password = password;
        this.level = level;
        this.passwordUpdatedAt = passwordUpdatedAt;
        this.joinedAt = joinedAt;
    }

    @Id
    @Column(name = "admin_id")
    private Long adminId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "verification_email")
    private String verification_email;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "level")
    private Integer level;

    @Column(name = "password_updated_at")
    private Date passwordUpdatedAt;

    @Column(name = "joined_at")
    private Date joinedAt;

}
