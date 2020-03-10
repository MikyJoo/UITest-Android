package com.example.miky.uitest

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

class DrawTouchView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0):
    View(context, attrs, defStyleAttr) {

    private val paint = Paint()

    private var points = ArrayList<FloatPoint>()

    override fun onTouchEvent(event: MotionEvent): Boolean {

        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                var floatPoint = FloatPoint(event.x, event.y, true)
                points.add(floatPoint)
                invalidate()
                return true
            }

            MotionEvent.ACTION_MOVE -> {
                var floatPoint = FloatPoint(event.x, event.y, false)
                points.add(floatPoint)
                invalidate()
                return true
            }

//            MotionEvent.ACTION_UP -> {
//
//            }

        }

        return super.onTouchEvent(event)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        paint.setColor(Color.BLACK)
        paint.strokeWidth = 3F
        paint.isAntiAlias = true

        points.forEachIndexed { index, currentPoint ->
            if (!currentPoint.isStart) {
                var startPoint = points.get(index - 1)
                canvas?.drawLine(startPoint.x, startPoint.y, currentPoint.x, currentPoint.y, paint)
            }
        }
    }

    fun clear() {
        points.clear()
        invalidate()
    }
}

data class FloatPoint(
    var x: Float,
    var y: Float,
    var isStart: Boolean
)