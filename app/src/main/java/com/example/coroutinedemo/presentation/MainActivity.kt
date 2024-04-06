package com.example.coroutinedemo.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import com.example.coroutinedemo.R
import com.example.coroutinedemo.data.QuotesApi
import com.example.coroutinedemo.network.RetrofitHelper
import com.example.coroutinedemo.presentation.viewmodel.QuoteViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import androidx.lifecycle.lifecycleScope
import com.example.coroutinedemo.util.Resource

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val quoteViewModel : QuoteViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getData()
    }

    private fun getData() {
        quoteViewModel.fatchHomeData()

        lifecycleScope.launch {
            quoteViewModel.homepage.collect{
                when(it){
                    is Resource.Loading -> {
                        Toast.makeText(this@MainActivity, "Loading", Toast.LENGTH_SHORT).show();
                    }
                    is Resource.Success -> {
                        Toast.makeText(this@MainActivity, "Success" + it.data, Toast.LENGTH_SHORT)
                            .show();
                    }
                    is Resource.Failed -> {
                        Toast.makeText(this@MainActivity, "Failed" + it.message, Toast.LENGTH_SHORT)
                            .show();
                    }
                }
            }
        }
    }
}