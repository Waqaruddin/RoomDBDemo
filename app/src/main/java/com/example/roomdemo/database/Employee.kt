package com.example.roomdemo.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "emp_table")
data class Employee(
    @PrimaryKey
    var id:Int,

    @ColumnInfo(name = "first_name")
    var name:String? = null,
    var email:String? = null


)