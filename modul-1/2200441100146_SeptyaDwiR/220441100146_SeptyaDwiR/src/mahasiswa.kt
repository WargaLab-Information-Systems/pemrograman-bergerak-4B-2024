import java.util.Scanner

data class Mahasiswa(val nama: String, val nim: String, val jurusan: String)

fun main() {
    val scanner = Scanner(System.`in`)
    val daftarMahasiswa = mutableListOf<Mahasiswa>()

    println("Selamat datang di Program Pendataan Mahasiswa Baru")
    var isRunning = true

    while (isRunning) {
        println("\nMenu:")
        println("1. Tambah Mahasiswa")
        println("2. Tampilkan Data Mahasiswa")
        println("3. Keluar")

        print("Pilih menu (1/2/3): ")
        val choice = scanner.nextInt()

        when (choice) {
            1 -> tambahMahasiswa(scanner, daftarMahasiswa)
            2 -> tampilkanDataMahasiswa(daftarMahasiswa)
            3 -> {
                isRunning = false
                println("Terima kasih telah menggunakan program.")
            }
            else -> println("Pilihan tidak valid. Silakan pilih menu yang benar.")
        }
    }
}

fun tambahMahasiswa(scanner: Scanner, daftarMahasiswa: MutableList<Mahasiswa>) {
    print("Masukkan nama mahasiswa: ")
    val nama = scanner.next()

    print("Masukkan NIM mahasiswa: ")
    val nim = scanner.next()

    print("Masukkan jurusan mahasiswa: ")
    val jurusan = scanner.next()

    val mahasiswaBaru = Mahasiswa(nama, nim, jurusan)
    daftarMahasiswa.add(mahasiswaBaru)

    println("Mahasiswa berhasil ditambahkan.")
}

fun tampilkanDataMahasiswa(daftarMahasiswa: List<Mahasiswa>) {
    if (daftarMahasiswa.isEmpty()) {
        println("Belum ada data mahasiswa.")
    } else {
        println("\nData Mahasiswa:")
        for ((index, mahasiswa) in daftarMahasiswa.withIndex()) {
            println("${index + 1}. Nama: ${mahasiswa.nama}, NIM: ${mahasiswa.nim}, Jurusan: ${mahasiswa.jurusan}")
        }
    }
}
