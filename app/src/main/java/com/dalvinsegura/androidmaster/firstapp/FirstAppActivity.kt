package com.dalvinsegura.androidmaster.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dalvinsegura.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_first_app)
        setContentView(R.layout.constrains_layout_lesson)
    }
}