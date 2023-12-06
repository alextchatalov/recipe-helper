package com.recipe.helper.srvreceipehelper.core

import com.recipe.helper.srvreceipehelper.core.model.Recipe
import com.recipe.helper.srvreceipehelper.gateway.RecipeGateway
import org.springframework.stereotype.Service

@Service
class RecipeServiceImpl(val recipeGateway: RecipeGateway) : RecipeService {
    override fun getRecipes(): List<Recipe> {
        return recipeGateway.getRecipes()
    }

    override fun createRecipe(recipe: Recipe): Recipe {
        return recipeGateway.createRecipe(recipe)
    }
}
