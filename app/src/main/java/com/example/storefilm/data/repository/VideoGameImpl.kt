package com.example.storefilm.data.repository

import com.example.storefilm.data.network.api.VideoGameServices
import com.example.storefilm.data.response.VideoGameResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class VideoGameImpl(private var apiservice: VideoGameServices): VideoGameRepository {
    override suspend fun fetchVideoGames(): MutableList<VideoGameResponse> {
        return withContext(Dispatchers.IO){
            val listVideoGames = apiservice.getAllVideoGames()
            listVideoGames
        }
    }
}