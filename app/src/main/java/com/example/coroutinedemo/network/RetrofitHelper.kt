package com.example.coroutinedemo.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

       fun getInstance () : Retrofit{

            return Retrofit.Builder()
                .baseUrl("https://mehndibook.officialapp.in/index.php/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

       }
}
