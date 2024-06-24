package com.example.cs330_oktobar2023v2.data.local_data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cs330_oktobar2023v2.domain.model.Evidence

@Database(
    entities = [Evidence::class],
    version = 1
)
abstract class EvidenceDatabase :RoomDatabase(){

    abstract val dao: EvidenceDao

    companion object {
        const val DATABASE_NAME = "play_evidence"
    }

}