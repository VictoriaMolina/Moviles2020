package com.example.victoria2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_put_extra.*
import kotlinx.android.synthetic.main.activity_put_extra.*

class PutExtraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_put_extra)


        btnIr.setOnClickListener {
            val intent = Intent(this, DetailPutExtraActivity::class.java)
                intent.putExtra("valor", txtValor.text.toString())
                startActivity(intent)


        }

    }
}