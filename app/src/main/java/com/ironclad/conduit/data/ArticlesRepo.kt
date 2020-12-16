package com.ironclad.conduit.data

import com.ironclad.api.ConduitClient

object ArticlesRepo {
    val api = ConduitClient().conduitAPI

    suspend fun getGlobalFeed() = api.getArticles()
}