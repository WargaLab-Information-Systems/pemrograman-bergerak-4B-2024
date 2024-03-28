import java.util.Scanner
fun main() {
    val program = ProgramPendaftaranK3()
    program.run()
}
class ProgramPendaftaranK3 {
    private val scanner = Scanner(System.`in`)
    fun run() {
        var isRunning = true
        while (isRunning) {
            println("===== Selamat Datang di APIK EDU =====")
            println("Silakan pilih menu:")
            println("1. Program Kompetensi K3")
            println("2. Pendaftaran Program")
            println("3. Keluar")
            print("Pilihan Anda: ")
            val pilihan = scanner.nextInt() 
            when (pilihan) {
                1 -> tampilkanProgramK3()
                2 -> daftarProgram()
                3 -> {
                    isRunning = false
                    println("Terima kasih telah menggunakan layanan kami.")
                }
                else -> println("Pilihan tidak valid. Silakan pilih lagi.")
            }
        }
    }
    private fun tampilkanProgramK3() {
        println("===== Daftar Program K3 =====")
        println("1. Petugas K3 Umum - Rp 2.9jt")
        println("2. Ahli K3 Umum - Rp 3.5jt")
        println("3. Operator K3 Migas - Rp 2.9jt")
        println("4. Pengawas K3 Migas - Rp 3.5jt")
    }
    private fun daftarProgram() {
        println("===== Pendaftaran Program K3 =====")
        println("Silakan masukkan informasi Anda:")
        scanner.nextLine()
        print("Nama: ")
        val nama = scanner.nextLine()
        print("Email: ")
        val email = scanner.nextLine()
        print("Nomor Telepon: ")
        val nomorTelepon = scanner.nextLine()
        println("Pilih Lokasi:")
        println("1. Bojonegoro, 1 April - 10 April 2024")
        println("2. Tuban, 20 April - 30 April 2024")
        var lokasi: String
        while (true) {
            print("Pilihan Lokasi: ")
            val pilihLokasi = scanner.nextInt()
            lokasi = when (pilihLokasi ) {
                1 -> "Bojonegoro, 1 April - 10 April 2024"
                2 -> "Tuban, 20 April - 30 April 2024"
                else -> {
                    println("Input tidak valid. Silakan pilih lokasi yang benar.")
                    continue
                }
            }
            break
        }
        println("Pilih Program (1-4): ")
        var pilihanProgram: Int
        while (true) {
            pilihanProgram = scanner.nextInt()
            if (pilihanProgram !in 1..4) {
                println("Input tidak valid. Silakan pilih program yang benar.")
            } else {
                break
            }
        }
        val namaProgram = when (pilihanProgram) {
            1 -> "Petugas K3 Umum"
            2 -> "Ahli K3 Umum"
            3 -> "Operator K3 Migas"
            4 -> "Pengawas K3 Migas"
            else -> ""
        }
        val biayaProgram = when (pilihanProgram) {
            1, 3 -> 2.9
            2, 4 -> 3.5
            else -> 0.0
        }
        println("Biaya Program: Rp ${String.format("%.1f", biayaProgram)}jt - $namaProgram")
        print("Apakah Anda ingin mengubah program? (Ya/Tidak): ")
        var jawaban: String
        while (true) {
            jawaban = scanner.next().toLowerCase()
            if (jawaban != "ya" && jawaban != "tidak") {
                println("Input tidak valid. Mohon jawab dengan 'Ya' atau 'Tidak'.")
            } else {
                break
            }
        }
        if (jawaban == "tidak") {
            println("===== Rincian Pendaftaran =====")
            println("Nama: $nama")
            println("Email: $email")
            println("Nomor Telepon: $nomorTelepon")
            println("Lokasi: $lokasi")
            println("Program: $namaProgram")
            println("Biaya Program: Rp ${String.format("%.1f", biayaProgram)}jt")
            println("======== ========================")
            println("Silakan lanjutkan pembayaran ke rekening Bank Mandiri 122345 an PT APIK EDU.")
            println("Terima kasih atas pendaftaran Anda!")
        } else if (jawaban == "ya") {
            println("Pilih Program Baru (1-4): ")
            var pilihanBaru: Int
            while (true) {
                pilihanBaru = scanner.nextInt()
                if (pilihanBaru !in 1..4) {
                    println("Input tidak valid. Silakan pilih program yang benar.")
                } else {
                    break
                }
            }
            val namaProgramBaru = when (pilihanBaru) {
                1 -> "Petugas K3 Umum"
                2 -> "Ahli K3 Umum"
                3 -> "Operator K3 Migas"
                4 -> "Pengawas K3 Migas"
                else -> ""
            }
            val biayaProgramBaru = when (pilihanBaru) {
                1, 3 -> 2.9
                2, 4 -> 3.5
                else -> 0.0
            }
            println("Biaya Program Baru: Rp ${String.format("%.1f", biayaProgramBaru)}jt - $namaProgramBaru")
            println("===== Rincian Pendaftaran =====")
            println("Nama: $nama")
            println("Email: $email")
            println("Nomor Telepon: $nomorTelepon")
            println("Lokasi: $lokasi")
            println("Program: $namaProgramBaru")
            println("Biaya Program: Rp ${String.format("%.1f", biayaProgramBaru)}jt")
            println("Silakan lanjutkan pembayaran ke rekening Bank Mandiri 122345 an PT APIK EDU.")
            println("Terima kasih atas pendaftaran Anda!")
        }
    }
}
