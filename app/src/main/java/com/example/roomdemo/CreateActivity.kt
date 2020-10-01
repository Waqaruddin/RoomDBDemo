package com.example.roomdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_create.*

class CreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        init()
    }

    private fun init() {
        button_create.setOnClickListener {
            var id = edit_text_id.text.toString().toInt()
            var name = edit_text_name.text.toString()
            var email = edit_text_email.text.toString()

            var employee = Employee(id, name, email)

            var db = Room.databaseBuilder(this, MyDatabase::class.java, "mydb")

                .allowMainThreadQueries()
                .build()

            db.getDao().addEmployee(employee)
            Toast.makeText(this, "Inserted", Toast.LENGTH_SHORT).show()
        }
    }
}