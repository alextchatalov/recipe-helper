package com.recipe.helper.srvreceipehelper.core

import com.recipe.helper.srvreceipehelper.core.model.Recipe

interface RecipeService {
    fun getRecipes(): List<Recipe>
    fun createRecipe(recipe: Recipe): Recipe
}
