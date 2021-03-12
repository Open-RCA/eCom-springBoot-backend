package com.openrca.ecommerce.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Getter
@Setter
@Table(name = "product_feedback")
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
    @Column(name = "feedback_id")
    private Long feedbackId;

    @Column(name = "product_id")
    private Integer product_id;

    @Column(name = "email")
    private String email;

    @Column(name = "best_quality")
    private Boolean bestQuality;

    @Column(name = "medium_quality")
    private Boolean mediumQuality;

    @Column(name = "low_quality")
    private Boolean lowQuality;

    @Column(name = "description")
    private String description;

    @Column(name = "addedAt")
    private Date addedAt;
}
