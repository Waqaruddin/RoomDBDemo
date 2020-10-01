package com.example.roomdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        button_create.setOnClickListener(this)
        button_update.setOnClickListener(this)
        button_read.setOnClickListener(this)
        button_delete.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        button_create.setOnClickListener {startActivity(Intent(this, CreateActivity::class.java))  }
        button_update.setOnClickListener {  }
        button_read.setOnClickListener {  }
        button_delete.setOnClickListener {  }

    }
}