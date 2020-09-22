package com.example.victoria2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_even_number.*
import kotlinx.android.synthetic.main.activity_i_m_c.*

class evenNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_even_number)

        btnEnviar.setOnClickListener {
            var number =  txtNumber.text.toString().toInt()

            if(number == 0){
                Log.d("Cero", "El numero es cero")
                Toast.makeText(this, "El numero es cero", Toast.LENGTH_LONG).show();
            } else {
                if((number % 2 ) ==0)
            {
                Log.d("Par", "El numero es par")
                Toast.makeText(this, "El numero es par", Toast.LENGTH_LONG).show();

            } else {
                Log.d("Impar", "El numero es impar")
                Toast.makeText(this, "El numero es impar", Toast.LENGTH_LONG).show();
            }
            }




        }


    }
}