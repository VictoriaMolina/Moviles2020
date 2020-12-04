package com.example.victoria2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import kotlinx.android.synthetic.main.activity_web_service.*

class WebService : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_service)

        val url = "http://www.json-generator.com/api/json/get/cfhofhUJiW?indent=2"

        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET, url, null,
            Response.Listener { response ->
                txtRes.text = "Response: %s".format(response.toString())

            },
            Response.ErrorListener { error ->
                // TODO: Handle error
            }
        )
    }
}