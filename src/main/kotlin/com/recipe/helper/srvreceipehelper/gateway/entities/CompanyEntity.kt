package com.recipe.helper.srvreceipehelper.gateway.entities

import com.recipe.helper.srvreceipehelper.core.model.Company
import com.recipe.helper.srvreceipehelper.core.model.Recipe
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import java.util.UUID

@Entity
class CompanyEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: UUID?,
    private val name: String,
    private val cnpj: String,
    @OneToMany
    private val recipes: List<RecipeEntity>
) {
    fun convertToCompany(): Company {
        return Company(id, name, cnpj, recipes.map { it.convertToRecipe() })
    }
}
