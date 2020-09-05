package com.example.victoria2020

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.AnimationUtils
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_shake.*

class ShakeActivity : AppCompatActivity() {

    private var mSensorManager: SensorManager? = null
    private var mSensorListener: ShakeEventListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shake)

        mSensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager?
        mSensorListener = ShakeEventListener()

        this.mSensorListener!!.setOnShakeListener {
            var rnd = (1..3).random()
            Log.d("randomNumber", rnd.toString());

            when(rnd){
                1 -> Picasso.get().load(R.drawable.piedra).into(imgGame) //Log.d("when", "Piedra");
                2 -> Picasso.get().load(R.drawable.papel).into(imgGame)//Log.d("when", "Papel");
                3 -> Picasso.get().load(R.drawable.tijeras).into(imgGame)//Log.d("when", "Tijeras");

            }

            val shakeAnimation = AnimationUtils.loadAnimation(this, R.anim.shake)
            imgGame.startAnimation(shakeAnimation)

        }
    }

    override fun onResume() {
        super.onResume()
        mSensorManager!!.registerListener(
            mSensorListener,
            mSensorManager!!.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
            SensorManager.SENSOR_DELAY_UI
        )

    }

    override fun onPause(){
        mSensorManager!!.unregisterListener(mSensorListener)
        super.onPause()
    }




}