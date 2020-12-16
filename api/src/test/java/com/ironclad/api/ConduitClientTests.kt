package com.ironclad.api

import com.ironclad.api.models.entities.UserCreds
import com.ironclad.api.models.requests.SignUpRequest
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import kotlin.random.Random

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

    @Test
    fun `POST user - sign up`(){
        val userCreds = UserCreds(
            email = "testemail${Random.nextInt(999,9999)}@test.com",
            password = "pass${Random.nextInt(9999,99999)}",
            username = "rand_user_${Random.nextInt(99,9999)}"
        )

        runBlocking {
            val resp = conduitClient.conduitAPI.signUpUser(SignUpRequest(userCreds))
            assertEquals(userCreds.username,resp.body()?.user?.username)
        }
    }
}