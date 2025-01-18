package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow

class OfflineSchedulesRepository(private val scheduleDao: ScheduleDao) : SchedulesRepository {

    override fun getAllSchedulesStream(): Flow<List<BusSchedule>> = scheduleDao.getAllSchedules()

    override fun getScheduleStream(id: Int): Flow<BusSchedule?> = scheduleDao.getSchedule(id)

    override suspend fun insertSchedule(schedule: BusSchedule) = scheduleDao.insert(schedule)

    override suspend fun deleteSchedule(schedule: BusSchedule) = scheduleDao.delete(schedule)

    override suspend fun updateSchedule(schedule: BusSchedule) = scheduleDao.update(schedule)
}