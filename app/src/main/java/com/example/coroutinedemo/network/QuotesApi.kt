package com.example.coroutinedemo.network

import com.example.coroutinedemo.model.HomeModel
import retrofit2.Response
import retrofit2.http.GET

interface QuotesApi {

    @GET("home")
    suspend fun getHomeImages(): Response<HomeModel>

}