package com.example.mylogin

import android.annotation.SuppressLint
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_toast.*


@SuppressLint("Registered")
class ToastActivity : AppCompatActivity() {

    lateinit var linearLayout: LinearLayout
    lateinit var animationDrawable: AnimationDrawable

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        // init constraintLayout
        linearLayout = findViewById<LinearLayout>(R.id.gameToast)

        // initializing animation drawable by getting background from constraint layout
        animationDrawable = linearLayout.background as AnimationDrawable

        // setting enter fade animation duration to 5 seconds
        animationDrawable.setEnterFadeDuration(5000)

        // setting exit fade animation duration to 2 seconds
        animationDrawable.setExitFadeDuration(2000)

        val myTxt = findViewById<TextView>(R.id.tvText)

        button1.setOnClickListener {
            Toast.makeText(this, "$$ 1 $$", Toast.LENGTH_LONG).show()
            myTxt.text = " 1 "
        }
        button2.setOnClickListener {
            Toast.makeText(this, "$$ 2 $$", Toast.LENGTH_LONG).show()
            myTxt.text = " 2 "
        }
        button3.setOnClickListener {
            Toast.makeText(this, "$$ 3 $$", Toast.LENGTH_LONG).show()
            myTxt.text = " 3 "
        }
        button4.setOnClickListener {
            Toast.makeText(this, "$$ 4 $$", Toast.LENGTH_LONG).show()
            myTxt.text = " 4 "
        }
        button5.setOnClickListener {
            Toast.makeText(this, "$$ 5 $$", Toast.LENGTH_LONG).show()
            myTxt.text = " 5 "
        }
        button6.setOnClickListener {
            Toast.makeText(this, "$$ 6 $$", Toast.LENGTH_LONG).show()
            myTxt.text = " 6 "
        }
        button7.setOnClickListener {
            Toast.makeText(this, "$$ 7 $$", Toast.LENGTH_LONG).show()
            myTxt.text = " 7 "
        }
        button8.setOnClickListener {
            Toast.makeText(this, "$$ 8 $$", Toast.LENGTH_LONG).show()
            myTxt.text = " 8 "
        }
        button9.setOnClickListener {
            Toast.makeText(this, "$$ 9 $$", Toast.LENGTH_LONG).show()
            myTxt.text = " 9 "
        }

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






