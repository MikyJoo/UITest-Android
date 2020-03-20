package com.example.miky.uitest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        draw_touch.setOnClickListener {
            startActivity(Intent(this, DrawTouchActivity::class.java))
        }

        signature_lib.setOnClickListener {
            startActivity(Intent(this, SignatureLibActivity::class.java))
        }

        neumorphism.setOnClickListener {
            startActivity(Intent(this, NeumorphismTestActivity::class.java))
        }
    }

}
