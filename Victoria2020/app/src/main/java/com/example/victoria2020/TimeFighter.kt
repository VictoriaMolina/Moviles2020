package com.example.victoria2020
//Estas son las librerías que se importan.
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.*

class TimeFighter : AppCompatActivity() {
//Variables globales o de clase.
    internal lateinit var btnTapMe: Button
    internal lateinit var txtScore: TextView
    internal lateinit var txtTimeLeft: TextView

    //Una variable de tipo countDownTime
    lateinit var countDownTimer : CountDownTimer

    //Duración total del timer en milisegundos.
    val initialCountDown : Long = 5000

    //Los intervalos del timer cada 500 milisegundos.
    val countDownInterval : Long = 500

    //Variavle de tipo mediaPlayer que se utiliza para reproducir sonidos y se inicia en null.
    private var startMusic : MediaPlayer? = null

    //Variable global para llevar el conteo del puntaje.
    var score : Int = 0

    //Función onCreate que se ejecuta cada vez que se abre la actividad.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_fighter)
        //Constantes que se utilizan para cargar las animaciones.
        val bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.bounce)
        val shakeAnimation = AnimationUtils.loadAnimation(this, R.anim.shake)

        btnTapMe = findViewById(R.id.btnTapMe)
        txtScore = findViewById(R.id.txtScore)
        txtTimeLeft = findViewById(R.id.txtTimeLeft)


        txtTimeLeft.text = ""

        //Función que inicializa timer.
        initTimer()

        //Listener del botón
        btnTapMe.setOnClickListener {
            //Manda llamar la animación del botón y la caja de texto.
            it.startAnimation(bounceAnimation)
            txtScore.startAnimation(shakeAnimation)
            //Cuando el puntaje está en 0 iniciamos el timer y el sonido game.
            if(score === 0){
                countDownTimer.start()
                startMusic = MediaPlayer.create(this, R.raw.game)
                startMusic?.start()
            }
            //Mandamos llamar la función que incrementa el score.
            incrementScore()
        }
    }
    private fun incrementScore(){
        score++
        val newScore: String = getString(R.string.score, score.toString())
        txtScore.text = newScore
    }
    private fun initTimer(){
        Log.d("EndGame", "endGame")
        //endGame()
        countDownTimer = object: CountDownTimer(initialCountDown, countDownInterval){
            override fun onTick(millisUntilFinished: Long) {
                val timeLeft : Long = millisUntilFinished / 1000
                Log.d("onTick", "onTick")
                txtTimeLeft.text = getString(R.string.time_left, timeLeft.toString())
            }
            override fun onFinish() {
                endGame()
                Log.d("EndGame", "endGame")

            }
        }
    }

    private fun endGame(){
        startMusic?.stop()
        startMusic?.release()
        startMusic = MediaPlayer.create(this, R.raw.endgame)
        startMusic?.start()
        Toast.makeText(this, getString(R.string.end_game, score.toString()), Toast.LENGTH_LONG)
            .show()
        btnTapMe.isEnabled = false
    }
}