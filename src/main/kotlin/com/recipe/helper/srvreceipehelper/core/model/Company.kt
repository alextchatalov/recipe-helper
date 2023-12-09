package com.recipe.helper.srvreceipehelper.core.model

import java.util.UUID

data class Company(
    val id: UUID?,
    val name: String,
    val cnpj: String,
    val recipes: List<Recipe>
)
