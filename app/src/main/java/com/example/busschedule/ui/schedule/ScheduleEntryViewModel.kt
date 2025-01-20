package com.example.busschedule.ui.schedule

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.busschedule.data.SchedulesRepository

class ScheduleEntryViewModel (private val schedulesRepository: SchedulesRepository) : ViewModel() {

    var scheduleUiState by mutableStateOf(ScheduleUiState())
        private set
}

data class ScheduleUiState(
    val scheduleDetails: ScheduleDetails = ScheduleDetails(),
    val isEntryValid: Boolean = false
)

data class ScheduleDetails(
    val id: Int = 0,
    val stopName: String = "",
    val arrivalTimeInMillis: Int = 0
)