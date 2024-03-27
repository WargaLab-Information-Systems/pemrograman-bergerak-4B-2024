import java.util.Scanner

// Kelas untuk merepresentasikan tiket konser
class ConcertTicket(val concertName: String, val ticketPrice: Double, var quantity: Int) {
    // Fungsi untuk menghitung total harga tiket
    fun calculateTotalPrice(): Double {
        return ticketPrice * quantity
    }
}

// Fungsi untuk menampilkan daftar konser yang tersedia
fun displayConcerts() {
    println("Daftar Konser Tersedia:")
    println("1. Konser A (Rp 100.000)")
    println("2. Konser B (Rp 150.000)")
    println("3. Konser C (Rp 200.000)")
}

fun main() {
    val scanner = Scanner(System.`in`)
    var choice: Int
    var quantity: Int

    println("Selamat datang di Layanan Pemesanan Tiket Konser")

    do {
        displayConcerts()
        println("Pilih konser yang ingin Anda pesan (1-3) atau 0 untuk keluar:")
        choice = scanner.nextInt()

        if (choice in 1..3) {
            println("Masukkan jumlah tiket yang ingin Anda pesan:")
            quantity = scanner.nextInt()

            val concert = when (choice) {
                1 -> ConcertTicket("Konser A", 100000.0, quantity)
                2 -> ConcertTicket("Konser B", 150000.0, quantity)
                else -> ConcertTicket("Konser C", 200000.0, quantity)
            }

            println("Detail Pemesanan:")
            println("Konser: ${concert.concertName}")
            println("Jumlah Tiket: ${concert.quantity}")
            println("Total Harga: Rp ${concert.calculateTotalPrice()}")

            println("Pesan lagi? (y/n)")
            val option = scanner.next()

            if (option != "y") {
                println("Terima kasih telah menggunakan layanan kami.")
                break
            }
        } else if (choice != 0) {
            println("Pilihan tidak valid. Silakan pilih kembali.")
        }
    } while (choice != 0)
}
