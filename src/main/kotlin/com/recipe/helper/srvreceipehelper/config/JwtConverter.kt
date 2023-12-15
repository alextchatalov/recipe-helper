package com.recipe.helper.srvreceipehelper.config

import org.springframework.core.convert.converter.Converter
import org.springframework.security.authentication.AbstractAuthenticationToken
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.oauth2.jwt.Jwt
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken

class JwtConverter: Converter<Jwt, AbstractAuthenticationToken> {
    override fun convert(jwt: Jwt): AbstractAuthenticationToken {
        val realmAccess: Map<String, Collection<String>> = jwt.getClaim("realm_access")
        val roles = realmAccess["roles"]!!
        val grants = roles
            .stream()
            .map { role: String ->
                SimpleGrantedAuthority(
                    "ROLE_$role"
                )
            }.toList()


        return JwtAuthenticationToken(jwt, grants)
    }
}