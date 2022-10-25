package com.example.homescreenkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast

class ButtonLeft : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_left)

        val switch1 = findViewById<Switch>(R.id.switch1)
        switch1.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked)
            {
                Toast.makeText(this@ButtonLeft, "Device Turned On.", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this@ButtonLeft, "Device Turned Off.", Toast.LENGTH_SHORT).show()
            }
        }

        val switch2 = findViewById<Switch>(R.id.switch2)
        switch2.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked)
            {
                Toast.makeText(this@ButtonLeft, "Device Turned On.", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this@ButtonLeft, "Device Turned Off.", Toast.LENGTH_SHORT).show()
            }
        }

        val switch3 = findViewById<Switch>(R.id.switch3)
        switch3.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked)
            {
                Toast.makeText(this@ButtonLeft, "Device Turned On.", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this@ButtonLeft, "Device Turned Off.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}