package com.example.victoria2020

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.messaging.FirebaseMessaging
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnHelloWorld.setOnClickListener {
            it.setBackgroundColor(Color.MAGENTA)
            btnHelloWorld.text = "Hello Romo!"
            Log.d("MyTag", "Entró al Listener")
            Toast.makeText(this, "Mi alerta", Toast.LENGTH_LONG).show()
        }

        btnNewActivity.setOnClickListener {
            Log.d("MyTag2", "Entró al segundo listener")
            val intent = Intent(this, SecondActivity::class.java).apply {

            }
            startActivity(intent)
        }

        btnStringAndInt.setOnClickListener {
            val intent = Intent(this, StringAndIntActivity::class.java).apply {
            }
            startActivity(intent)
        }

        btn_IMC.setOnClickListener {
            val intent = Intent(this, IMC::class.java).apply {
            }
            startActivity(intent)
        }

        btnFighter.setOnClickListener {
            val intent = Intent(this, TimeFighter::class.java).apply {
            }
            startActivity(intent)
        }

        btnShake.setOnClickListener {
            val intent = Intent(this, ShakeActivity::class.java).apply {
            }
            startActivity(intent)
        }

        btnPar.setOnClickListener {
            val intent = Intent(this, evenNumber::class.java).apply {
            }
            startActivity(intent)
        }

        btnLottie.setOnClickListener {
            val intent = Intent(this, LottieAnim::class.java).apply {
            }
            startActivity(intent)
        }

        btnDialogs.setOnClickListener {
            val intent = Intent(this, Dialogs::class.java).apply {
            }
            startActivity(intent)
        }

        btnWeb.setOnClickListener {
            val intent = Intent(this, WebView::class.java).apply {
            }
            startActivity(intent)
        }

        btnMap.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java).apply {
            }
            startActivity(intent)
        }

        btnQR.setOnClickListener {
            val intent = Intent(this, QReader::class.java).apply {
            }
            startActivity(intent)
        }

        btnListas.setOnClickListener {
            val intent = Intent(this, ListViewProductActivity::class.java).apply {
            }
            startActivity(intent)
        }

        btnExtra.setOnClickListener {
            val intent = Intent(this, PutExtraActivity::class.java).apply {
            }
            startActivity(intent)
        }

        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
            if (!task.isSuccessful) {
                Log.w("TAG", "Fetching FCM registration token failed", task.exception)
                return@OnCompleteListener
            }

            // Get new FCM registration token
            val token = task.result

            // Log and toast
           // val msg = getString("Mi token es", token)
            Log.d("TAG", token!!)
            Toast.makeText(baseContext, token, Toast.LENGTH_SHORT).show()
        })

        btnFire.setOnClickListener {
            val intent = Intent(this, FireBaseLogin::class.java).apply {
            }
            startActivity(intent)
        }

        btnFinal.setOnClickListener {
            val intent = Intent(this, WebService::class.java).apply {
            }
            startActivity(intent)
        }

    }
}