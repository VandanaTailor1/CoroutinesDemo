package com.example.coroutinedemo.di

import com.example.coroutinedemo.data.QuotesApi
import com.example.coroutinedemo.data.repositry.QuoteRepositryImp
import com.example.coroutinedemo.domain.repositry.QuoteRepositry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {


    @Provides
    fun provideBaseUrl(): String = "https://mehndibook.officialapp.in/index.php/api/v1/"

    @Provides
    @Singleton
    fun provideRetrofitHelper(baseUrl : String) : Retrofit=
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    fun provideApiService(retrofit: Retrofit) : QuotesApi=
        retrofit.create(QuotesApi::class.java)

    @Provides
    @Singleton
        fun provideQuoteImpRepo(quotesApi: QuotesApi) : QuoteRepositry=QuoteRepositryImp(quotesApi)

}