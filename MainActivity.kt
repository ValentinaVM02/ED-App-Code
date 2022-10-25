package com.example.homescreenkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageButton
import android.widget.Switch
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLeft = findViewById<ImageButton>(R.id.button_left)
        buttonLeft.setOnClickListener {
            val intent = Intent(this, ButtonLeft::class.java)
            startActivity(intent)
        }

        val buttonMiddle = findViewById<ImageButton>(R.id.button_middle)
        buttonMiddle.setOnClickListener {
            val intent = Intent(this, ButtonMiddle::class.java)
            startActivity(intent)
        }

        val buttonRight = findViewById<ImageButton>(R.id.button_right)
        buttonRight.setOnClickListener {
            val intent = Intent(this, ButtonRight::class.java)
            startActivity(intent)
        }

        val article1 = findViewById<ImageButton>(R.id.article1)
        article1.setOnClickListener {
            val intent = Intent(this, Article1::class.java)
            startActivity(intent)
        }

        val article2 = findViewById<ImageButton>(R.id.article2)
        article2.setOnClickListener {
            val intent = Intent(this, Article2::class.java)
            startActivity(intent)
        }

        val article3 = findViewById<ImageButton>(R.id.article3)
        article3.setOnClickListener {
            val intent = Intent(this, Article3::class.java)
            startActivity(intent)
        }
    }
}