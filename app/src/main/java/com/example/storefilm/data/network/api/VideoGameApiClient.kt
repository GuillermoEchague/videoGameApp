package com.example.storefilm.data.network.api

import com.example.storefilm.data.network.retrofit.RetrofitHelper
import com.example.storefilm.data.response.VideoGameResponse

class VideoGameApiClient {
    private val retrofit = RetrofitHelper.getRetrofit()
    suspend fun getVideoGames(): MutableList<VideoGameResponse>{
        val response = retrofit.create(VideoGameServices::class.java).getAllVideoGames()
        return response
    }
}