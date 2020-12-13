package com.ironclad.api.services

import com.ironclad.api.models.entities.UserCreds
import com.ironclad.api.models.requests.SignUpRequest
import com.ironclad.api.models.responses.ArticlesResponse
import com.ironclad.api.models.responses.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

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

}