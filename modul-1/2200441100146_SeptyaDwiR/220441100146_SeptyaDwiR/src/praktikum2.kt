import java.util.Scanner

class Tiket(val namaKonser: String, val harga: Int, var jumlahTiket: Int)

fun hitungTotalHarga(tiket: Tiket): Int {
    return tiket.harga * tiket.jumlahTiket
}

fun main() {
    val tiketKonser = Tiket("Konser A", 100000, 50)
    val scanner = Scanner(System.`in`)
    var beliTiket = true

    while (beliTiket) {
        println("Selamat datang di ${tiketKonser.namaKonser}")
        println("Harga Tiket: ${tiketKonser.harga} per tiket")
        println("Sisa Tiket Tersedia: ${tiketKonser.jumlahTiket}")

        print("Berapa tiket yang ingin Anda beli? ")

        // Menggunakan hasNextInt() untuk memastikan input berupa angka
        if (scanner.hasNextInt()) {
            val jumlahBeli = scanner.nextInt()

            if (jumlahBeli <= 0) {
                println("Jumlah tiket tidak valid. Silakan coba lagi.")
                continue
            }

            if (jumlahBeli > tiketKonser.jumlahTiket) {
                println("Maaf, tiket yang Anda inginkan melebihi stok yang tersedia.")
                println("Sisa Tiket Tersedia: ${tiketKonser.jumlahTiket}")
                continue
            }

            tiketKonser.jumlahTiket -= jumlahBeli
            val totalHarga = hitungTotalHarga(tiketKonser)
            println("Total Harga: $totalHarga")

            print("Ingin membeli tiket lagi? (ya/tidak): ")
            val lanjut = scanner.next()

            if (lanjut.equals("tidak", ignoreCase = true)) {
                beliTiket = false
                println("Terima kasih telah membeli tiket.")
            }
        } else {
            println("Input tidak valid. Silakan masukkan angka.")
            scanner.next() // Membuang input yang tidak valid
        }
    }
    scanner.close() // Tutup Scanner setelah selesai digunakan
}
