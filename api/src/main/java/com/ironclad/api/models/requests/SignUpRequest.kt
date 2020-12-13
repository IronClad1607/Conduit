package com.ironclad.api.models.requests


import com.ironclad.api.models.entities.UserCreds
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SignUpRequest(
    @Json(name = "user")
    val user: UserCreds
)