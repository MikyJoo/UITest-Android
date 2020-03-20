package com.example.miky.uitest

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Outline
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewOutlineProvider
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_draw_touch.*
import kotlinx.android.synthetic.main.activity_neumorphism_test.*
import java.io.File
import java.io.FileOutputStream

class NeumorphismTestActivity : AppCompatActivity() {

    var pressed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_neumorphism_test)

//        change_button.setOnClickListener {
//            if (pressed) {
//                test_button.elevation = -70F
////                test_button.translationZ = -70F
//            } else {
//                test_button.elevation = 70F
////                test_button.translationZ = 70F
//            }
//
//            pressed = !pressed
//        }




        test_button.clipToOutline = true
        test_button.outlineProvider = NmOutlineProvider(getDrawable(R.drawable.ic_star)!!)



    }


    inner class NmOutlineProvider(private var drawable: Drawable) : ViewOutlineProvider() {
        override fun getOutline(view: View?, outline: Outline?) {
//            view?.let {
//
//                Log.i("miky", "${it.width} ${it.height}")
//                Log.i("miky", "${it.left} ${it.top} ${it.right} ${it.bottom}")
//                Log.i("miky", "${it.paddingLeft} ${it.paddingTop} ${it.paddingRight} ${it.paddingBottom}")
////                Log.i("miky", "${it.paddingStart} ${it.paddingTop} ${it.paddingEnd} ${it.paddingBottom}  ")
//
////                outline?.setRoundRect(
////                    it.paddingLeft,
////                    it.paddingTop,
////                    view.width - it.paddingEnd,
////                    view.height - it.paddingBottom,
////                    200f)
//
//                outline?.set(drawable.getOutline())
//            }

            outline?.let {
                drawable.getOutline(it)
                it.alpha = 1.0f
            }
        }
    }



}

