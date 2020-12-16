package com.ironclad.api.services

import com.ironclad.api.models.responses.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT

interface ConduitAuthAPI {

    @GET
    suspend fun getCurrentUser(): Response<UserResponse>

    @PUT
    suspend fun updateCurrentUser(
        @Body userUpdateRequest :
    )


}