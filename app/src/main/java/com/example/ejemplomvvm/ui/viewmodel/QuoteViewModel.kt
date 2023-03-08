package com.example.ejemplomvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ejemplomvvm.data.model.QuoteModel
import com.example.ejemplomvvm.data.model.QuoteProvider
import com.example.ejemplomvvm.domain.GetQuotesUseCase
import com.example.ejemplomvvm.domain.GetRandomQuoteUseCase
import kotlinx.coroutines.launch

class QuoteViewModel: ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>()

    var getQuotesUseCase = GetQuotesUseCase()
    var getRandomQuoteUseCase = GetRandomQuoteUseCase()

    fun onCreate() {
        isLoading.postValue(true)
        viewModelScope.launch {
            val result = getQuotesUseCase()
            if (!result.isNullOrEmpty()) {
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }
    fun getRandomQuote() {
        isLoading.postValue(true)
        val quote = getRandomQuoteUseCase()
        if (quote != null) {
            quoteModel.postValue(quote)
        }
        isLoading.postValue(false)
    }
}