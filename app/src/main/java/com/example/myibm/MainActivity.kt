package com.example.myibm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBmi:Button
    lateinit var btnSendmoney: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmi= findViewById(R.id.btnBmi)
        btnBmi.setOnClickListener {
            val intent=Intent(this, calculateBmiactivity::class.java)
            startActivity(intent)
        }
        btnSendmoney = findViewById(R.id.btnSendmoney)
        btnSendmoney.setOnClickListener {
            val intent=Intent(this,sendMoney::class.java)
            startActivity(intent)
        }


    }
}