package com.vasanth.spring5recipewebapp.repositories;

import com.vasanth.spring5recipewebapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByUom(String uom);

}
