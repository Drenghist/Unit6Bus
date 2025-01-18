package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow

interface SchedulesRepository {

    fun getAllSchedulesStream(): Flow<List<BusSchedule>>

    fun getScheduleStream(id: Int): Flow<BusSchedule?>

    suspend fun insertSchedule(schedule: BusSchedule)

    suspend fun deleteSchedule(schedule: BusSchedule)

    suspend fun updateSchedule(schedule: BusSchedule)
}