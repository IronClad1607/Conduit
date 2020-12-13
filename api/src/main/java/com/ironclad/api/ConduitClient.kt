package com.ironclad.api

import com.ironclad.api.services.ConduitAPI
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

class ConduitClient {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://conduit.productionready.io/api/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val conduitAPI = retrofit.create(ConduitAPI::class.java)
}