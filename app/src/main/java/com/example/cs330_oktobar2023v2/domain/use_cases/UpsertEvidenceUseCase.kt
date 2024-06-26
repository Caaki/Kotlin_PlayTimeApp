package com.example.cs330_oktobar2023v2.domain.use_cases

import com.example.cs330_oktobar2023v2.domain.model.Evidence
import com.example.cs330_oktobar2023v2.domain.repository.EvidenceRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UpsertEvidence@Inject constructor(
    private val repository : EvidenceRepository
) {

    suspend operator fun invoke(evidence: Evidence) {
        repository.upsertEvidence(evidence)
    }

}