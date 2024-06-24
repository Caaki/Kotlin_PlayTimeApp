package com.example.cs330_oktobar2023v2.domain.repository

import com.example.cs330_oktobar2023v2.domain.enums.PlayCategory
import com.example.cs330_oktobar2023v2.domain.model.Evidence
import kotlinx.coroutines.flow.Flow

public interface EvidenceRepository {

    suspend fun upsertEvidence(evidence: Evidence)

    //suspend fun getEvidenceById(evidence: Evidence) : Evidence?

    fun getEvidenceByCategory(playCategory: PlayCategory): Flow<List<Evidence>>
}