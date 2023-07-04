package com.example.kotlinweatherfragment.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("weather")
    fun loadWeather(
        @Query("q") name: String,
        @Query("appid") apiKey: String
    ): Call<WeatherOfCity>
}