package com.example.cs330_oktobar2023v2.domain.use_cases

import com.example.cs330_oktobar2023v2.domain.enums.PlayCategory
import com.example.cs330_oktobar2023v2.domain.model.Evidence
import com.example.cs330_oktobar2023v2.domain.repository.EvidenceRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetEvidencesByPlayCategoryUseCase @Inject constructor(
    private val repository : EvidenceRepository
) {

    operator fun invoke(playCategory: PlayCategory): Flow<List<Evidence>>{
        return repository.getEvidenceByCategory(playCategory).map {
            it.reversed()
        }
    }

}