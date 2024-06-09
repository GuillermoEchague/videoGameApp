package com.example.storefilm.domain

import com.example.storefilm.data.repository.VideoGameImpl
import com.example.storefilm.data.response.VideoGameResponse

class VideoGameUseCase(private val repository: VideoGameImpl) {
    suspend fun getAllVideoGameOnStock(): MutableList<VideoGameResponse> {
        return repository.fetchVideoGames()
    }
}