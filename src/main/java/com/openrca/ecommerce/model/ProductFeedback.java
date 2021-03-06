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
@NoArgsConstructor
@AllArgsConstructor
public class ProductFeedback {

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
}
