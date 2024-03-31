import java.util.Scanner

class Lapangan(val nomor: Int, var tersedia: Boolean)

fun sewaLapangan(daftarLapangan: MutableList<Lapangan>) {
    println("\n=== Daftar Lapangan Badminton ===:")
    daftarLapangan.forEachIndexed { index, lapangan ->
        val status = if (lapangan.tersedia) "Tersedia" else "Tidak Tersedia"
        println("${index + 1}. Lapangan ${lapangan.nomor} - $status")
    }

    print("Masukkan nomor lapangan yang ingin disewa: ")
    val nomorLapangan = readln().toInt()

    if (nomorLapangan in 1..daftarLapangan.size) {
        val lapanganTerpilih = daftarLapangan[nomorLapangan - 1]
        if (lapanganTerpilih.tersedia) {
            lapanganTerpilih.tersedia = false
            println("Anda telah berhasil menyewa Lapangan ${lapanganTerpilih.nomor}.")
        } else {
            println("Maaf, lapangan tersebut sudah disewa.")
        }
    } else {
        println("Nomor lapangan tidak valid.")
    }
}

fun main() {
    val jumlahLapangan = 6
    val daftarLapangan = MutableList<Lapangan>(jumlahLapangan) { Lapangan(it + 1, true) }
    val scanner = Scanner(System.`in`)

    while (true) {
        println("\n=== Penyewaan Lapangan Badminton ===")
        println("1. Sewa Lapangan")
        println("2. Lihat Daftar Lapangan")
        println("3. Keluar")

        print("Pilih menu: ")
        when (val pilihanMenu = scanner.nextLine()) {
            "1" -> sewaLapangan(daftarLapangan)
            "2" -> {
                println("\n=== Daftar Lapangan Badminton ===:")
                daftarLapangan.forEach { lapangan ->
                    val status = if (lapangan.tersedia) "Tersedia" else "Tidak Tersedia"
                    println("Lapangan ${lapangan.nomor} - $status")
                }
            }
            "3" -> {
                println("Terima kasih telah menggunakan layanan kami!")
                return
            }
            else -> println("Menu tidak valid. Silakan pilih lagi.")
        }
    }
}
