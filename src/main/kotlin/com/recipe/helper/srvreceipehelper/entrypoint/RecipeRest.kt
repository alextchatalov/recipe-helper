package com.recipe.helper.srvreceipehelper.entrypoint

import com.recipe.helper.srvreceipehelper.core.RecipeService
import com.recipe.helper.srvreceipehelper.core.model.Recipe
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RecipeRest(val recipeService: RecipeService) {

    @GetMapping("/recipes/")
    @PreAuthorize("hasRole('USER')")
    fun getRecipes(): List<Recipe> {
        return recipeService.getRecipes()
    }

    @PostMapping("/recipe/")
    @PreAuthorize("hasRole('ADMIN')")
    fun createRecipe(@RequestBody test: Recipe): Recipe {
        return recipeService.createRecipe(test)
    }
}
