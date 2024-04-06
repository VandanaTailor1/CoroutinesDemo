package com.example.coroutinedemo.data

import com.example.coroutinedemo.domain.model.HomeModel
import retrofit2.Response
import retrofit2.http.GET

interface QuotesApi {
    @GET("home")
    suspend fun getHomeImages(): HomeModel

}