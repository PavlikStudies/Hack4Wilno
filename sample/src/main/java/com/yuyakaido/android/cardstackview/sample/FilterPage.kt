package com.yuyakaido.android.cardstackview.sample

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class FilterPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.filter_page)
        val gediminas = findViewById<View>(R.id.gediminas)

        gediminas.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("filtras", SpotType.SIGHTSEEING)
            startActivity(intent)
            finish()
        }

        val barButton = findViewById<View>(R.id.bar_button)

        barButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("filtras", SpotType.NIGHTLIFE)
            startActivity(intent)
            finish()
        }

        val transferButton = findViewById<View>(R.id.cultured_button)

        transferButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("filtras", SpotType.CULTURAL)
            startActivity(intent)
            finish()
        }
    }
}