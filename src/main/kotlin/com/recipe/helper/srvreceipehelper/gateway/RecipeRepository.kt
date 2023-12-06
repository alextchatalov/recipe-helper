package com.recipe.helper.srvreceipehelper.gateway

import com.recipe.helper.srvreceipehelper.gateway.entities.RecipeEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface RecipeRepository : JpaRepository<RecipeEntity, UUID>
