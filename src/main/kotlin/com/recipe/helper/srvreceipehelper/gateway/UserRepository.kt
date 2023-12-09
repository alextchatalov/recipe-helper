package com.recipe.helper.srvreceipehelper.gateway

import com.recipe.helper.srvreceipehelper.gateway.entities.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserRepository : JpaRepository<UserEntity, UUID>
