package com.example.cs330_oktobar2023v2.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cs330_oktobar2023v2.domain.enums.PlayCategory
import java.time.LocalDateTime

@Entity
data class Evidence(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    val naziv: String,
    val komentar: String,
    val kategorija: PlayCategory,
    val vreme: Int,
    val datum: LocalDateTime,
)
