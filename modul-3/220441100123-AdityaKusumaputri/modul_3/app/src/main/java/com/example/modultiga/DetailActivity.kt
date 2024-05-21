package com.example.modultiga

import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView
import android.net.Uri
import java.io.ByteArrayOutputStream

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Mengambil data nama, deskripsi, dan gambar dari intent
        val getDataName = intent.getStringExtra("name")
        val getDataDescription = intent.getStringExtra("description")
        val getDataImage = intent.getIntExtra("image", 0)

        // Menghubungkan variabel dengan komponen di layout
        val playerName = findViewById<MaterialTextView>(R.id.textView13)
        val playerDescription = findViewById<MaterialTextView>(R.id.textView14)
        val playerImage = findViewById<ShapeableImageView>(R.id.imageView5)

        // Menampilkan data pemain
        playerName.text = getDataName
        playerDescription.text = getDataDescription
        playerImage.setImageResource(getDataImage)

        // Mendapatkan referensi ke tombol bagikan
        val btnShare: ImageButton = findViewById<ImageButton>(R.id.imageButton)

        // Menetapkan aksi ketika tombol bagikan diklik
        btnShare.setOnClickListener {
            // Mendapatkan drawable dari ImageView
            val drawable = playerImage.drawable

            // Jika drawable tidak null, Anda dapat mengonversinya menjadi Bitmap
            if (drawable != null) {
                val bitmap: Bitmap = (drawable as BitmapDrawable).bitmap

                // Sekarang Anda dapat menggunakan bitmap ini dalam Intent untuk dibagikan
                val sendIntent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, "$getDataName, $getDataDescription")
                    putExtra(Intent.EXTRA_STREAM, getImageUri(bitmap))
                    type = "image/*"
                }

                // Memulai aktivitas untuk memilih aplikasi untuk berbagi
                startActivity(Intent.createChooser(sendIntent, "Bagikan Konten Menggunakan:"))
            } else {
                // Tangani jika drawable null
                Toast.makeText(this, "Gambar tidak tersedia", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Fungsi untuk memeriksa apakah paket tertentu terinstal
    private fun isPackageInstalled(packageName: String): Boolean {
        return try {
            // Mencoba mendapatkan informasi paket
            packageManager.getPackageInfo(packageName, 0)
            true
        } catch (e: PackageManager.NameNotFoundException) {
            // Jika paket tidak ditemukan, kembalikan false
            false
        }
    }

    // Fungsi untuk mengonversi Bitmap menjadi Uri
    private fun getImageUri(bitmap: Bitmap): Uri {
        val bytes = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes)
        val path = android.provider.MediaStore.Images.Media.insertImage(contentResolver, bitmap, "Title", null)
        return Uri.parse(path)
    }
}
