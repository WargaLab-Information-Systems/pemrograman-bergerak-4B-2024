import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Harga tiket untuk setiap jenis konser
    val hargaReguler = 100
    val hargaVIP = 200

    println("Selamat datang di penjualan tiket konser!")
    println("Harga tiket:")
    println("1. Reguler: $$hargaReguler")
    println("2. VIP: $$hargaVIP")

    // Meminta pengguna untuk memilih jenis tiket
    print("Pilih jenis tiket (1 untuk Reguler, 2 untuk VIP): ")
    val jenisTiket = scanner.nextInt()

    // Meminta pengguna untuk memasukkan jumlah tiket yang ingin dibeli
    print("Masukkan jumlah tiket yang ingin dibeli: ")
    val jumlahTiket = scanner.nextInt()

    // Menghitung total harga berdasarkan jenis tiket dan jumlah tiket
    val totalHarga = when (jenisTiket) {
        1 -> jumlahTiket * hargaReguler
        2 -> jumlahTiket * hargaVIP
        else -> {
            println("Pilihan tidak valid. Menghitung total harga tiket reguler.")
            jumlahTiket * hargaReguler
        }
    }

    // Menampilkan total harga
    println("Total harga yang harus dibayar: $$totalHarga")

    // Menutup scanner
    scanner.close()
}