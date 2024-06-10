package com.example.storefilm.data.response

import com.google.gson.annotations.SerializedName
import org.junit.Assert.*
import org.junit.Test


data class VideoGameResponse(
    val id: Long,
    val name: String,
    val released: String,
    @SerializedName("background_image")
    val backgroundImage: String,
    val rating: Double,
    val metacritic: Long
)

class VideoGameResponseTest {

    @Test
    fun testVideoGameResponseCreation() {
        val id = 1L
        val name = "The Legend of Zelda: Breath of the Wild"
        val released = "2017-03-03"
        val backgroundImage = "https://example.com/image.jpg"
        val rating = 4.9
        val metacritic = 97L

        val videoGameResponse = VideoGameResponse(
            id = id,
            name = name,
            released = released,
            backgroundImage = backgroundImage,
            rating = rating,
            metacritic = metacritic
        )

        assertEquals(id, videoGameResponse.id)
        assertEquals(name, videoGameResponse.name)
        assertEquals(released, videoGameResponse.released)
        assertEquals(backgroundImage, videoGameResponse.backgroundImage)
        assertEquals(rating, videoGameResponse.rating, 0.0)
        assertEquals(metacritic, videoGameResponse.metacritic)
    }

    @Test
    fun testVideoGameResponseDefaultValues() {
        val videoGameResponse = VideoGameResponse(
            id = 0L,
            name = "",
            released = "",
            backgroundImage = "",
            rating = 0.0,
            metacritic = 0L
        )

        assertEquals(0L, videoGameResponse.id)
        assertEquals("", videoGameResponse.name)
        assertEquals("", videoGameResponse.released)
        assertEquals("", videoGameResponse.backgroundImage)
        assertEquals(0.0, videoGameResponse.rating, 0.0)
        assertEquals(0L, videoGameResponse.metacritic)
    }
}