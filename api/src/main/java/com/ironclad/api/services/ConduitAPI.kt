package com.ironclad.api.services

import com.ironclad.api.models.ArticlesResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ConduitAPI {

    @GET("articles")
    suspend fun getArticles(
        @Query("author") author: String? = null,
        @Query("favourited") favourited: String? = null,
        @Query("tag") tag: String? = null
    ): Response<ArticlesResponse>


}