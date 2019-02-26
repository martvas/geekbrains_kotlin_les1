package com.martin.geekbrains_kotlin_les1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.btn)
        btn.setOnClickListener { Toast.makeText(this, "Button pressed", Toast.LENGTH_LONG).show() }
    }
}
