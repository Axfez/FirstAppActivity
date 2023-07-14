package com.example.firstappactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnGreetingApp = findViewById<Button>(R.id.btnGreetingApp)
        btnGreetingApp.setOnClickListener { navigateToGreetingApp() }
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        btnImcApp.setOnClickListener { navigateToImcApp() }
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToGreetingApp() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}