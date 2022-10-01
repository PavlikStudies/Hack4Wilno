package com.yuyakaido.android.cardstackview.sample

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class FilterPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.filter_page)
        val transferbutton = findViewById<View>(R.id.cultured_button)

        transferbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent)
            finish()
        }
    }
}