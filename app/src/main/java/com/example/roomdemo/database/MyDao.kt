package com.example.roomdemo.database

import androidx.room.*

@Dao
interface MyDao {
    @Insert
    fun addEmployee(employee: Employee)

    @Delete
    fun deleteEmployee(employee: Employee)

    @Update
    fun updateEmployee(employee: Employee)

    @Query("select * from emp_table")
    fun readEmployee():List<Employee>

    @Query("select * from emp_table where id =  :id")
    fun readEmployeeById(id:Int): Employee

}