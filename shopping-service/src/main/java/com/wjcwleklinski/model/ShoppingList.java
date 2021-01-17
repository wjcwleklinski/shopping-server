package com.wjcwleklinski.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SHOPPING_LIST")
@Getter
@Setter
public class ShoppingList {

    @Id
    @Column(name = "SPL_ID")
    private Long id;

    @Column(name = "SPL_CODE")
    private String code;

    @OneToOne
    private AuditInfo auditInfo;

    @Column(name = "SPL_NAME")
    private String name;

    @Column(name = "SPL_DESCRIPTION")
    private String description;

    @OneToMany
    private List<Product> products;

    @Column(name = "SPL_IMAGE")
    private String image;
}
