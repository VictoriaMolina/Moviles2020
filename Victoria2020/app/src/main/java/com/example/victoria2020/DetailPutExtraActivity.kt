package com.example.victoria2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail_put_extra.*
import kotlinx.android.synthetic.main.activity_dialogs.*
import kotlinx.android.synthetic.main.activity_producto.*
import kotlinx.android.synthetic.main.dialog_login.view.*

class DetailPutExtraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_put_extra)

        val valor = intent.getStringExtra("valor")
        Toast.makeText(this, valor, Toast.LENGTH_LONG).show()
        txtNombre.setText(valor)


    }
}