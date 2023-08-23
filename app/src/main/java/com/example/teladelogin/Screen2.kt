package com.example.teladelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
        var tvPrincipal : TextView = findViewById(R.id.random2)
        tvPrincipal.text = Random ().nextInt(100).toString()
    }
    fun goToMain(view: View){
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    fun closeScreen(view: View){
        Toast.makeText(this, "Closing...", Toast.LENGTH_LONG).show()
        finish();
    }
}