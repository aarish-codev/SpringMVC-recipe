package com.springmvc.recipe.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingridients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;
//    private UnitofMeasure uom;

    @ManyToOne
    private Recipe recipe;

}
