package com.example.miky.uitest

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewOutlineProvider
import android.widget.Button
import android.widget.FrameLayout

class NmButton @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0):
    FrameLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context).inflate(R.layout.nmview_buttton, this, true)

//        clipToOutline = true
//        outlineProvider = NmOutlineProvider()
    }

//    override fun onPreDraw(): Boolean {
//        return super.onPreDraw()
//    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        var paint = Paint()

//        paint.setXfermode(PorterDuffXfermode)
//        canvas.savel
    }
}
