package com.example.roomdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.roomdemo.database.Employee
import com.example.roomdemo.database.MyDatabase
import kotlinx.android.synthetic.main.activity_read.*

class ReadActivity : AppCompatActivity() {

    var mList:List<Employee>? = null
    private var adapterEmployee:AdapterEmployee ? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read)

        init()
    }

    private fun init() {
        readData()
        adapterEmployee = AdapterEmployee(this, mList!!)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = adapterEmployee
    }

    private fun readData() {

        var db = Room.databaseBuilder(this, MyDatabase::class.java, "mydb")

            .allowMainThreadQueries()
            .build()

          mList =   db.getDao().readEmployee()

    }
}