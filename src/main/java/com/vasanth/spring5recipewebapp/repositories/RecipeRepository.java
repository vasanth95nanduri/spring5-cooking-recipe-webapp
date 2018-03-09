package com.vasanth.spring5recipewebapp.repositories;

import com.vasanth.spring5recipewebapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {



}
