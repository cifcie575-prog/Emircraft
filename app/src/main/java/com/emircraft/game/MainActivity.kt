package com.emircraft.game

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "EMIRCRAFT\n\nHoş Geldin!"
        text.textSize = 28f

        setContentView(text)
    }
}
