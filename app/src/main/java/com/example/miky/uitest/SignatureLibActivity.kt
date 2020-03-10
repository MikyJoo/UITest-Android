package com.example.miky.uitest

import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_signature_lib.*
import java.io.File
import java.io.FileOutputStream

class SignatureLibActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signature_lib)

        save_button.setOnClickListener {
            saveToImage(drawtouch_view)
        }

        clear_button.setOnClickListener {
            drawtouch_view.clear()
        }

    }

    fun saveToImage(view: View) {
        var bitmap = Bitmap.createBitmap(view.width, view.height, Bitmap.Config.ARGB_8888)
        var canvas = Canvas(bitmap)
        view.draw(canvas)

        Log.i("miky", filesDir.absolutePath + "/temp.jpg")
        var file = File(filesDir.absolutePath)
        if (!file.exists()) {
            file.mkdir()
        }

        var filePath = filesDir.absolutePath + "/temp_" + System.currentTimeMillis() + ".jpg"

        bitmap.compress(Bitmap.CompressFormat.JPEG, 95, FileOutputStream(filePath))
    }
}