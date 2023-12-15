package com.recipe.helper.srvreceipehelper.entrypoint.auth

import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.util.LinkedMultiValueMap
import org.springframework.util.MultiValueMap
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RequestMapping("/token")
@RestController
class TokenRest {

    @PostMapping("/")
    fun token(@RequestBody user: User): ResponseEntity<String> {
        val headers = HttpHeaders()
        val restTemplate = RestTemplate()
        val formData = LinkedMultiValueMap<String, String>()

        headers.contentType = MediaType.APPLICATION_FORM_URLENCODED;

        formData.add("client_id", user.clientId)
        formData.add("username", user.userName)
        formData.add("password", user.password)
        formData.add("grant_type", user.grantType)

        val httpEntity = HttpEntity<MultiValueMap<String, String>>(formData, headers)
        return restTemplate.postForEntity("http://localhost:8089/realms/recipehelper/protocol/openid-connect/token", httpEntity,
            String::class.java
        )
    }

    data class User(
        val password: String,
        val clientId: String,
        val grantType: String,
        val userName: String
    )
}