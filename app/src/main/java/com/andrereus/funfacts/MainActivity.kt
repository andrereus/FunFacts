package com.andrereus.funfacts

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val factBook = FactBook()
    private val colorWheel = ColorWheel()

    private var factTextView: TextView? = null
    private var showFactButton: Button? = null
    private var relativeLayout: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        factTextView = findViewById(R.id.factTextView)
        showFactButton = findViewById(R.id.showFactButton)
        relativeLayout = findViewById(R.id.relativeLayout)

        showFactButton!!.setOnClickListener {
            val fact = factBook.getFact()
            val color = colorWheel.getColor()

            factTextView!!.text = fact
            relativeLayout!!.setBackgroundColor(color)
            showFactButton!!.setTextColor(color)
        }
    }
}
