package com.example.roomdemo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface MyDao {
    @Insert
    fun addEmployee(employee: Employee)

    @Delete
    fun deleteEmployee(employee: Employee)

    @Update
    fun updateEmployee(employee: Employee)

}