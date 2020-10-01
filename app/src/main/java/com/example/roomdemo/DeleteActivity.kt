package com.example.roomdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Room
import com.example.roomdemo.database.Employee
import com.example.roomdemo.database.MyDatabase
import kotlinx.android.synthetic.main.activity_delete.*

class DeleteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete)

        init()
    }

    private fun init() {
        button_delete.setOnClickListener {
            var id = edit_text_id.text.toString().toInt()
//            var name = edit_text_name.text.toString()
//            var email = edit_text_email.text.toString()


            var employee = Employee(id)

            var db = Room.databaseBuilder(this, MyDatabase::class.java, "mydb")

                .allowMainThreadQueries()
                .build()

            db.getDao().deleteEmployee(employee)

            Toast.makeText(this, "Deleted Successfully!", Toast.LENGTH_SHORT).show()



        }
    }
}