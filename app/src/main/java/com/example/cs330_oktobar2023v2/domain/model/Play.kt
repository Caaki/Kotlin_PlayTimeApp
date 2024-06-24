package com.example.cs330_oktobar2023v2.domain.model


import com.example.cs330_oktobar2023v2.domain.enums.PlayCategory
data class Play(
    val id: Int,
    val name: String,
    val description: String,
    val type: PlayCategory,
    val image: Int,
    var quantity: Int
)
