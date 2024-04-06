package com.example.coroutinedemo.domain.repositry

import com.example.coroutinedemo.data.QuotesApi
import com.example.coroutinedemo.domain.model.HomeModel
import okhttp3.Response

interface QuoteRepositry  {
     suspend fun getHomeImagesData () : HomeModel
 }
