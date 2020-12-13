package com.ironclad.api.models.responses


import com.ironclad.api.models.entities.Comment
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CommentResponse(
    @Json(name = "comment")
    val comment: Comment
)