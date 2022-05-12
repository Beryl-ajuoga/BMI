package com.example.myibm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button




class calculateBmiactivity : AppCompatActivity() {
    lateinit var btnBmi: Button
    lateinit var btnsendMoney: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_bmi)
        btnBmi=findViewById(R.id.btnBmi)

        btnBmi.setOnClickListener {
            val intent=Intent(this,sendMoney::class.java)
            startActivity(intent)
        }
        btnsendMoney = findViewById(R.id.btnsend)

        btnsendMoney.setOnClickListener {
            val intent=Intent(this,sendMoney::class.java)
            startActivity(intent)
        }

    }
}