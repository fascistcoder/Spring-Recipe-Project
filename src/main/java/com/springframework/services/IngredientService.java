package com.springframework.services;

import com.springframework.commands.IngredientCommand;

/**
 * @author <a href="pulkit.aggarwal@upgrad.com">Pulkit Aggarwal</a>
 * @version 1.0
 * @since 30/09/21
 */
public interface IngredientService {
    IngredientCommand findByRecipeAndIngredientId(Long recipeId, Long ingredientId);
    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
