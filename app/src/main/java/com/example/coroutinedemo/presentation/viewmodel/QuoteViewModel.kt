package com.example.coroutinedemo.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.coroutinedemo.domain.model.HomeModel
import com.example.coroutinedemo.domain.usecase.QuoteUseCase
import com.example.coroutinedemo.util.Resource
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuoteViewModel @Inject constructor(private val quoteUseCase: QuoteUseCase) : ViewModel()
{

    private var quote = MutableStateFlow<Resource<HomeModel>>(Resource.loading())
    val homepage : StateFlow<Resource<HomeModel>> = quote

    fun fatchHomeData(){
        viewModelScope.launch {
             quoteUseCase.invoke().collect{
                 quote.value=it
             }
        }
    }

}