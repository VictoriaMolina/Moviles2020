package com.example.victoria2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_put_extra.*
import kotlinx.android.synthetic.main.activity_web_service.*

class WebService : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_service)
        val url = "https://www.json-generator.com/api/json/get/ceMTwnMhVe?indent=2"
        val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(Request.Method.GET, url, Response.Listener {response ->
            txtRes.text = "La respuesta es ${response}"

            val identification = Gson().fromJson(response, Identification::class.java)

            txtRes.text = identification.nombre
            txtPaterno.text = identification.apellidoPaterno
            txtMaterno.text = identification.apellidoMaterno
            txtTipo.text = identification.tipoSangre
            txtLatitud.text = identification.latitud
            txtLongitud.text = identification.longitud


        },
            Response.ErrorListener {
                txtRes.text = "algo salio mal"
            })
        queue.add(stringRequest)

        btnDireccion.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            intent.putExtra("latitud", txtLatitud.text.toString())
            intent.putExtra("longitud", txtLongitud.text.toString())
            startActivity(intent)


        }
    }

}

