package com.example.storefilm.data.repository

import com.example.storefilm.data.response.VideoGameResponse

interface VideoGameRepository {
    suspend fun fetchVideoGames(): MutableList<VideoGameResponse>
}