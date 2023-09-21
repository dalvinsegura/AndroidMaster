package com.dalvinsegura.androidmaster.firstapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.dalvinsegura.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
//        setContentView(R.layout.constrains_layout_lesson)

        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)



        btnStart.setOnClickListener{
            val name = etName.text.toString()
        if (name.isNotEmpty()){
        val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("EXTRA_NAME", name)
            startActivity(intent)

        }
        }

    }
}