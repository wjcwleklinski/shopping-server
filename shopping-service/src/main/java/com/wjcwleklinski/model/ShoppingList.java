package com.wjcwleklinski.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SHOPPING_LIST")
@Getter
@Setter
public class ShoppingList extends AuditableEntity {

    private Long id;

    private String code;

    private String name;

    private Long authorId;


}
