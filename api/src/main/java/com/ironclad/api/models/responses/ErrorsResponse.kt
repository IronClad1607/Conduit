package com.ironclad.api.models.responses


import com.ironclad.api.models.entities.Errors
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ErrorsResponse(
    @Json(name = "errors")
    val errors: Errors
)