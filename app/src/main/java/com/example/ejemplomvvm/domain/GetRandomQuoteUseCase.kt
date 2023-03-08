package com.example.ejemplomvvm.domain

import com.example.ejemplomvvm.data.QuoteRepository
import com.example.ejemplomvvm.data.model.QuoteModel
import com.example.ejemplomvvm.data.model.QuoteProvider

class GetRandomQuoteUseCase {
    private val repository = QuoteRepository()

    operator fun invoke(): QuoteModel? {
        val quotes = QuoteProvider.quotes
        return if (!quotes.isNullOrEmpty()) {
            val random = (quotes.indices).random()
            quotes[random]
        } else {
            null
        }
    }
}