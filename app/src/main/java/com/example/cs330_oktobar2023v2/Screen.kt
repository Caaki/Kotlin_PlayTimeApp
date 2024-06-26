package com.example.cs330_oktobar2023v2

sealed class Screen(var route :String) {

    object AllPlayScreen: Screen("all_play_screen")

}