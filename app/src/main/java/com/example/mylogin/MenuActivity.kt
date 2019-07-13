package com.example.mylogin

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_menu.*


class MenuActivity : AppCompatActivity() {

    lateinit var linearLayout: LinearLayout
    lateinit var animationDrawable: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnToast.setOnClickListener {
            val intent = Intent(this,ToastActivity::class.java)
            startActivity(intent)
        }
        linearLayout = findViewById<LinearLayout>(R.id.menu)

        // initializing animation drawable by getting background from constraint layout
        animationDrawable = linearLayout.background as AnimationDrawable

        // setting enter fade animation duration to 5 seconds
        animationDrawable.setEnterFadeDuration(5000)

        // setting exit fade animation duration to 2 seconds
        animationDrawable.setExitFadeDuration(2000)

    }

    override fun onResume() {
        super.onResume()
        if (!animationDrawable.isRunning) {
            // start the animation
            animationDrawable.start()
        }

    }


    override fun onPause() {
        super.onPause()
        if (animationDrawable != null && animationDrawable.isRunning) {
            // stop the animation
            animationDrawable.stop()
        }
    }
}
