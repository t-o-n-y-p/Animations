package ru.otus.animations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loadingAnimationView = findViewById<AnimatedView>(R.id.loading)
        loadingAnimationView.setOnClickListener {
            loadingAnimationView.animateCircles()
        }
        val rippleAnimationView = findViewById<AnimatedView>(R.id.ripple)
        rippleAnimationView.setOnClickListener {
            rippleAnimationView.animateCircles()
        }
    }
}