package com.recipe.helper.srvreceipehelper.gateway

import com.recipe.helper.srvreceipehelper.core.model.Recipe
import com.recipe.helper.srvreceipehelper.gateway.entities.RecipeEntity
import org.springframework.stereotype.Controller

@Controller
class RecipeGatewayImpl(val recipeRepository: RecipeRepository) : RecipeGateway {
    override fun getRecipes(): List<Recipe> {
        return recipeRepository.findAll().map { it.convertToRecipe() }
    }

    override fun createRecipe(recipe: Recipe): Recipe {
        val entity = RecipeEntity(
            null,
            recipeName = recipe.recipeName,
            recipeDescription = recipe.recipeDescription,
            packagingSize = recipe.packagingSize,
            packagingType = recipe.packagingType
        )
        return recipeRepository.save(entity).convertToRecipe()
    }
}
