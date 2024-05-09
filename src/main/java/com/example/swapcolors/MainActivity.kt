package com.example.swapcolors

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var box1: FrameLayout? = null
    private var box2: FrameLayout? = null
    private var swapButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        box1 = findViewById(R.id.box1)
        box2 = findViewById(R.id.box2)
        swapButton = findViewById(R.id.swapButton)

        box1!!.setBackgroundColor(Color.RED)
        box2!!.setBackgroundColor(Color.rgb(144, 238, 144))

        swapButton!!.setOnClickListener {
            val color1 = (box1!!.background as ColorDrawable).color
            val color2 = (box2!!.background as ColorDrawable).color
            box1!!.setBackgroundColor(color2)
            box2!!.setBackgroundColor(color1)
        }
    }
}
