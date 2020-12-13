package com.ironclad.api

import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertNotNull
import org.junit.Test

class ConduitClientTests {

    private val conduitClient = ConduitClient()

    @Test
    fun `GET articles`() {
        runBlocking {
            val articles = conduitClient.conduitAPI.getArticles()
            assertNotNull(articles.body()?.articles)
        }
    }

    @Test
    fun `GET articles by author`() {
        runBlocking {
            val articles = conduitClient.conduitAPI.getArticles(author = "444")
            assertNotNull(articles.body()?.articles)
        }
    }

    @Test
    fun `GET articles by tags`() {
        runBlocking {
            val articles = conduitClient.conduitAPI.getArticles(tag = "dragons")
            assertNotNull(articles.body()?.articles)
        }
    }
}