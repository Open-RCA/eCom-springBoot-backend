package com.openrca.ecommerce.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Getter
@Setter
@Table(name = "")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductFeedback {
    //Constructor without Id
    public ProductFeedback(Integer product_id, String email, Boolean bestQuality, Boolean mediumQuality, Boolean lowQuality, String description, Date addedAt) {
        this.product_id = product_id;
        this.email = email;
        this.bestQuality = bestQuality;
        this.mediumQuality = mediumQuality;
        this.lowQuality = lowQuality;
        this.description = description;
        this.addedAt = addedAt;
    }

    @Id
    @Column(name = "")
    private Long feedbackId;

    @Column(name = "")
    private Integer product_id;

    @Column(name = "")
    private String email;

    @Column(name = "")
    private Boolean bestQuality;

    @Column(name = "")
    private Boolean mediumQuality;

    @Column(name = "")
    private Boolean lowQuality;

    @Column(name = "")
    private String description;

    @Column(name = "")
    private Date addedAt;
}
