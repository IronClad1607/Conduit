package com.ironclad.api.services

import com.ironclad.api.models.ArticlesResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ConduitAPI {

    @GET("articles")
    fun getArticles(): Call<ArticlesResponse>
}