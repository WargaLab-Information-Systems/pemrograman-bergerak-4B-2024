import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val hargaBarang = mapOf(
            "Apel" to 5000,
            "Jeruk" to 7000,
            "Pisang" to 4000,
            "Alpukat" to 8000,
            "Anggur" to 11000,
    )

    println("Selamat datang di aplikasi kasir sederhana!")
    println("Daftar barang:")
    hargaBarang.forEach { (nama, harga) ->
        println("$nama - Rp. $harga")
    }

    val keranjangBelanja = mutableMapOf<String, Int>()

    var isDone = false
    while (!isDone) {
        println("Masukkan barang yang dibeli atau ketik 'selesai' untuk menyelesaikan belanjaan:")
        val inputBarang = scanner.nextLine()
        if (inputBarang.toLowerCase() == "selesai") {
            isDone = true
        } else if (hargaBarang.containsKey(inputBarang)) {
            println("Masukkan jumlah ${inputBarang.toLowerCase()}:")
            val jumlah = scanner.nextInt()
            keranjangBelanja[inputBarang] = jumlah
        } else {
            println("Barang tidak ditemukan.")
        }
    }

    var totalHarga = 0
    println("Rincian Belanja:")
    keranjangBelanja.forEach { (barang, jumlah) ->
        val harga = hargaBarang[barang] ?: 0
        val subtotal = harga * jumlah
        println("$barang x $jumlah = Rp. $subtotal")
        totalHarga += subtotal
    }

    println("Total Belanja: Rp. $totalHarga")
}