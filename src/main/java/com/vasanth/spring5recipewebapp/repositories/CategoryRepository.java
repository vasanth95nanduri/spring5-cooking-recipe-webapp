package com.vasanth.spring5recipewebapp.repositories;

import com.vasanth.spring5recipewebapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
