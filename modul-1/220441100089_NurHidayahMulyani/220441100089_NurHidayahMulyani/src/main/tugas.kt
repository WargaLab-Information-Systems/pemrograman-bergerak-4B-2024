import java.util.Scanner

// Data class untuk merepresentasikan informasi skincare
data class Skincare(val nama: String, val jenis: String, val tanggalPembelian: String)

fun main() {
    val scanner = Scanner(System.`in`)
    val daftarSkincare = mutableListOf<Skincare>()
    val daftarBelanja = mutableMapOf<String, Int>()

    var isRunning = true

    while (isRunning) {
        println("=== APLIKASI MANAJEMEN SKINCARE & HITUNG TOTAL BELANJA ===")
        println("1. Lihat Daftar Produk Skincare")
        println("2. Tambah barang ke daftar belanja")
        println("3. Hitung total belanja")
        println("4. Keluar")
        print("Pilih menu: ")

        when (scanner.nextInt()) {
            1 -> lihatDaftarSkincare(daftarSkincare)
            2 -> tambahBarang(scanner, daftarBelanja)
            3 -> hitungTotalBelanja(daftarBelanja)
            4 -> isRunning = false
            else -> println("Pilihan tidak valid. Silakan pilih menu yang sesuai.")
        }
    }
}

// Fungsi untuk menampilkan daftar produk skincare
fun lihatDaftarSkincare(daftarSkincare: List<Skincare>) {
    if (daftarSkincare.isEmpty()) {
        println("Daftar produk skincare kosong.")
    } else {
        println("=== DAFTAR PRODUK SKINCARE ===")
        for ((index, skincare) in daftarSkincare.withIndex()) {
            println("${index + 1}. Nama: ${skincare.nama}, Jenis: ${skincare.jenis}, Tanggal Pembelian: ${skincare.tanggalPembelian}")
        }
    }
}

fun tambahBarang(scanner: Scanner, daftarBelanja: MutableMap<String, Int>) {
    print("Masukkan nama barang: ")
    val namaBarang = scanner.next()
    print("Masukkan harga barang: ")
    val hargaBarang = scanner.nextInt()

    daftarBelanja[namaBarang] = hargaBarang

    println("$namaBarang berhasil ditambahkan ke daftar belanja.")
}

fun hitungTotalBelanja(daftarBelanja: Map<String, Int>) {
    if (daftarBelanja.isEmpty()) {
        println("Daftar belanja kosong.")
    } else {
        var total = 0
        println("=== DAFTAR BELANJA ===")
        for ((barang, harga) in daftarBelanja) {
            println("$barang: $harga")
            total += harga
        }
        println("Total belanja: $total")
    }
}
