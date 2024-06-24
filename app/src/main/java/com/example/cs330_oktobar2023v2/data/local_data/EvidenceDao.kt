package com.example.cs330_oktobar2023v2.data.local_data

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.example.cs330_oktobar2023v2.domain.enums.PlayCategory
import com.example.cs330_oktobar2023v2.domain.model.Evidence
import kotlinx.coroutines.flow.Flow

@Dao
interface EvidenceDao {

    @Upsert
    suspend fun upsertEvidence(evidence: Evidence)

    @Query("SELECT * FROM evidence WHERE kategorija = :kategorija")
    fun getEvidenceByCategory(kategorija : PlayCategory): Flow<List<Evidence>>

}