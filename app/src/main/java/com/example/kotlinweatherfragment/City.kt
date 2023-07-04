package com.example.kotlinweatherfragment

import java.io.Serializable

data class City(
    val name: String,
    val imageUrl: String
) : Serializable