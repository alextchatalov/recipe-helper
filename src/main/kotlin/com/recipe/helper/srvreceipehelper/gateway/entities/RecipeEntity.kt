package com.recipe.helper.srvreceipehelper.gateway.entities

import com.recipe.helper.srvreceipehelper.core.model.Recipe
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import java.util.UUID

@Entity
class RecipeEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: UUID?,
    private val recipeName: String,
    private val recipeDescription: String? = null,
    private val packagingSize: Int,
    private val packagingType: String,
    @ManyToOne
    private val company: CompanyEntity? = null
) {
    fun convertToRecipe(): Recipe {
        return Recipe(id, recipeName, recipeDescription, packagingSize, packagingType)
    }
}
