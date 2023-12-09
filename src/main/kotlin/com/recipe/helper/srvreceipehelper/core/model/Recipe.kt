package com.recipe.helper.srvreceipehelper.core.model

import java.util.UUID

data class Recipe(
    val id: UUID?,
    val recipeName: String,
    val recipeDescription: String? = null,
    val packagingSize: Int,
    val packagingType: String
)
