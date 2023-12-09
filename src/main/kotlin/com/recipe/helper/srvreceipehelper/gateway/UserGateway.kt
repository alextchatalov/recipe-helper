package com.recipe.helper.srvreceipehelper.gateway

import com.recipe.helper.srvreceipehelper.core.model.User
import java.util.UUID

interface UserGateway {
    fun getUserBy(id: UUID): User
    fun createUser(user: User): User
}
