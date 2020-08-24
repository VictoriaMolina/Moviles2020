package com.example.victoria2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_string_and_int.*

class StringAndIntActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_string_and_int)

        btnNumbers.setOnClickListener {
            val number1 = txtNum1.text.toString().toInt()
            val number2 = txtNum2.text.toString().toInt()

            val result: Int = number1 + number2

            Toast.makeText(this, "El resultado de la suma es: $result", Toast.LENGTH_LONG).show()

            if(result >= 7){
                //imgMayor.visibility = View.VISIBLE
                imgMayor.setVisibility(View.VISIBLE)
            }else{
                imgMayor.setVisibility(View.GONE)
            }
        }
    }
}