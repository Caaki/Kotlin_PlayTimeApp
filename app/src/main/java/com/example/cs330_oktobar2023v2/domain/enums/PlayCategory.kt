package com.example.cs330_oktobar2023v2.domain.enums

import com.example.cs330_oktobar2023v2.R

enum class PlayCategory{
    OUTDOOR,
    TABLET,
    LEGO,
    PUZZLE,
    CRAYONS,
    DOLLS,
    CARS,
    OTHER;

    fun image(): Int {
        return when(this){
            OUTDOOR -> R.drawable.outdoors
            TABLET -> R.drawable.ipad
            LEGO -> R.drawable.lego
            PUZZLE -> R.drawable.puzzle
            CRAYONS -> R.drawable.crayons
            DOLLS -> R.drawable.dolls
            CARS -> R.drawable.cars
            OTHER -> R.drawable.other
        }
    }
}