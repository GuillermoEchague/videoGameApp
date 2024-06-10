package com.example.storefilm.presentation.ui.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.storefilm.data.network.api.VideoGameServices
import com.example.storefilm.data.network.retrofit.RetrofitHelper
import com.example.storefilm.data.repository.VideoGameImpl
import com.example.storefilm.databinding.ActivityMainBinding
import com.example.storefilm.domain.VideoGameUseCase
import com.example.storefilm.presentation.ui.viewmodel.VideoGameViewModel
import com.example.storefilm.presentation.ui.viewmodel.ViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val apiService = RetrofitHelper.getRetrofit().create(VideoGameServices::class.java)
        val repository = VideoGameImpl(apiService)
        val usecase = VideoGameUseCase(repository)
        val viewModelFactory = ViewModelFactory(usecase)
        val viewModel =
            ViewModelProvider(this, viewModelFactory)[VideoGameViewModel::class.java]

        viewModel.videoGamesLv.observe(this) {
            Log.i("Games", it.toString())
        }
    }
}