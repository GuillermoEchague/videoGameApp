package com.example.storefilm.presentation.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.storefilm.data.response.VideoGameResponse
import com.example.storefilm.domain.VideoGameUseCase
import kotlinx.coroutines.launch

class VideoGameViewModel(private val useCase: VideoGameUseCase) : ViewModel() {
    private var videoGameList = MutableLiveData<MutableList<VideoGameResponse>>()
    val videoGamesLv
        get() = videoGameList

    init {
        viewModelScope.launch {
            videoGameList.value = useCase.getAllVideoGameOnStock()
        }
    }
}