package com.vasanth.spring5recipewebapp.controllers;

import com.vasanth.spring5recipewebapp.domain.Category;
import com.vasanth.spring5recipewebapp.domain.UnitOfMeasure;
import com.vasanth.spring5recipewebapp.repositories.CategoryRepository;
import com.vasanth.spring5recipewebapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }



    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByUom("Teaspoon");

        System.out.println("cat id is: "+categoryOptional.get().getId());
        System.out.println("uom id is: "+unitOfMeasure.get().getId());

        return "index";
    }

}
