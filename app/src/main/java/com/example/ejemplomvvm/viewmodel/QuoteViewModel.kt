package com.example.ejemplomvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ejemplomvvm.model.QuoteModel
import com.example.ejemplomvvm.model.QuoteProvider

class QuoteViewModel: ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun getRandomQuote() {
        val currentQuote:QuoteModel = QuoteProvider.cuotaAleatoria()
        quoteModel.postValue(currentQuote)
    }
}