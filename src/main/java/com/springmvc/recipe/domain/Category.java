package com.springmvc.recipe.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripton;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;


}
