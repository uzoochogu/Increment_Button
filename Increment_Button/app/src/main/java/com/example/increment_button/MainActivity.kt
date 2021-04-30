package com.example.increment_button


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0


        increment_button.setOnClickListener {
            counter++

            textview_increment.text = counter.toString()


        }
    }
}