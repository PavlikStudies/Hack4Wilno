package com.yuyakaido.android.cardstackview.sample

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class DropPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drop_page)

        val transferbutton = findViewById<View>(R.id.car_button)

        transferbutton.setOnClickListener {
            val intent = Intent(this, FilterPage::class.java);
            startActivity(intent)
            finish()
        }
    }
}
