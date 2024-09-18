package com.example.littlelemon

import android.graphics.Color
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var toplayout : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toplayout = findViewById(R.id.toplayout)
        toplayout.setBackgroundColor(Color.parseColor("#495E57"))
        var textview = TextView(this)
        textview.setTextColor(Color.parseColor("#F4CE14"))
        textview.text = resources.getText(R.string.little_lemon)
        toplayout.addView(textview)


    }

}