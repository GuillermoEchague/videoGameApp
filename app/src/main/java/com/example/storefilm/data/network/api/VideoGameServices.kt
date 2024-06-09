package com.example.storefilm.data.network.api

import com.example.storefilm.data.response.VideoGameResponse
import retrofit2.http.GET

interface VideoGameServices {
    @GET("games")
    suspend fun getAllVideoGames(): MutableList<VideoGameResponse>
}