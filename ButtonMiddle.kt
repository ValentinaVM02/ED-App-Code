package com.example.homescreenkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast

class ButtonMiddle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_middle)

        val switch4 = findViewById<Switch>(R.id.switch4)
        switch4.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked)
            {
                Toast.makeText(this@ButtonMiddle, "Device Turned On.", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this@ButtonMiddle, "Device Turned Off.", Toast.LENGTH_SHORT).show()
            }
        }

        val switch5 = findViewById<Switch>(R.id.switch5)
        switch5.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked)
            {
                Toast.makeText(this@ButtonMiddle, "Device Turned On.", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this@ButtonMiddle, "Device Turned Off.", Toast.LENGTH_SHORT).show()
            }
        }

        val switch6 = findViewById<Switch>(R.id.switch6)
        switch6.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked)
            {
                Toast.makeText(this@ButtonMiddle, "Device Turned On.", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this@ButtonMiddle, "Device Turned Off.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}