package com.springframework.services;

import com.springframework.commands.RecipeCommand;
import com.springframework.model.Recipe;

import java.util.Set;

/**
 * @author <a href="pulkit.aggarwal@upgrad.com">Pulkit Aggarwal</a>
 * @version 1.0
 * @since 14/09/21
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand findCommandById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);
    void deleteById(Long idToDelete);
}
