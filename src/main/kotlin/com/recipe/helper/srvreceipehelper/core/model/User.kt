package com.recipe.helper.srvreceipehelper.core.model

import java.util.UUID

data class User(
    private val id: UUID?,
    val name: String,
    val login: String,
    val password: String,
    val company: Company
)
