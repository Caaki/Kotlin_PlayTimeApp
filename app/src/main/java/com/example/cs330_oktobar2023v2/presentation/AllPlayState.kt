package com.example.cs330_oktobar2023v2.presentation

import com.example.cs330_oktobar2023v2.domain.model.Play

data class AllPlayState(
    val playItems: List<Play> = emptyList()
)