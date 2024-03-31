import java.util.Scanner

// Kelas untuk merepresentasikan sepatu
data class Sepatu(val merek: String, val ukuran: Int, val harga: Double)

// Kelas untuk merepresentasikan stok sepatu
class StokSepatu {
    private val sepatuTersedia = mutableListOf<Sepatu>()

    // Fungsi untuk menambahkan sepatu ke dalam stok
    fun tambahSepatu(merek: String, ukuran: Int, harga: Double) {
        val sepatuBaru = Sepatu(merek, ukuran, harga)
        sepatuTersedia.add(sepatuBaru)
    }

    // Fungsi untuk menampilkan stok sepatu yang tersedia
    fun tampilkanStok() {
        println("Sepatu Tersedia:")
        sepatuTersedia.forEachIndexed { index, sepatu ->
            println("${index + 1}. Merek: ${sepatu.merek}, Ukuran: ${sepatu.ukuran}, Harga: Rp${sepatu.harga}")
        }
    }

    // Fungsi untuk melakukan pembelian sepatu
    fun beliSepatu(indeks: Int): Sepatu? {
        if (indeks in 1..sepatuTersedia.size) {
            return sepatuTersedia.removeAt(indeks - 1)
        }
        return null
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val stok = StokSepatu()

    println("Selamat datang di Toko Sepatu!")

    // Menambahkan 5 sepatu ke dalam stok
    stok.tambahSepatu("Nike", 42, 250000.0)
    stok.tambahSepatu("Adidas", 41, 200000.0)
    stok.tambahSepatu("Puma", 40, 180000.0)
    stok.tambahSepatu("New Balance", 39, 220000.0)
    stok.tambahSepatu("Reebok", 38, 190000.0)

    while (true) {
        println("1. Tambah sepatu ke stok")
        println("2. Tampilkan sepatu yang tersedia")
        println("3. Beli sepatu")
        println("4. Keluar")
        print("Masukkan pilihan Anda: ")
        val pilihan = scanner.nextInt()

        when (pilihan) {
            1 -> {
                print("Masukkan merek sepatu: ")
                val merek = readLine()!!
                print("Masukkan ukuran sepatu: ")
                val ukuran = scanner.nextInt()
                print("Masukkan harga sepatu: ")
                val harga = scanner.nextDouble()

                stok.tambahSepatu(merek, ukuran, harga)
                println("Sepatu berhasil ditambahkan ke stok.")
            }
            2 -> stok.tampilkanStok()
            3 -> {
                stok.tampilkanStok()
                print("Masukkan nomor sepatu yang ingin Anda beli (atau 0 untuk batal): ")
                val pilihanSepatu = scanner.nextInt()

                if (pilihanSepatu == 0) {
                    println("Pembelian dibatalkan.")
                } else {
                    val sepatuDibeli = stok.beliSepatu(pilihanSepatu)
                    if (sepatuDibeli != null) {
                        println("Anda telah membeli sepatu ${sepatuDibeli.merek} (Ukuran: ${sepatuDibeli.ukuran}, Harga: Rp${sepatuDibeli.harga})")
                    } else {
                        println("Pilihan tidak valid. Silakan coba lagi.")
                    }
                }
            }
            4 -> {
                println("Terima kasih telah berbelanja dengan kami!")
                break
            }
            else -> println("Pilihan tidak valid. Silakan masukkan angka antara 1 dan 4.")
        }
        println()
    }
}
