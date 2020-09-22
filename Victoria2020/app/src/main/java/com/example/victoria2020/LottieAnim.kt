package com.example.victoria2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lottie_anim.*

class LottieAnim : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lottie_anim)

        rabbitAnim.setAnimation("rabbit.json")
        rabbitAnim.loop(true)
        rabbitAnim.playAnimation()

        catAnim.setAnimation("cat.json")
        catAnim.loop(true)
        catAnim.playAnimation()
    }
}