package com.example.busschedule.ui

import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.busschedule.BusScheduleApplication
import com.example.busschedule.data.AppDataContainer

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer{
            BusScheduleViewModel(BusScheduleApplication().container.schedulesRepository)
        }
    }
}