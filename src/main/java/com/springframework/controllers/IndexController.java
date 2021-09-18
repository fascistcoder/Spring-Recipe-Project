package com.springframework.controllers;

import com.springframework.model.Category;
import com.springframework.model.UnitOfMeasure;
import com.springframework.repositories.CategoryRepository;
import com.springframework.repositories.UnitOfMeasureRepository;
import com.springframework.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @author <a href="pulkit.aggarwal@upgrad.com">Pulkit Aggarwal</a>
 * @version 1.0
 * @since 08/09/21
 */
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Index page");
        model.addAttribute("recipes",recipeService.getRecipes());
        return "Index";
    }
}
