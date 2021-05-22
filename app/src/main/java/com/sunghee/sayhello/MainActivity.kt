package com.sunghee.sayhello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSay : Button = findViewById(R.id.btnSay)
        val textSay : TextView = findViewById(R.id.textSay)

        btnSay.setOnClickListener{
            //코틀린 방식
            textSay.text = "Hello kotlin!"
            //다른 방식
            //textSay.setText("Hello kotlin!")
        }
    }
}