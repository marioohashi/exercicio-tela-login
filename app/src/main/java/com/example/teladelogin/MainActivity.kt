package com.example.teladelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvPrincipal : TextView = findViewById(R.id.random1)
        tvPrincipal.text = Random ().nextInt(100).toString()
    }
    fun nextScreen(view: View){
        var intent = Intent(this, Screen2::class.java)
        startActivity(intent)
        finish()
    }

    fun closeScreen(view: View){
        Toast.makeText(this, "Closing...", Toast.LENGTH_LONG).show()
        finish();
    }
}