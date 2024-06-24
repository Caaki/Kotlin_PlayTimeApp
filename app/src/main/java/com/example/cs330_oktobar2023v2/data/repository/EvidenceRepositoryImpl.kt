package com.example.cs330_oktobar2023v2.data.repository

import com.example.cs330_oktobar2023v2.data.local_data.EvidenceDao
import com.example.cs330_oktobar2023v2.domain.enums.PlayCategory
import com.example.cs330_oktobar2023v2.domain.model.Evidence
import com.example.cs330_oktobar2023v2.domain.repository.EvidenceRepository
import kotlinx.coroutines.flow.Flow

class EvidenceRepositoryImpl (
    private val dao: EvidenceDao
):EvidenceRepository{
    override suspend fun upsertEvidence(evidence: Evidence) {
       dao.upsertEvidence(evidence)
    }

    override fun getEvidenceByCategory(playCategory: PlayCategory): Flow<List<Evidence>> {
        return dao.getEvidenceByCategory(playCategory)
    }
}