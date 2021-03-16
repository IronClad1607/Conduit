package com.ironclad.conduit.data

import com.ironclad.api.ConduitClient
import com.ironclad.api.models.entities.LoginData
import com.ironclad.api.models.requests.LoginRequest
import com.ironclad.api.models.responses.UserResponse

object UserRepo {
    val api = ConduitClient().conduitAPI

    suspend fun login(email: String, password: String): UserResponse? {
        val request = LoginRequest(LoginData(email, password))

        val response = api.loginUser(request)

        return response.body()
    }
}