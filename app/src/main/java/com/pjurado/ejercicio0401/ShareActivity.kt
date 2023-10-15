package com.pjurado.ejercicio0401

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)
        val tv = findViewById<TextView>(R.id.textView)
        tv.text = intent.getStringExtra(Intent.EXTRA_TEXT)
    }
}