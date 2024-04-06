package com.example.coroutinedemo.data.repositry

import com.example.coroutinedemo.data.QuotesApi
import com.example.coroutinedemo.domain.model.HomeModel
import com.example.coroutinedemo.domain.repositry.QuoteRepositry
import retrofit2.Response
import javax.inject.Inject

class QuoteRepositryImp @Inject constructor(private val quotesApi: QuotesApi) :QuoteRepositry {

    override suspend fun getHomeImagesData(): HomeModel {
       return quotesApi.getHomeImages()
    }
}