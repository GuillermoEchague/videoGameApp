package com.example.storefilm.presentation.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.storefilm.domain.VideoGameUseCase

class ViewModelFactory(private val videoGamesUseCase: VideoGameUseCase) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(VideoGameViewModel::class.java)) {
            return VideoGameViewModel(videoGamesUseCase) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }

}