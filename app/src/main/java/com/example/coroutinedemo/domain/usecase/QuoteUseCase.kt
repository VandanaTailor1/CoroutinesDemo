package com.example.coroutinedemo.domain.usecase

import android.content.res.Resources
import com.example.coroutinedemo.domain.model.HomeModel
import com.example.coroutinedemo.domain.repositry.QuoteRepositry
import com.example.coroutinedemo.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

import javax.inject.Inject

class QuoteUseCase @Inject constructor(private val quoteRepositry: QuoteRepositry) {

    operator fun invoke() : Flow<Resource<HomeModel>> = flow {
        emit(Resource.loading())
        emit(Resource.success(quoteRepositry.getHomeImagesData()))

    }.catch {
        emit(Resource.failed(it.message.toString()))
    }
}