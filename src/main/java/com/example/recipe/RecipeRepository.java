package com.example.recipe;

import java.util.List;

import com.example.recipe.Recipe;

public interface RecipeRepository {

    List<Recipe> getRecipes();

    Recipe getRecipeById(int recipeId);

    Recipe addRecipe(Recipe recipe);

    Recipe updateRecipe(int recipeId, Recipe recipe);

    void deleteRecipe(int recipeId);
}