package com.springmvc.recipe.repositories;

import com.springmvc.recipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasurementRepository extends CrudRepository<UnitOfMeasure, Long> {
}
