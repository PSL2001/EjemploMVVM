package com.example.ejemplomvvm.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import com.example.ejemplomvvm.databinding.ActivityMainBinding
import com.example.ejemplomvvm.ui.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.onCreate()

        quoteViewModel.quoteModel.observe(this, Observer { cuota ->
            binding.tvQuote.text = cuota?.quote
            binding.tvAuthor.text = cuota?.author
        })
        quoteViewModel.isLoading.observe(this, Observer {
            binding.progressBar.isVisible = it
        })

        binding.viewContainer.setOnClickListener {
            quoteViewModel.getRandomQuote()
        }
    }
}