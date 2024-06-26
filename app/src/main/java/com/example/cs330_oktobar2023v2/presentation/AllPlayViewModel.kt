package com.example.cs330_oktobar2023v2.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.cs330_oktobar2023v2.domain.use_cases.GetEvidencesByPlayCategoryUseCase
import com.example.cs330_oktobar2023v2.domain.use_cases.UpsertEvidenceUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import androidx.compose.runtime.State
import androidx.lifecycle.viewModelScope
import com.example.cs330_oktobar2023v2.R
import com.example.cs330_oktobar2023v2.data.constants.CARS
import com.example.cs330_oktobar2023v2.data.constants.CRAYON
import com.example.cs330_oktobar2023v2.data.constants.DOLLS
import com.example.cs330_oktobar2023v2.data.constants.LEGO
import com.example.cs330_oktobar2023v2.data.constants.OTHER
import com.example.cs330_oktobar2023v2.data.constants.OUTDOOR
import com.example.cs330_oktobar2023v2.data.constants.PUZZLE
import com.example.cs330_oktobar2023v2.data.constants.TABLET
import com.example.cs330_oktobar2023v2.domain.enums.PlayCategory
import com.example.cs330_oktobar2023v2.domain.model.Evidence
import com.example.cs330_oktobar2023v2.domain.model.Play
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class AllPlayViewModel @Inject constructor (
    private val getEvidencesByPlayCategoryUseCase: GetEvidencesByPlayCategoryUseCase,
    private val upsertEvidenceUseCase: UpsertEvidenceUseCase
): ViewModel(){


    private val _state = mutableStateOf(AllPlayState())
    val state: State<AllPlayState> = _state

    private var getEvidenceByPlayTimeJob : Job? = null

    init{

        val puzzle =
        Play(
            id = 0,
            name = "PUZZLE",
            type = PlayCategory.PUZZLE,
            image = R.drawable.puzzle,
            quantity = 0,
            description = PUZZLE
            )
        _state.value = state.value.copy(
        )
        getEvidenceByPlayTimeJob?.cancel()
        getEvidenceByPlayTimeJob = getEvidencesByPlayCategoryUseCase(PlayCategory.PUZZLE).onEach {
            evidences ->
            var count = 0;
            for (evidence :Evidence in evidences){
                    count+= evidence.vreme
                }
                state.value.playItems.plus(puzzle.copy(
                    quantity = count
                ))

        }.launchIn(viewModelScope)


        val tablet =
            Play(
                id = 0,
                name = "TABLET",
                type = PlayCategory.TABLET,
                image = R.drawable.puzzle,
                quantity = 0,
                description = TABLET
            )
        _state.value = state.value.copy(
        )
        getEvidenceByPlayTimeJob?.cancel()
        getEvidenceByPlayTimeJob = getEvidencesByPlayCategoryUseCase(PlayCategory.TABLET).onEach {
                evidences ->
            var count = 0;
            for (evidence :Evidence in evidences){
                count+= evidence.vreme
            }
            state.value.playItems.plus(tablet.copy(
                quantity = count
            ))

        }.launchIn(viewModelScope)
        val outdoor =
            Play(
                id = 0,
                name = "OUTDOOR",
                type = PlayCategory.OUTDOOR,
                image = R.drawable.outdoors,
                quantity = 0,
                description = OUTDOOR
            )
        _state.value = state.value.copy(
        )
        getEvidenceByPlayTimeJob?.cancel()
        getEvidenceByPlayTimeJob = getEvidencesByPlayCategoryUseCase(PlayCategory.OUTDOOR).onEach {
                evidences ->
            var count = 0;
            for (evidence :Evidence in evidences){
                count+= evidence.vreme
            }
            state.value.playItems.plus(outdoor.copy(
                quantity = count
            ))

        }.launchIn(viewModelScope)
        val crayon =
            Play(
                id = 0,
                name = "CRAYON",
                type = PlayCategory.CRAYONS,
                image = R.drawable.crayons,
                quantity = 0,
                description = CRAYON
            )
        _state.value = state.value.copy(
        )
        getEvidenceByPlayTimeJob?.cancel()
        getEvidenceByPlayTimeJob = getEvidencesByPlayCategoryUseCase(PlayCategory.CRAYONS).onEach {
                evidences ->
            var count = 0;
            for (evidence :Evidence in evidences){
                count+= evidence.vreme
            }
            state.value.playItems.plus(crayon.copy(
                quantity = count
            ))

        }.launchIn(viewModelScope)
        val dools =
            Play(
                id = 0,
                name = "dools",
                type = PlayCategory.DOLLS,
                image = R.drawable.dolls,
                quantity = 0,
                description = DOLLS
            )
        _state.value = state.value.copy(
        )
        getEvidenceByPlayTimeJob?.cancel()
        getEvidenceByPlayTimeJob = getEvidencesByPlayCategoryUseCase(PlayCategory.DOLLS).onEach {
                evidences ->
            var count = 0;
            for (evidence :Evidence in evidences){
                count+= evidence.vreme
            }
            state.value.playItems.plus(dools.copy(
                quantity = count
            ))

        }.launchIn(viewModelScope)
        val cars =
            Play(
                id = 0,
                name = "CARS",
                type = PlayCategory.CARS,
                image = R.drawable.cars,
                quantity = 0,
                description = CARS
            )
        _state.value = state.value.copy(
        )
        getEvidenceByPlayTimeJob?.cancel()
        getEvidenceByPlayTimeJob = getEvidencesByPlayCategoryUseCase(PlayCategory.CARS).onEach {
                evidences ->
            var count = 0;
            for (evidence :Evidence in evidences){
                count+= evidence.vreme
            }
            state.value.playItems.plus(cars.copy(
                quantity = count
            ))

        }.launchIn(viewModelScope)
        val lego =
            Play(
                id = 0,
                name = "LEGO",
                type = PlayCategory.LEGO,
                image = R.drawable.lego,
                quantity = 0,
                description = LEGO
            )
        _state.value = state.value.copy(
        )
        getEvidenceByPlayTimeJob?.cancel()
        getEvidenceByPlayTimeJob = getEvidencesByPlayCategoryUseCase(PlayCategory.LEGO).onEach {
                evidences ->
            var count = 0;
            for (evidence :Evidence in evidences){
                count+= evidence.vreme
            }
            state.value.playItems.plus(lego.copy(
                quantity = count
            ))

        }.launchIn(viewModelScope)


        val other =
            Play(
                id = 0,
                name = "OTHER",
                type = PlayCategory.OTHER,
                image = R.drawable.other,
                quantity = 0,
                description = OTHER
            )
        _state.value = state.value.copy(
        )
        getEvidenceByPlayTimeJob?.cancel()
        getEvidenceByPlayTimeJob = getEvidencesByPlayCategoryUseCase(PlayCategory.OTHER).onEach {
                evidences ->
            var count = 0;
            for (evidence :Evidence in evidences){
                count+= evidence.vreme
            }
            state.value.playItems.plus(other.copy(
                quantity = count
            ))

        }.launchIn(viewModelScope)
    }

    }

