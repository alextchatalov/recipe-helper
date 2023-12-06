package com.recipe.helper.srvreceipehelper.gateway

import com.recipe.helper.srvreceipehelper.core.model.Recipe

interface RecipeGateway {
    fun getRecipes(): List<Recipe>
    fun createRecipe(recipe: Recipe): Recipe
}
