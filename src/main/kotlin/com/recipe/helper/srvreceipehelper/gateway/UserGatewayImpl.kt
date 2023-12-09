package com.recipe.helper.srvreceipehelper.gateway

import com.recipe.helper.srvreceipehelper.core.model.Company
import com.recipe.helper.srvreceipehelper.core.model.User
import com.recipe.helper.srvreceipehelper.gateway.entities.CompanyEntity
import com.recipe.helper.srvreceipehelper.gateway.entities.UserEntity
import org.springframework.stereotype.Controller
import java.util.*

@Controller
class UserGatewayImpl(val userRepository: UserRepository) : UserGateway {
    override fun getUserBy(id: UUID): User{
        val user = userRepository.findById(id)
        if (user.isPresent) {
            throw Exception("User $id not found")
        }
        return user.get().convertToUser()
    }

    override fun createUser(user: User): User {
        CompanyEntity(null, user.company.name, user.company.cnpj

        )
        UserEntity(null, user.name, user.login, user.password, user.company)
    }

}
