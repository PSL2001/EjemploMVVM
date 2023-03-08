package com.example.ejemplomvvm.model

class QuoteProvider {
    companion object {

        fun cuotaAleatoria(): QuoteModel {
            val random = (0..14).random()
            return quote[random]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel("Cuota de ejemplo", "Autor 1"),
            QuoteModel("Cuota de ejemplo 2", "Autor 2"),
            QuoteModel("Cuota de ejemplo 3", "Autor 3"),
            QuoteModel("Cuota de ejemplo 4", "Autor 4"),
            QuoteModel("Cuota de ejemplo 5", "Autor 5"),
            QuoteModel("Cuota de ejemplo 6", "Autor 6"),
            QuoteModel("Cuota de ejemplo 7", "Autor 7"),
            QuoteModel("Cuota de ejemplo 8", "Autor 8"),
            QuoteModel("Cuota de ejemplo 9", "Autor 9"),
            QuoteModel("Cuota de ejemplo 10", "Autor 10"),
            QuoteModel("Cuota de ejemplo 11", "Autor 11"),
            QuoteModel("Cuota de ejemplo 12", "Autor 12"),
            QuoteModel("Cuota de ejemplo 13", "Autor 13"),
            QuoteModel("Cuota de ejemplo 14", "Autor 14"),
            QuoteModel("Cuota de ejemplo 15", "Autor 15"),
        )
    }
}