package com.example.victoria2020

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dialogs.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_login.view.*

class Dialogs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialogs)

        btnShow.setOnClickListener {
            val DialogView = layoutInflater.inflate(R.layout.dialog_login, null)
            val mBuilder = AlertDialog.Builder(this)
                .setView(DialogView).setTitle("Login dialog").show()

            DialogView.btnCancel.setOnClickListener {
                mBuilder.dismiss()
            }

            DialogView.btnLogin.setOnClickListener {
                val name = DialogView.txtName.text.toString()
                val email = DialogView.txtEmail.text.toString()
                val password = DialogView.txtPass.text.toString()

                txtDialog.setText("Name: ${name} \n Email: ${email} \n Password: ${password}")
                mBuilder.dismiss()
            }
        }
    }
}