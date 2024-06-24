package com.example.cs330_oktobar2023v2.presentation

import androidx.lifecycle.ViewModel
import com.example.cs330_oktobar2023v2.domain.use_cases.GetEvidencesByPlayCategory
import com.example.cs330_oktobar2023v2.domain.use_cases.UpsertEvidence
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AllPlayViewModel @Inject constructor (
    private val getEvidencesByPlayCategory: GetEvidencesByPlayCategory,
    private val upsertEvidence: UpsertEvidence
): ViewModel(){


    private val _state = mutable

}