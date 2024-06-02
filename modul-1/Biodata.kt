class Orang(val nama: String, val usia: Int, val dewasa: Boolean) {
    fun sapa() {
        println("Halo, nama saya $nama")
        println("Saya berusia $usia tahun.")
    }
}

fun cekUsia(usia: Int): Boolean {
    return usia >= 18
}

fun main() {
    val nama = "Siti Berkah Angelika"
    val usia = 20
    val dewasa = cekUsia(usia)

    val orang = Orang(nama, usia, dewasa)
    orang.sapa()

    if (dewasa) {
        println("Anda sudah dewasa.")
    } else {
        println("Anda masih anak-anak.")
    }

    // Perulangan
    println("Menghitung dari 1 hingga 5:")
    for (i in 1..5) {
        println(i)
    }
}