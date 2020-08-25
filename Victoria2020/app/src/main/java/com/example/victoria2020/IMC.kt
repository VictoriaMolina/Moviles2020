package com.example.victoria2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_i_m_c.*

class IMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_i_m_c)

         btnCalcular.setOnClickListener {
             if(numPeso.text.toString().isEmpty() || numEstatura.text.toString().isEmpty()){
                 Toast.makeText(this, getString(R.string.Fill_all_the_fields), Toast.LENGTH_LONG).show()
             }else {
                 calcularMasaCorporal()
             }
         }

        }

    fun calcularMasaCorporal (){
        var peso =  numPeso.text.toString().toDouble()
        var estatura =  numEstatura.text.toString().toDouble()

        var imc = peso / (estatura * estatura)
        Log.d("MyTag2", "Estatus del paciente")

        if (imc >= 19 && imc <=24.9){
            Log.d("MyTag", "El paciente se encuentra en el peso adecuado")
            estatusPaciente.setVisibility(View.VISIBLE)
            estatusPaciente.setText("El paciente se encuentra en el peso adecuado")
        }else{
            Log.d("MyTag2", "El paciente NO se encuentra en el peso adecuado")
            estatusPaciente.setVisibility(View.VISIBLE)
            estatusPaciente.setText("El paciente NO se encuentra en el peso adecuado")
        }
    }
}