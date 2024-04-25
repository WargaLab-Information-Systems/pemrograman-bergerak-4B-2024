package com.example.modul2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //metode yang pertama dibuat ketika aktivitas dimulai, untuk mengatur semua yg diperlukan
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() //untuk menampilkan layar penuh
        setContentView(R.layout.activity_main2) //untuk menghubungkan dengan file yg sudah dibuat

        val button = findViewById<ImageView>(R.id.imageView) //mencari id imageview yang ada
        button.setOnClickListener {//agar gambar bisa di klik
            val lanjut = Intent(this, MainActivity3::class.java)
            startActivity(lanjut)
        }
    }
}