package com.ironclad.api.services

import com.ironclad.api.models.requests.LoginRequest
import com.ironclad.api.models.requests.SignUpRequest
import com.ironclad.api.models.responses.ArticleResponse
import com.ironclad.api.models.responses.ArticlesResponse
import com.ironclad.api.models.responses.TagsResponse
import com.ironclad.api.models.responses.UserResponse
import retrofit2.Response
import retrofit2.http.*

interface ConduitAPI {

    @GET("articles")
    suspend fun getArticles(
        @Query("author") author: String? = null,
        @Query("favourited") favourited: String? = null,
        @Query("tag") tag: String? = null
    ): Response<ArticlesResponse>

    @POST("users")
    suspend fun signUpUser(
        @Body userCreds: SignUpRequest
    ): Response<UserResponse>

    @POST("users/login")
    suspend fun loginUser(
        @Body userCreds: LoginRequest
    ): Response<UserResponse>

    @GET("tags")
    suspend fun getTags(): Response<TagsResponse>

    @GET("articles/{slug}")
    suspend fun getArticlesBySlugs(
        @Path("slug") slug: String
    ): Response<ArticleResponse>

}