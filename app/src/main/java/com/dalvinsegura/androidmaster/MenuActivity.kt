package com.dalvinsegura.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.dalvinsegura.androidmaster.firstapp.FirstAppActivity
import com.dalvinsegura.androidmaster.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnImcCalculatorApp = findViewById<Button>(R.id.btnImcCalculatorApp)
        btnSaludApp.setOnClickListener{navigateToSaludApp()}
        btnImcCalculatorApp.setOnClickListener{navigateToImcApp()}
    }

    private fun navigateToImcApp(){
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}