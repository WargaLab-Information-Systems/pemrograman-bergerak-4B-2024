package com.example.modul2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->//untuk mengatur /menyesuakian margin agar tidak tumpang tindih
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars()) //menapatkan ukuran margin
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom) //mengatur jarak atau padding
            insets
        }
    }
}