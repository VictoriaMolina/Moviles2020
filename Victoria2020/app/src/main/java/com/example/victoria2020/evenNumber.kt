package com.example.victoria2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_even_number.*
import kotlinx.android.synthetic.main.activity_i_m_c.*

class evenNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_even_number)

        btnEnviar.setOnClickListener {
            var number =  txtNumber.text.toString().toInt()

            if((number % 2 ) ==0)
            {
                Toast.makeText(this, "El numero es par", Toast.LENGTH_LONG).show();

            } else {
                Toast.makeText(this, "El numero es impar", Toast.LENGTH_LONG).show();
            }

            if(number == 0){
                Toast.makeText(this, "El numero es cero", Toast.LENGTH_LONG).show();
            }
        }


    }
}