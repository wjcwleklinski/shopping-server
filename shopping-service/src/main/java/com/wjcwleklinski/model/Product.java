package com.wjcwleklinski.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.UtilityClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
@Getter
@Setter
public class Product {

    @UtilityClass
    public class Priority {
        public final String HIGH = "H";
        public final String MODERATE = "M";
        public final String LOW = "L";
    }

    @Id
    @Column(name = "PRD_ID")
    private Long id;

    @Column(name = "PRD_CODE")
    private String code;

    @Column(name = "PRD_PRIORITY")
    private String priority;

    @Column(name = "PRD_DESCRIPTION")
    private String description;

    @Column(name = "PRD_IMAGE")
    private String image;
}
