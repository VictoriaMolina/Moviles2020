package com.example.victoria2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.*

class TimeFighter : AppCompatActivity() {

    internal lateinit var btnTapMe: Button
    internal lateinit var txtScore: TextView
    internal lateinit var txtTimeLeft: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_fighter)

        btnTapMe = findViewById(R.id.btnTapMe)
        txtScore = findViewById(R.id.txtScore)
        txtTimeLeft = findViewById(R.id.txtTimeLeft)




    }
}