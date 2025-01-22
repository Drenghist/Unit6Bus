package com.example.busschedule.ui

import android.app.Application
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.busschedule.BusScheduleApplication
import com.example.busschedule.data.AppDataContainer

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer{
            BusScheduleViewModel(busScheduleApplication().container.schedulesRepository)
        }
    }
}

/**
 * Extension function to queries for [Application] object and returns an instance of
 * [InventoryApplication].
 */
fun CreationExtras.busScheduleApplication(): BusScheduleApplication =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as BusScheduleApplication)