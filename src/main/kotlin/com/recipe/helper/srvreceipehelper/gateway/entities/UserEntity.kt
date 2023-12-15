package com.recipe.helper.srvreceipehelper.gateway.entities

import com.recipe.helper.srvreceipehelper.core.model.User
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToOne
import java.util.UUID


class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: UUID?,
    private val name: String,
    private val login: String,
    private val password: String,
    @OneToOne
    private val company: CompanyEntity,
)
