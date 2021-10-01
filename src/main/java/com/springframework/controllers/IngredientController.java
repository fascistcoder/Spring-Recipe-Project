package com.springframework.controllers;

import com.springframework.services.IngredientService;
import com.springframework.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author <a href="pulkit.aggarwal@upgrad.com">Pulkit Aggarwal</a>
 * @version 1.0
 * @since 29/09/21
 */
@Slf4j
@Controller
public class IngredientController {
    public final RecipeService recipeService;
    public final IngredientService ingredientService;

    public IngredientController(RecipeService recipeService, IngredientService ingredientService) {
        this.recipeService = recipeService;
        this.ingredientService = ingredientService;
    }

    @GetMapping
    @RequestMapping("/recipe/{recipeId}/ingredients")
    public String listIngredients(@PathVariable String recipeId, Model model){
        log.debug("getting ingredient list for recipe id: " + recipeId);
        model.addAttribute("recipe", recipeService.findCommandById(Long.valueOf(recipeId)));
        return "recipe/ingredient/list";
    }

    @GetMapping
    @RequestMapping("recipe/{recipeid}/ingredient/{id}/show")
    public String showRecipeIngredient(@PathVariable String recipeid, @PathVariable String id, Model model){
        model.addAttribute("ingredient", ingredientService.findByRecipeAndIngredientId(Long.valueOf(recipeid), Long.valueOf(id)));
        return "recipe/ingredient/show";
    }
}